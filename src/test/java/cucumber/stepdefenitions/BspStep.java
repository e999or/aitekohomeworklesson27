package cucumber.stepdefenitions;


import com.github.e999or.com.lesson27.Page;
import com.github.e999or.com.lesson27.DepositPage;
import com.github.e999or.com.lesson27.DepositsPage;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import java.util.List;

import static com.codeborne.selenide.Condition.attribute;

public class BspStep {

    DepositPage managDeosit = new DepositPage();

    @Тогда("открылось окно с названием {string}.")
    public void checkTitleName(String titleText) {
        managDeosit.chekTitleAbstract(titleText);
    }

    @Тогда("странице отображается надпись {string}.")
    public void pageHaveDeposit(String text) {
        managDeosit.pageHaveDeposit(text);
    }
}