package UI.providers;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.remote.AutomationName;
import lombok.SneakyThrows;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class IosDriverProvider implements WebDriverProvider {
    private static final String URL = "http://127.0.0.1:4723";
    public XCUITestOptions options = new XCUITestOptions();

    @SneakyThrows
    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        options.setAutomationName(AutomationName.IOS_XCUI_TEST)
                .setWdaLaunchTimeout(Duration.ofMinutes(10))
                .setDeviceName("iPhone 13")
                .setFullReset(false)
                .setApp(System.getProperty("user.dir") + " ");

        return new IOSDriver(getServerUrl(), options);
    }

    public static URL getServerUrl() {
        try {
            return new URL(URL);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
