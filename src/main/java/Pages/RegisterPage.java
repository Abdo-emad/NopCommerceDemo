package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends PageBase{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    By fName = By.id("FirstName");
    By lName = By.id("LastName");
    By Email = By.id("Email");
    By pass = By.id("Password");
    By cPass = By.id("ConfirmPassword");
    By RegisterBTN = By.id("register-button");

    public void SetFirstName(String FN){
        WebElement FirstN = driver.findElement(fName);
        WaitForVisibility(FirstN);
        ClearFields(FirstN);
        EnterInputFields(FirstN,FN);
    }
    public void SetLastName(String LN){
        WebElement LastN = driver.findElement(lName);
        WaitForVisibility(LastN);
        ClearFields(LastN);
        EnterInputFields(LastN,LN);
    }
    public void SetEmail(String EM){
        WebElement E_Mail = driver.findElement(Email);
        WaitForVisibility(E_Mail);
        ClearFields(E_Mail);
        EnterInputFields(E_Mail,EM);
    }
    public void SetPass(String P){
        WebElement Password = driver.findElement(pass);
        WaitForVisibility(Password);
        ClearFields(Password);
        EnterInputFields(Password,P);
    }
    public void SetConfirmPass(String P){
        WebElement ConfirmPassword = driver.findElement(cPass);
        WaitForVisibility(ConfirmPassword);
        ClearFields(ConfirmPassword);
        EnterInputFields(ConfirmPassword,P);
    }
    public void RegistrationButton(){
        WebElement Submit = driver.findElement(RegisterBTN);
        WaitForVisibility(Submit);
        ClickOnElement(Submit);
    }

}
