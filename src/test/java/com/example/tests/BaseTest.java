package com.example.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.TestInstance;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class BaseTest {

    @AfterAll
    public void generateEnv() {
        var resultDir = System.getProperty("allure.results.directory", "target/allure-results");

        Properties props = new Properties();
        props.setProperty("Browser", Env.BROWSER.getValue());
        props.setProperty("URL", Env.URL.getValue());

        try (FileOutputStream fos = new FileOutputStream(resultDir + "/environment.properties")) {
            props.store(fos, "See wiki");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
