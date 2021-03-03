package Locators;

import Utils.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegisterPage {

   public static String RegisterButton_Xpath="//*[@id=\"header\"]/div/ul/li[3]/a";
   public static String LoginHeading_Xpath="//*[@id=\"main-body\"]/div/div/div[1]/div/div[1]/h1";
   public static String FirstName_ID="inputFirstName";
   public static String LastName_ID="inputLastName";
   public static String Email_ID="inputEmail";
   public static String PhoneField_ID="inputPhone";
   public static String CompanyName_ID="inputCompanyName";
   public static String AddressField_ID="inputAddress1";
   public static String AddressField2_ID="inputAddress2";
   public static String CityField_ID="inputCity";
   public static String StateField_ID="stateinput";
   public static String PostalCodeField_ID="inputPostcode";
   public static String SelectCountry_ID="inputCountry";
   public static String MobileNumber_ID="customfield2";
   public static String PasswordField_ID="inputNewPassword1";
   public static String ConfrmPasswordField_ID="inputNewPassword2";






   public static WebElement GetHeadingText()
   {
       return Wait.WaitForWebElement().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LoginHeading_Xpath)));
   }

   public static WebElement RegisterButton()
   {
       return Wait.WaitForWebElement().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(RegisterButton_Xpath)));
   }

    public static WebElement GetFirstnameField()
   {
       return Wait.WaitForWebElement().until(ExpectedConditions.visibilityOfElementLocated(By.id(FirstName_ID)));
   }
   public static WebElement GetLastnameField()
   {
       return Wait.WaitForWebElement().until(ExpectedConditions.visibilityOfElementLocated(By.id(LastName_ID)));
   }
    public static WebElement GetEmailField()
    {
        return Wait.WaitForWebElement().until(ExpectedConditions.visibilityOfElementLocated(By.id(Email_ID)));
    }
   public static WebElement GetPhoneField()
   {
       return Wait.WaitForWebElement().until(ExpectedConditions.visibilityOfElementLocated(By.id(PhoneField_ID)));
   }
    public static WebElement GetCompanyField()
   {
       return Wait.WaitForWebElement().until(ExpectedConditions.visibilityOfElementLocated(By.id(CompanyName_ID)));
   }
 public static WebElement GetAddressField()
   {
       return Wait.WaitForWebElement().until(ExpectedConditions.visibilityOfElementLocated(By.id(AddressField_ID)));
   }

 public static WebElement GetAddress2Field()
   {
       return Wait.WaitForWebElement().until(ExpectedConditions.visibilityOfElementLocated(By.id(AddressField2_ID)));
   }
 public static WebElement GetCityField()
   {
       return Wait.WaitForWebElement().until(ExpectedConditions.visibilityOfElementLocated(By.id(CityField_ID)));
   }
 public static WebElement GetStateField()
   {
       return Wait.WaitForWebElement().until(ExpectedConditions.visibilityOfElementLocated(By.id(StateField_ID)));
   }
 public static WebElement GetPostalCodeField()
   {
       return Wait.WaitForWebElement().until(ExpectedConditions.visibilityOfElementLocated(By.id(PostalCodeField_ID)));
   }
 public static WebElement GetCountryDropDown()
   {
       return Wait.WaitForWebElement().until(ExpectedConditions.visibilityOfElementLocated(By.id(SelectCountry_ID)));
   }
 public static WebElement GetMobileNumberField()
   {
       return Wait.WaitForWebElement().until(ExpectedConditions.visibilityOfElementLocated(By.id(MobileNumber_ID)));
   }
   public static WebElement GetPasswordField()
   {
       return Wait.WaitForWebElement().until(ExpectedConditions.visibilityOfElementLocated(By.id(PasswordField_ID)));
   }
   public static WebElement GetConfirmPasswordField()
   {
       return Wait.WaitForWebElement().until(ExpectedConditions.visibilityOfElementLocated(By.id(ConfrmPasswordField_ID)));
   }



}
