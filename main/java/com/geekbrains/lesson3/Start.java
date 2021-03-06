package com.geekbrains.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Start {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        Thread.sleep(5000);
        driver.quit();

        WebDriverManager.chromedriver();
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://ya.ru");

        Thread.sleep(3000);

        driver1.get("https://afisha.ru");

        Thread.sleep(3000);

/**
        driver1.get("https://rbc.ru");
        Thread.sleep(3000);
*/

        ((JavascriptExecutor)driver1).executeScript("var elem = document.getElementById(\"adfox-433058372\");\n" +
                "  elem.remove();");

        Thread.sleep(5000);

        driver1.quit();
    }
}
