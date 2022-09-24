package org.example.stepDefinition;
import io.cucumber.java.After;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {
    //Define before and after annotation for your driver

    public static WebDriver driver= null;
    @Before
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");


    }

    @After
    public void close_browser(){

        driver.quit();
    }

}
