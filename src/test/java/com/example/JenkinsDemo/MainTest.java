package com.example.JenkinsDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainTest {

    public WebDriver driver;

    @BeforeAll
    public static void setupDriver() {
        WebDriverManager.firefoxdriver().setup();
    }

    @BeforeEach
    void Setup() {
        driver = new FirefoxDriver();
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }



}
