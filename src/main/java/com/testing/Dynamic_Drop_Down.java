package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Dynamic_Drop_Down {
    public void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.findElement(By.id("search")).sendKeys("car");

        List<WebElement> list = driver.findElements(By.xpath("//li"));

        for (WebElement item : list) {
            if (item.getText().contains("car travel")) {
                item.click();
                break;
            }
        }
    }
}
