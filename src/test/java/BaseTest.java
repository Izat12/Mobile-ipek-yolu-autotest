import UI.Listeners.AllureListener;
import UI.screens.BaseScreen;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.appium.SelenideAppium;
import com.codeborne.selenide.junit5.TextReportExtension;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;

import static io.qameta.allure.Allure.step;
@ExtendWith(AllureListener.class)
@ExtendWith(TextReportExtension.class)
@Slf4j
public class BaseTest {

   public BaseScreen baseScreen;

    @BeforeAll
    public static void setup() {
        SelenideAppium.launchApp();
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        Configuration.browserSize = null;
    }



    @AfterAll
    public static void close() {
        step("Закрыть приложение", Selenide::closeWebDriver);
    }
}
