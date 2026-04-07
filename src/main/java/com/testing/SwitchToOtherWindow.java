package com.testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SwitchToOtherWindow {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://Google.com");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver,
                Duration.ofSeconds(10));
        String id = driver.getWindowHandle();
        System.out.println(id);
        wait.until(ExpectedConditions.titleContains("Google"));
        Thread.sleep(1500);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://amazon.com");

        Thread.sleep(2000);
        driver.switchTo().window(id);
    }
}

/* First we navigated to one website
then we used explicit wait until website is loaded completely and also added
1500 ms wait.
then used a method to navigate to other website in other window.
then we get the tab id from "driver.getWindowHandle()".
then we used switch method to switch to other window using window id.

 */