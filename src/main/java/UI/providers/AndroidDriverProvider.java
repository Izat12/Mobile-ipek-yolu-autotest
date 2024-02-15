package UI.providers;

import UI.configs.ConfigReader;
import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import lombok.SneakyThrows;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import javax.annotation.Nonnull;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.remote.MobileCapabilityType.DEVICE_NAME;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AndroidDriverProvider implements WebDriverProvider {

    public static AndroidDriver driver;
    private final UiAutomator2Options options = new UiAutomator2Options();
    public static final String DEVICE_N = ConfigReader.emulatorConfig.deviceName();
    public static final String PLATFORM_N = ConfigReader.emulatorConfig.platformName();
    public static final String APP = ConfigReader.emulatorConfig.app();
    public static final String PLATFORM_VER = ConfigReader.emulatorConfig.platformVersion();
    private static final String URL = "http://127.0.0.1:4723";

    @SneakyThrows
    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        options.setPlatformName(DEVICE_N)
                .setDeviceName(DEVICE_NAME)
                .setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2)
                .setPlatformVersion(PLATFORM_VER)
                // options.setUiautomator2ServerInstallTimeout(Duration.ofSeconds(2));
                // options.setCapability("uiautomator2ServerInstallTimeout", 60000);
                .setApp("C:\\Users\\kerim\\IdeaProjects\\Mobile-ipek-yolu-autotest\\src\\main\\resources\\app\\Calculator.apk");

        driver = new AndroidDriver(getServerUrl(), options);
        return driver;
    }

    public static URL getServerUrl() {
        try {
            return new URL(URL);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    private String getAbsolutePath(String filePath) {
        File file = new File(filePath);
        assertTrue(file.exists(), filePath + " not found");

        return file.getAbsolutePath();
    }
}
