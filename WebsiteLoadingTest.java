package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteLoadingTest {

    @Test
    public void testWebsiteLoading() {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("https://atg.world");

        // Check if the website loaded successfully
        boolean isWebsiteLoaded = driver.getTitle().contains("ATG.World");

        // Close the WebDriver
        driver.quit();

        // Assert the test result
        Assert.assertTrue("Website failed to load properly", isWebsiteLoaded);
    }
}
