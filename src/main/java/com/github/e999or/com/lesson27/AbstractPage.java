package com.github.e999or.com.lesson27;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class AbstractPage {

    public void closeCookieWarning(){
        if($(".cookie-warning__close").isDisplayed()){
            $(".cookie-warning__close").click();
        }
        else
            closeCookieWarning();
    }

    public AbstractPage chekTitleAbstract(String string) {
        $("title").shouldHave(attribute("text", string));
        return this;
    }

    public AbstractPage takeLinkAbstrct(String string) {
        $(By.linkText(string)).shouldBe(visible).click();
        return this;
    }
}
