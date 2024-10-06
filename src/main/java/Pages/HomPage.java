package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomPage extends PageBase{
    public HomPage(WebDriver driver) {
        super(driver);
    }

    By Register_BTN = By.linkText("Register");
    public void ClickOnRegisterButton(){
        WebElement R_button = driver.findElement(Register_BTN);
        WaitForVisibility(R_button);
        ClickOnElement(R_button);
    }
}
