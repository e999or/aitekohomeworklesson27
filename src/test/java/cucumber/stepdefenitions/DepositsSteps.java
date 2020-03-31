package cucumber.stepdefenitions;

import com.github.e999or.com.lesson27.DepositsPage;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import java.util.List;

public class DepositsSteps {

    DepositsPage depositsPage = new DepositsPage();

    @Когда("в верхней панели меню сайта нажимаем кнопку Вклады.")
    public void clickDeposit() throws InterruptedException {
        depositsPage.clickDepositDepositsP();
    }

    @Тогда("переход осуществлен, название страницы {string}.")
    public void inspectTitle(String titleText) {
        depositsPage.chekTitleAbstract(titleText);
    }

    @Тогда("отображаются {int} чек-бокса")
    public void fourCheckBox(Integer sizeCheckBox, List<String> dataTable) throws InterruptedException {
        depositsPage.fourCheckBoxDepositsP(sizeCheckBox, dataTable);
    }

    @Тогда("Установлен чекбокс Онлайн ,отображается {int} вкладки")
    public void ceckParamOnLineTabs(Integer tabSize, List<String> dataTable) {
        depositsPage.checkParamDepositsP(tabSize, dataTable);
    }

    @Когда("выбрать чек-боксы Хочу снять, Хочу пополнять.")
    public void clickCheckBox() {
        depositsPage.clickCheckBoxDepositsP();
    }

    @Тогда("во вкладах остались остался только")
    public void checkDeposit(List<String> dataTable) {
        depositsPage.checkDepositDepositsP(dataTable);
    }

    @Когда("нажать на кнопку {string} вклад Управляй.")
    public void pushButtonManag(String linkText) {
        depositsPage.takeLinkAbstrct(linkText);
        depositsPage.switchDepositP();
    }
}
