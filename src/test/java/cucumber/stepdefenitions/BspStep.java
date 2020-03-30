package cucumber.stepdefenitions;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.github.e999or.com.lesson27.AbstractPage;
import com.github.e999or.com.lesson27.DepositPage;
import com.github.e999or.com.lesson27.DepositsPage;
import com.github.e999or.com.lesson27.MainPage;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BspStep {
    AbstractPage abstractPage = new AbstractPage();
    MainPage mainPage = new MainPage();
    DepositsPage depositsPage = new DepositsPage();
    DepositPage managDeosit = new DepositPage();

    @Дано("пользователь вводит в адресную строку браузера название сайта.")
    public void openSberBank() {
        Configuration.timeout = 5000;
        mainPage.openSberBankMainPage();
    }

    @Тогда("переход осуществлен, проверяем название страницы {string}.")
    public void chekDepositTitle(String titleText) {
        abstractPage.chekTitleAbstract(titleText);
    }

    @Когда("в верхней панели меню сайта нажимаем кнопку Вклады.")
    public void clickDeposit() throws InterruptedException {
        depositsPage.clickDepositDepositsPage();
    }

    @Тогда("переход осуществлен, название страницы {string}.")
    public void inspectTitle(String titleText) {
        depositsPage.chekTitleAbstract(titleText);
    }


    @Когда("нажать на вкладку {string} .")
    public void takeDepozitLink(String nameTab) {
        abstractPage.takeLinkAbstrct(nameTab);
    }

    @Тогда("отображаются {int} чек-бокса")
    public void fourCheckBox(Integer sizeCheckBox, List<String> dataTable) throws InterruptedException {
        depositsPage.fourCheckBoxDepositsPage(sizeCheckBox, dataTable);
    }

    @Тогда("Установлен чекбокс Онлайн ,отображается {int} вкладки")
    public void ceckParamOnLineTabs(Integer tabSize, List<String> dataTable) {
        depositsPage.checkParamOnLineTabsDepositsPage(tabSize, dataTable);
    }

    @Когда("выбрать чек-боксы Хочу снять, Хочу пополнять.")
    public void clickCheckBox() {
        depositsPage.clickCheckBoxDepositsPage();
    }

    @Тогда("во вкладах остались остался только")
    public void checkDeposit(List<String> dataTable) {
        depositsPage.checkDepositDepositsPage(dataTable);
    }

    @Когда("нажать на кнопку {string} вклад Управляй.")
    public void pushButtonManag(String linkText) {
        depositsPage.takeLinkAbstrct(linkText);
        depositsPage.switchDepositPage();
    }

    @Тогда("открылось окно с названием {string}.")
    public void checkTitleName(String titleText) {
        managDeosit.chekTitleAbstract(titleText);
    }

    @Тогда("странице отображается надпись {string}.")
    public void pageHaveDeposit(String text) {
        managDeosit.pageHaveDepositDepositPage(text);
    }
}