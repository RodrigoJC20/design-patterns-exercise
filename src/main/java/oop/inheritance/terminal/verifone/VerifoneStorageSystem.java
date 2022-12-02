package oop.inheritance.terminal.verifone;

import oop.inheritance.interfaces.StorageSystem;

import java.util.Properties;

public class VerifoneStorageSystem implements StorageSystem {
    private final Properties properties = new Properties();

    @Override
    public void save(String key, String value) {
        this.properties.setProperty(key, value);
    }

    @Override
    public String get(String key) {
        return this.properties.getProperty(key);
    }
}
