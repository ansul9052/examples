package Appium_Vizio;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Vizio {
    public static void main(String[] args) throws MalformedURLException, Exception {
        WindowsDriver<WebElement> driver = null;
     
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("platformName", "Windows");
            cap.setCapability("platformVersion", "10");
            cap.setCapability("app", "D:\\Vizio Live\\Debug\\VizioCargoSolution_Alpha.exe");

            driver = new WindowsDriver<>(new URL("http://127.0.0.1:4723"), cap);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            
            driver.findElementByAccessibilityId("txtUserName").sendKeys("deep");
            Thread.sleep(1000);
            driver.findElementByAccessibilityId("txtPassword").sendKeys("Vizio@1234");
            Thread.sleep(2000);
            driver.findElementByAccessibilityId("butLogin").click();
            Thread.sleep(5000);
         //   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
           // wait.until(ExpectedConditions.visibilityOfElementLocated(By.))
            
            driver.findElementByXPath("//button[@enabled='true' and @focused='false' and @action='Open']").click();
            driver.findElementByXPath("//button[@enabled='true' and @focused='false' and @action='Open']").click();
            driver.findElementByXPath("//button[@enabled='true' and @focused='false' and @action='Open']").click();
            
            

           

    }
}
        
    
