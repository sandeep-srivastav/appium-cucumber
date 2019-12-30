package android;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import locators.CalculatorLocator;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Calculator_Locator_Appium_One {


    AppiumDriver<MobileElement> appiumDriver;

    @BeforeTest
    public void setCapabilities() throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("deviceName", "Moto G4 Plus");
        desiredCapabilities.setCapability("udid", "ZY223BMZ2L");

        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("platformVersion", "7.0");

        desiredCapabilities.setCapability("appPackage", "com.google.android.calculator");
        desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        try
        {
            appiumDriver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
        } catch (Exception e)
        {
            System.out.println(e.getMessage());

            System.out.println(e.getCause());
        }


    }

    @Test
    public void startCalculator() throws InterruptedException {
        System.out.println("First App Automation !!! ");

        Thread.sleep(2000);
        System.out.println("8 !!! ");
        appiumDriver.findElement(CalculatorLocator.eight).click();
        Thread.sleep(2000);
        System.out.println("plus !!! ");
        appiumDriver.findElement(CalculatorLocator.plus).click();
        Thread.sleep(2000);
        System.out.println("2 !!! ");
        appiumDriver.findElement(CalculatorLocator.two).click();

    }

    @Test
    public void processing(){
        appiumDriver.findElement(CalculatorLocator.equal).click();
    }
}
