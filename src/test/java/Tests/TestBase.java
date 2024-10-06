package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBase {
    public WebDriver driver;

    @BeforeClass
    @Parameters({"browser"})
    public void openBrowser(@Optional("chrome") String browserName ){
        if (browserName.equalsIgnoreCase("chrome")){
            driver= new ChromeDriver();
        }
        else {
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");

    }

    @AfterClass
    public void Quit(){
        if (driver !=null){
            driver.quit();
        }
    }
}
