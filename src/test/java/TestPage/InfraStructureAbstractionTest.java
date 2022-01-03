package TestPage;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeClass;

public class InfraStructureAbstractionTest {
@BeforeClass
public void setup(){
    WebDriverManager.chromedriver().setup();
}

}
