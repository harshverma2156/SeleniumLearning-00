package com.testing;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

        public class IFrame {
            static void main(String[] args) throws InterruptedException {

                WebDriver driver = new ChromeDriver();
                driver.get("https://demo.automationtesting.in/Frames.html");
                driver.manage().window().maximize();
                Thread.sleep(1500);


                WebElement singleFrame = driver.findElement(By.id("singleframe"));
                driver.switchTo().frame(singleFrame);
                Thread.sleep(1500);


                driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello Frame");
                Thread.sleep(1500);


                driver.switchTo().defaultContent();

                driver.findElement(By.linkText("Iframe with in an Iframe")).click();

                WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
                driver.switchTo().frame(outerFrame);

                WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
                driver.switchTo().frame(innerFrame);

                driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Nested Frame");

                driver.switchTo().defaultContent();

                driver.quit();
            }
        }