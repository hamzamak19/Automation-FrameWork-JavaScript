package StepDefination;

import Locators.RegisterPage;
import Utils.WebConnector;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Register extends WebConnector {

    public Properties prop = new Properties();
    public FileInputStream ip = new FileInputStream("src/main/java/config.properties");


    public Register() throws IOException {
    }


    @Given("^URL Should Open Successfully.$")
    public void OpenURL() throws IOException {

        System.out.println("------FIRST STEP");
        prop.load(ip);
        String URL = prop.getProperty("TestWebSiteURL");
        WebConnector.driver.get(URL);
    }


    @Then("^Verify User is on Home Screen.$")
    public void VerifyHomeScreen() {
        System.out.println("------SECOND  STEP");
        String Expected = "Login This page is restricted";
        String HeadingText=RegisterPage.GetHeadingText().getText();
        Assert.assertEquals(Expected,HeadingText);
    }
    @When("^User Click On Register Button.$")
    public void ClickRegisterBtn() {
        RegisterPage.RegisterButton().click();
    }

    @When("^User should be ble to Enter First name \"([^\"]*)\"$")
    public void EnterFirstName(String Name) {
        RegisterPage.GetFirstnameField().sendKeys(Name);
    }

    @When("^User should be ble to Enter Last name \"([^\"]*)\"$")
    public void EnterLastName(String LastName) {
        RegisterPage.GetLastnameField().sendKeys(LastName);

    }
    @When("^User should be ble to Enter Email \"([^\"]*)\"$")
    public void EnterEmail(String Email) {
        RegisterPage.GetEmailField().sendKeys(Email);
    }

    @When("^User should be ble to Enter Phone \"([^\"]*)\"$")
    public void EnterPhone(String Email) {
        RegisterPage.GetPhoneField().sendKeys(Email);
    }

    @When("^User should be ble to Enter Company \"([^\"]*)\"$")
    public void EnterCompany(String Company) {
        RegisterPage.GetCompanyField().sendKeys(Company);
    }

    @When("^User should be ble to Enter Address \"([^\"]*)\"$")
    public void EnterAddress(String Address) {
        RegisterPage.GetAddressField().sendKeys(Address);
    }

    @When("^User should be ble to Enter Address2 \"([^\"]*)\"$")
    public void EnterAddress2(String Address) {
        RegisterPage.GetAddress2Field().sendKeys(Address);
    }

    @When("^User should be ble to Enter City \"([^\"]*)\"$")
    public void EnterCity(String City) {
        RegisterPage.GetCityField().sendKeys(City);
    }

    @When("^User should be ble to Enter State \"([^\"]*)\"$")
    public void EnterState(String State) {
        RegisterPage.GetStateField().sendKeys(State);
    }

    @When("^User should be ble to Enter PostalCode \"([^\"]*)\"$")
    public void EnterPostalCode(String PostalCode) {
        RegisterPage.GetPostalCodeField().sendKeys(PostalCode);
    }

    @When("^User should be ble to click Country Drop Down.$")
    public void CickCountryDropDown() {
        RegisterPage.GetCountryDropDown().click();
    }

    @When("^User should be ble to Enter Mobile Number \"([^\"]*)\"$")
    public void EnterNumber(String Number) {
        RegisterPage.GetMobileNumberField().sendKeys(Number);
    }

    @When("^User should be ble to Enter Password \"([^\"]*)\"$")
    public void EnterPassword(String Password) {
        RegisterPage.GetPasswordField().sendKeys(Password);
    }

    @When("^User should be ble to Enter Confirm Password \"([^\"]*)\"$")
    public void EnterConfirmPassword(String Password) {
        RegisterPage.GetConfirmPasswordField().sendKeys(Password);
    }








}