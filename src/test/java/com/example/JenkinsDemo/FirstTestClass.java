package com.example.JenkinsDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTestClass extends MainTest {

    @Test
    void openGoogle() {

        driver.get("https://www.youtube.com.tr/");

        Assertions.assertTrue(driver.getTitle().contains("YouTube"));

    }

}
