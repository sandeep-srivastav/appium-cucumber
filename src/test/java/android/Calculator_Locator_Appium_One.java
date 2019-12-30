package android;

import gherkin.lexer.Th;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import locators.CalculatorLocator;
import org.openqa.selenium.By;
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
        appiumDriver.findElement(CalculatorLocator.eight_btn).click();
        Thread.sleep(2000);
        System.out.println("plus !!! ");
        appiumDriver.findElement(CalculatorLocator.plus_btn).click();
        Thread.sleep(2000);
        System.out.println("2 !!! ");
        appiumDriver.findElement(CalculatorLocator.two_btn).click();

    }

    @Test
    public void processing() throws InterruptedException {
        appiumDriver.findElement(CalculatorLocator.equal_btn).click();
        Thread.sleep(2000);
    }


    public void enterInout(String input) throws InterruptedException {

        Character digit;
        for(int i=0; i<input.length(); i++){

             digit = input.charAt(i);
             Thread.sleep(2000);
             selectDigitInCaclulator(digit);
        }
    }

    public void selectDigitInCaclulator(Character digit){

        if(digit.toString().equals("1")){
            appiumDriver.findElement(CalculatorLocator.one_btn).click();
        }
        else if (digit.toString().equals("2")){
            appiumDriver.findElement(CalculatorLocator.two_btn).click();
        }
        else if (digit.toString().equals("3")){
            appiumDriver.findElement(CalculatorLocator.three_btn).click();
        }
        else if (digit.toString().equals("4")){
            appiumDriver.findElement(CalculatorLocator.four_btn).click();
        }
        else if (digit.toString().equals("5")){
            appiumDriver.findElement(CalculatorLocator.five_btn).click();
        }
        else if (digit.toString().equals("6")){
            appiumDriver.findElement(CalculatorLocator.six_btn).click();
        }
        else if (digit.toString().equals("7")){
            appiumDriver.findElement(CalculatorLocator.seven_btn).click();
        }
        else if (digit.toString().equals("8")){
            appiumDriver.findElement(CalculatorLocator.eight_btn).click();
        }
        else if (digit.toString().equals("9")){
            appiumDriver.findElement(CalculatorLocator.nine_btn).click();
        }
        else if (digit.toString().equals("0")){
            appiumDriver.findElement(CalculatorLocator.ten_btn).click();
        }
    }

    public void selectOperation(String opName) throws InterruptedException {

        Thread.sleep(2000);
        if(opName.contains("add") || opName.contains("plus")){
            appiumDriver.findElement(CalculatorLocator.plus_btn).click();
        }
        else if(opName.contains("minus") || opName.contains("subs")){
            appiumDriver.findElement(CalculatorLocator.minus_btn).click();
        }
        else if(opName.contains("mul")){
            appiumDriver.findElement(CalculatorLocator.multiply_btn).click();
        }
        else if(opName.contains("div")){
            appiumDriver.findElement(CalculatorLocator.divide_btn).click();
        }
    }
}
