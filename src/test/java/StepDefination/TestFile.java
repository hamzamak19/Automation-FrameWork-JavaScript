package StepDefination;
import Locators.LocatorClass;
import Utils.Wait;
import Utils.WebConnector;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import static Utils.WebConnector.Driver;

import static io.restassured.RestAssured.given;


public class TestFile extends WebConnector{

    public TestFile() throws IOException {

    }

    public Properties prop = new Properties();
    public FileInputStream ip= new FileInputStream("src\\test\\resources\\config.properties");


    @When("^Wait for Seconds \"([^\"]*)\".$")
    public static void WaitForSeconds(String time) throws IOException, InterruptedException {
        System.out.println("Waiting for "+time+" Seconds.");
        Wait.waitfor(time);
    }

    @Given("^This is First Feature Line \"([^\"]*)\".$")
    public void TestMethod(String Parameter) throws IOException {

    prop.load(ip);

        System.out.println("Parameter = "+Parameter);
        System.out.println("Executing First Feature Line...");
        Allure.step("First Feature Line");
       String BaseURL= prop.getProperty("BaseURL");
       String ID= prop.getProperty("CUSTOMER_ID");
       String Password= prop.getProperty("Password");
       String AccountNo= prop.getProperty("AccountNo");

       System.out.println("Read property = "+ ID);
       System.out.println("Read property = "+ BaseURL);
       System.out.println("Read property = "+ Password);
       System.out.println("Read property = "+ AccountNo);

            given().
                    when().
                    get(BaseURL+"CUSTOMER_ID="+ID+"&PASSWORD="+Password+"!&Account_No="+AccountNo)
                    .then().log().body();

            System.out.println("Case Executed.");

    }

    @Given("^Open URL \"([^\"]*)\".$")
    public void OpenURL(String Parameter) throws IOException {

        prop.load(ip);
        WebConnector.driver.get(Parameter);

        System.out.println("Parameter = "+Parameter);
        Allure.step("First Feature Line");
        System.out.println("Case Executed.");
        LocatorClass.GetInputField().sendKeys("Nazoor Ahmed");

    }

    @When("^This is Second Feature Line.$")
    public void GetStatusCode() throws IOException {

        prop.load(ip);
        String BaseURL= prop.getProperty("BaseURL");
        String ID= prop.getProperty("CUSTOMER_ID");
        String Password= prop.getProperty("Password");
        String AccountNo= prop.getProperty("AccountNo");

        given().
                when().
                get(BaseURL+"CUSTOMER_ID="+ID+"&PASSWORD="+Password+"&Account_No="+AccountNo)
                .then()
                .assertThat().statusCode(200);

        Allure.step("Print Allure Step");
        System.out.println("Case Executed.");
    }

    @When("^This is Third Feature Line.$")
    public void getParameters() throws IOException {
        prop.load(ip);
        String BaseURL= prop.getProperty("BaseURL");
        String ID= prop.getProperty("CUSTOMER_ID");
        String Password= prop.getProperty("Password");
        String AccountNo= prop.getProperty("AccountNo");

        given().
                when()
                .queryParam("CUSTOMER_ID" ,ID)
                .queryParam("PASSWORD" ,Password)
                .queryParam("Account_No" ,AccountNo)
                .get("http://demo.guru99.com/V4/sinkministatement.php")
                .then().log().all();

        System.out.println("Case Executed.");

    }

}
