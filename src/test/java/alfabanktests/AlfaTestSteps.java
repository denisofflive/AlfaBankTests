package alfabanktests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Allure;
import io.qameta.allure.Owner;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.sleep;
import static io.qameta.allure.Allure.step;

@Owner("Денисов Денис")
@DisplayName("Проверка вкладок на сайте Альфабанк")

public class AlfaTestSteps {

    @Test
    public void testLambdaAlfabanksSteps() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        Configuration.browserSize = "1920x1080";

        step("Открыть сайт Альфабанк", () -> {
            open("https://alfabank.ru/");
        });
        step("Открыть вкладку Карты и проверить текст Карты", () -> {
            $(byText ("Карты")).click();
            $("body").shouldHave(Condition.text("Карты"));
        });
        step("Вернуться обратно", () -> {
            Selenide.back();
        });
        step("Открыть вкладку Вклады и проверить текст Вклады", () -> {
            $(byText ("Вклады")).click();
            $("body").shouldHave(Condition.text("Вклады"));
        });
        step("Вернуться обратно", () -> {
            Selenide.back();
        });
        step("Открыть вкладку Кредиты и проверить текст Кредиты", () -> {
            $(byText ("Кредиты")).click();
            $("body").shouldHave(Condition.text("Кредиты"));
        });
        step("Вернуться обратно", () -> {
            Selenide.back();
        });
        step("Открыть вкладку Ипотека и проверить текст Ипотека", () -> {
            $(byText ("Ипотека")).click();
            $("body").shouldHave(Condition.text("Ипотека"));
        });
        step("Вернуться обратно", () -> {
            Selenide.back();
        });
        step("Открыть вкладку Инвестиции и проверить текст Инвестиции", () -> {
            $(byText ("Инвестиции")).click();
            $("body").shouldHave(Condition.text("Инвестиции"));
        });
        step("Вернуться обратно", () -> {
            Selenide.back();
        });
        step("Открыть вкладку Ещё, выбрать Самозанятые и проверить текст Самозанятые", () -> {
            $("a[title='Ещё']").click();
            $(byText ("Самозанятые")).click();
            $("body").shouldHave(Condition.text("Самозанятые"));
        });

        Allure.addAttachment("Page Source", "text/html", WebDriverRunner.source(), "html");

        sleep(2000);

    }

}
