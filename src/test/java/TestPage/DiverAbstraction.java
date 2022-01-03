package TestPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DiverAbstraction {

    public WebDriver open() {
        switch (System.getProperty("driverabstracction.browser","")){
            case "firefox":
                return new FirefoxDriver();
            default:
                return new ChromeDriver();
        }
        //return new ChromeDriver();
    }
}
