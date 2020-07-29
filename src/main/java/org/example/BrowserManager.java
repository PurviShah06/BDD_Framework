package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BrowserManager  extends  MyUtils{
    LoadProp loadProp =new LoadProp();
    public  void setBrowser()//Method for Open HomePage
    {
        //setting up Chromedriver path
        //String browser = "chrome";
        if (loadProp.getProperty("browser").equalsIgnoreCase("chrome"))
        {

            System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\Browser Drivers\\chromedriver.exe");
            //Create ChromeDriver object to open Google Chrome Browser
            driver = new ChromeDriver();
            //open Url by using TestdataConfig.properties
            driver.get(loadProp.getProperty("Url"));

        } else if (loadProp.getProperty("browser").equalsIgnoreCase("Firefox"))
        {
            //Open Firefox .Exe
            System.setProperty("webdriver.gecko.driver", "src\\test\\Resources\\Browser Drivers\\geckodriver.exe");
            //Create geckodriver object to open FireFox Browser
            driver = new FirefoxDriver();
            //open Url by using TestdataConfig.properties
            driver.get(loadProp.getProperty("Url"));

        } else if (loadProp.getProperty("browser").equalsIgnoreCase("IE"))
        {
            //Open IE.Exe
            System.setProperty("webdriver.ie.driver","src\\test\\Resources\\Browser Drivers\\IEDriverServer.exe");
            DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
            capabilities.setCapability("ignoreZoomSetting", true);
            //Create object of IEDriver to open IE Browser
            driver = new InternetExplorerDriver();
            //open Url by using TestdataConfig.properties
            driver.get(loadProp.getProperty("Url"));

        }else{
           System.out.println("Browser Not Open.... Try Again");
        }
        //window maximize
         driver.manage().window().maximize();

        //default implicit wait for 30 sec to driver instance
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
    }
    public  void closeApplication(){
        driver.close();//Close Application
    }

}
