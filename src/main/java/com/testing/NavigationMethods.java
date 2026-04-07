package com.testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;


public class NavigationMethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//        URL myurl = new URL("your_url")  //creating object for url to use.

        driver.navigate().to("https://google.com");

        Thread.sleep(3000);

        driver.navigate().to("https://www.facebook.com/");

        Thread.sleep(4000);

//        driver.navigate().back();  //for navigating to previous page

//        driver.navigate().forward();    //for navigating to forward page page

//        driver.navigate().refresh();    //to refresh the current page

        

    }
}
