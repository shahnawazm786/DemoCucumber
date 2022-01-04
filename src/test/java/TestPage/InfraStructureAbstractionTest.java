package TestPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class InfraStructureAbstractionTest {
    private WebDriver driver;
    private  static  final Logger logger= LogManager.getLogger(InfraStructureAbstractionTest.class);
    static String browserToUse=System.setProperty("driverabstracction.browser","chrome");
@BeforeClass
public void setup(){
    logger.info("Driver open");
   WebDriverManager.chromedriver().setup();
   // WebDriverManager.firefoxdriver().setup();
    driver=new DiverAbstraction().open();
    //driver=new ChromeDriver();
}
@Test
    public void checkLogin(){
    logger.info("Google open");
    driver.get("https://www.google.com");
}
@AfterClass
    public void tearUp(){
    driver.close();
    logger.info("Driver close");
}
}
