package Locators;

import Utils.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;


public class LocatorClass {

    public static String InputField_Name ="Q";

    public static WebElement GetInputField(){
        return Wait.WaitForWebElement().until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
    }
}
