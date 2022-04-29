package alfabanktests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Allure;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AlfaTest {

    @Test
    void testAlfa() {

        SelenideLogger.addListener("allure", new AllureSelenide());
        Configuration.browserSize = "1920x1080";

        open("https://alfabank.ru/");
        $(byText ("Карты")).click();
        $("body").shouldHave(Condition.text("Карты"));
        Selenide.back();
        $(byText ("Вклады")).click();
        $("body").shouldHave(Condition.text("Вклады"));
        Selenide.back();
        $(byText ("Кредиты")).click();
        $("body").shouldHave(Condition.text("Кредиты"));
        Selenide.back();
        $(byText ("Ипотека")).click();
        $("body").shouldHave(Condition.text("Ипотека"));
        Selenide.back();
        $(byText ("Инвестиции")).click();
        $("body").shouldHave(Condition.text("Инвестиции"));
        Selenide.back();
        $("a[title='Ещё']").click();
        $(byText ("Самозанятые")).click();
        $("body").shouldHave(Condition.text("Самозанятые"));

        Allure.addAttachment("Page Source", "text/html", WebDriverRunner.source(), "html");


        sleep(2000);

    }
}
