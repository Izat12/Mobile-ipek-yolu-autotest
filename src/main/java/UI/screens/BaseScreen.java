package UI.screens;

import com.codeborne.selenide.As;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.qameta.allure.Step;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.appium.ScreenObject.screen;


@Getter
public class BaseScreen {

    public BaseScreen() {

    }

    @As("7")
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.view.ViewGroup[1]")
    @iOSXCUITFindBy(accessibility = "")
    public WebElement text7;

    @As("8")
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.widget.TextView")
    @iOSXCUITFindBy(accessibility = "")
    public WebElement text8;

    @As("plus")
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[5]/android.view.ViewGroup[4]/android.widget.TextView")
    @iOSXCUITFindBy(accessibility = "")
    public WebElement plusBtn;

    @As("Result button")
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[6]/android.view.ViewGroup[4]")
    @iOSXCUITFindBy(accessibility = "")
    public WebElement resultBtn;


    @As("Result")
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView")
    @iOSXCUITFindBy(accessibility = "")
    public WebElement result;


    @As("6")
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.view.ViewGroup[3]/android.widget.TextView")
    @iOSXCUITFindBy(accessibility = "")
    public WebElement text6;

    @As("2")
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[5]/android.view.ViewGroup[2]/android.widget.TextView")
    @iOSXCUITFindBy(accessibility = "")
    public WebElement text2;

    @As("Division button")
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.widget.TextView")
    @iOSXCUITFindBy(accessibility = "")
    public WebElement divBtn;

    @As(" Multiplication button")
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.view.ViewGroup[4]/android.widget.TextView")
    @iOSXCUITFindBy(accessibility = "")
    public WebElement multiplicationBtn;

    @Step("Сумма двух чисел")
    public void sumOfTwoNumbers() {
        $(text7).shouldBe(visible).click();
        $(plusBtn).shouldBe(visible).click();
        $(text8).shouldBe(visible).click();
        $(resultBtn).shouldBe(visible).click();
        ;
    }

    @Step(" Разность двух чисел")
    public void divisionOfTwoNumbers() {
        $(text6).shouldBe(visible).click();
        $(divBtn).shouldBe(visible).click();
        $(text2).shouldBe(visible).click();
        $(resultBtn).shouldBe(visible).click();
       screen(BaseScreen.class);
    }

    @Step(" Умножения двух чисел")
    public void multiplicationOfTwoNumbers() {
        $(text6).shouldBe(visible).click();
        $(multiplicationBtn).shouldBe(visible).click();
        $(text7).shouldBe(visible).click();
        $(resultBtn).shouldBe(visible).click();
       // screen(BaseScreen.class);
    }
}
