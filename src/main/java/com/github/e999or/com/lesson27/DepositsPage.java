package com.github.e999or.com.lesson27;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class DepositsPage extends AbstractPage {

    public DepositsPage clickDepositDepositsPage() throws InterruptedException {
        Actions actions = new Actions(getWebDriver());
        $(By.xpath("//span[text() = 'Вклады']")).click();
        actions.moveToElement($(By.linkText("Вклады"))).build().perform();
        $(By.linkText("Вклады")).click();
        return this;
    }

    public DepositsPage fourCheckBoxDepositsPage(Integer sizeCheckBox, List<String> dataTable) throws InterruptedException {
        Configuration.timeout = 5000;
        getWebDriver().switchTo().frame(0);
        List<String> nameCheckBox = ($$(By.xpath("//div[@class='kitt-checkbox__text']"))).texts();
        Assert.assertTrue(nameCheckBox.size() == sizeCheckBox);
        Assert.assertTrue(nameCheckBox.equals(dataTable));
        return this;
    }

    public DepositsPage checkParamOnLineTabsDepositsPage(Integer tabSize, List<String> dataTable) {
        $x(("//input[@data-test-id='checkbox_checkboxOnline'][@aria-checked='true']"));
        List<String> tabsList = $$(By.xpath("//div[@class='offered-products__block offered-products__block_header']")).texts();
        Assert.assertTrue(tabsList.size() == tabSize);
        Assert.assertTrue(tabsList.equals(dataTable));
        return this;
    }

    public DepositsPage clickCheckBoxDepositsPage() {
        ElementsCollection s = $$(".kitt-checkbox__control");
        s.get(0).click();
        s.get(1).click();
        return this;
    }

    public DepositsPage checkDepositDepositsPage(List<String> dataTable) {
        List<String> tabsList = $$(By.xpath("//div[@class='offered-products__block offered-products__block_header']")).texts();
        Assert.assertTrue(tabsList.equals(dataTable));
        return this;
    }

    public DepositsPage switchDepositPage() {
        switchTo().window(1);
        return this;
    }
}
