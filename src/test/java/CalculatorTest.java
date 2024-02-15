
import UI.screens.BaseScreen;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static UI.constants.Common.*;
import static com.codeborne.selenide.appium.ScreenObject.screen;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest extends BaseTest {

    @BeforeEach
    public void startDriver() {
        baseScreen = screen(BaseScreen.class);

    }

    @Test
    @Tag(ANDROID)
    @DisplayName("Сумма двух чисел")
    public void plusTwoNumbersTest() {
        baseScreen.sumOfTwoNumbers();

        assertAll(
                () -> assertEquals(EXPECTED_RESULT, baseScreen.result.getText()),
                () -> assertTrue(baseScreen.result.isDisplayed()));
    }

    @Test
    @Tag(ANDROID)
    @DisplayName("Деление двух чисел")
    public void divisionOfTwoNumbersTest() {
        baseScreen.divisionOfTwoNumbers();

        assertAll(
                () -> assertTrue(baseScreen.result.isDisplayed()),
                () -> assertEquals(EXPECTED_MULTI, baseScreen.result.getText()));
    }

    @Test
    @Tag(ANDROID)
    @DisplayName("Умножение двух чисел")
    public void multiplicationOfTwoNumbersTest() {
        baseScreen.multiplicationOfTwoNumbers();

        assertAll(
                () -> assertTrue(baseScreen.result.isDisplayed()),
                () -> assertEquals(EXPECTED_RES, baseScreen.result.getText()));
    }
}
