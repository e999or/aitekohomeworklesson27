package cucumber.stepdefenitions;

import com.github.e999or.com.lesson27.Page;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

public class PageSteps {

    Page page = new Page();

    @Тогда("переход осуществлен, проверяем название страницы {string}.")
    public void chekDepositTitle(String titleText) {
        page.chekTitleAbstract(titleText);
        page.closeCookieWarning();
    }

    @Когда("нажать на вкладку {string} .")
    public void takeDepozitLink(String nameTab) {
        page.takeLinkAbstrct(nameTab);
    }

}
