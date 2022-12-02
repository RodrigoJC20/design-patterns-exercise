package oop.inheritance.terminal.ingenico;

import oop.inheritance.interfaces.StorageSystem;

import java.util.Properties;

public class IngenicoStorageSystem implements StorageSystem {
    private final Properties properties = new Properties();

    public IngenicoStorageSystem() {
    }

    public void save(String key, String value) {
        this.properties.setProperty(key, value);
    }

    public String get(String key) {
        return this.properties.getProperty(key);
    }
}
