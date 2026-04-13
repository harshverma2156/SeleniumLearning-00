package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import java.util.List;

public class Auto_Suggestion_Drop_Down_Dynamic {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        driver.findElement(By.id("search")).sendKeys("ban");

        // capture suggestions
        List<WebElement> list = driver.findElements(By.xpath("//li"));

        for (WebElement item : list) {
            String text = item.getText();

            if (text.contains("Bangalore")) {
                item.click();
                break;
            }
        }
    }
}