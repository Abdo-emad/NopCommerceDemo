package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {
    public WebDriver driver;
    public PageBase(WebDriver driver){
        this.driver= driver;
    }
    public void ClearFields(WebElement element){
        element.clear();
    }
    public void WaitForVisibility(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver ,Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void EnterInputFields(WebElement element , String value){
        element.sendKeys(value);
    }
    public void ClickOnElement(WebElement element){
        element.click();
    }
}
