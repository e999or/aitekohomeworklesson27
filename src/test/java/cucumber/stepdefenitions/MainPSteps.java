package cucumber.stepdefenitions;

import com.codeborne.selenide.Configuration;
import com.github.e999or.com.lesson27.MainPage;
import io.cucumber.java.ru.Дано;

public class MainPSteps {

    MainPage mainPage = new MainPage();

    @Дано("пользователь вводит в адресную строку браузера название сайта.")
    public void openSberBank() {
        Configuration.timeout = 5000;
        mainPage.openSberBankMP();
    }
}
