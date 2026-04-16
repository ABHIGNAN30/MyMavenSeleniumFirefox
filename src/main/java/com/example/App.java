package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class App {
    public static void main(String[] args) {

        // ✅ Set GeckoDriver path
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");

        // ✅ Firefox options
        FirefoxOptions options = new FirefoxOptions();

        // 👉 IMPORTANT (Jenkins / no GUI)
        options.addArguments("--headless");

        // ✅ Start browser
        WebDriver driver = new FirefoxDriver(options);

        // ✅ Open website
        driver.get("https://google.com");

        // ✅ Print title (to confirm working)
        System.out.println("Title: " + driver.getTitle());

        // ✅ Close browser
        driver.quit();
    }
}
