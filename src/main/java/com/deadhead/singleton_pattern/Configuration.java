package com.deadhead.singleton_pattern;

public class Configuration {

    private static Configuration configuration;

    private static String configurationParam;

    private Configuration() {

    }

    public static synchronized Configuration getInstance(String configParam) {
        if (configuration == null) {
            configuration = new Configuration();
            configurationParam = configParam;
        }
        return configuration;
    }

    public static String getConfigurationParam() {
        return configurationParam;
    }

}
