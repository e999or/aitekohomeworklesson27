package com.github.e999or.com.lesson27;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

public class MainPage {
    public MainPage openSberBankMP() {
        Selenide.open("https://www.sberbank.ru");
        return this;
    }
}
