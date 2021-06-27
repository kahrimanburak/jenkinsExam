package com.example.JenkinsDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainTest {

    private WebDriver driver;

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
        //driver.quit();
    }

    @Test
    void openGoogle() {

    driver.get("https://www.youtube.com.tr/");

    Assertions.assertTrue(driver.getTitle().contains("YouTube"));

    }

}
