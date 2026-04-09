package com.testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class PrintingAllWindowTitle {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("Google"));

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://amazon.com");

        wait.until(ExpectedConditions.titleContains("Amazon"));

        Set<String> windows = driver.getWindowHandles();

        for (String win : windows) {
            driver.switchTo().window(win);
            System.out.println(driver.getTitle());
        }
    }
}
