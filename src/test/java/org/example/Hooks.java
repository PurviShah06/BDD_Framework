package org.example;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;


public class Hooks extends  MyUtils {
    BrowserManager browserManager = new BrowserManager();

@Before
     public void openBrowser(){
     browserManager.setBrowser();
}
@After
    public void closeBrowser() {
       browserManager.closeApplication();

    }
}