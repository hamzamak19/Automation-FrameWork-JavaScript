package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;


public class Wait {

    public Wait() throws IOException {
    }

    public static void waitfor(String time) throws InterruptedException {

        switch (time)
        {
            case "1":
                {
                    Thread.sleep(1000);
                    break;
                }
            case "2":
                {
                    Thread.sleep(2000);
                    break;
                }
            case "3":
                {
                    Thread.sleep(3000);
                    break;
                }
                case "4":
                {
                    Thread.sleep(4000);
                    break;
                }
                case "5":
                {
                    Thread.sleep(5000);
                    break;
                }
                default:
                {
                    Thread.sleep(1000);
                }

        }
    }

    public static WebDriverWait WaitForWebElement(){
        WebDriverWait wait = new WebDriverWait(WebConnector.driver,10);
        return wait;
    }
}
