package com.github.e999or.com.lesson27;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;

public class DepositPage extends AbstractPage{

    public DepositPage pageHaveDepositDepositPage(String string) {
        $(".kit-heading").shouldHave(attribute("innerText", string));
        return this;
    }
}
