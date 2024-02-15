package UI.configs;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "file:src/main/resources/configs/emulator.properties",
})
public interface EmulatorConfig extends Config {

    @Key("deviceName")
    String deviceName();

    @org.aeonbits.owner.Config.Key("platformName")
    String platformName();

    @Key("appPackage")
    String appPackage();

    @Key("appActivity")
    String appActivity();

    @Key("app")
    String app();

    @Key("remoteURL")
    String remoteURL();

    @Key("platformVersion")
    String platformVersion();
}
