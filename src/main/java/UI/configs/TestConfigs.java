package UI.configs;

import org.aeonbits.owner.Config;
@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties", //читаем env
        "file:src/main/resources/configs/test.properties", //читаем из файла
})
public interface TestConfigs extends Config {

    @Key("updateScreenshots")
    @DefaultValue("false")
    boolean isScreenshotsNeedToUpdate();

    @Key("deviceHost")
    String deviceHost();
}
