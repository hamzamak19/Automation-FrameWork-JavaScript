package Utils;


import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class WebConnector {
    public static Properties prop = new Properties();
    public static FileInputStream ip;

    static {
        try {
            ip = new FileInputStream("src\\test\\resources\\config.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public  WebConnector() throws IOException {

    }

    public static WebDriver Driver() throws IOException {
        prop.load(ip);

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        String Browser = prop.getProperty("browser");
        System.out.println("Browser type = "+Browser);
        if (Browser.equals("headless"))
        {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            options.addArguments("headless");
            ChromeDriver driver = new ChromeDriver(options);
            return driver;
        }
        else {

            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            ChromeDriver driver = new ChromeDriver(options);
            return driver;
        }

    }

}
