package UI.configs;

import org.aeonbits.owner.ConfigFactory;

public class ConfigReader {

    public static final EmulatorConfig emulatorConfig = ConfigFactory.create(EmulatorConfig.class, System.getProperties());
    public static final TestConfigs testConfig = ConfigFactory.create(TestConfigs.class, System.getProperties());
}
