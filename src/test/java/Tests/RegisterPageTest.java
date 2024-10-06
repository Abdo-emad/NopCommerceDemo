package Tests;

import Pages.HomPage;
import Pages.PageBase;
import Pages.RegisterPage;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase{
    HomPage homPage;
    RegisterPage registerPage;
    Faker faker = new Faker();
    String FirstName = faker.name().firstName();
    String LastName = faker.name().lastName();
    String Email = faker.internet().emailAddress();
    String Password = String.valueOf(faker.number().randomDigit());
    @Test
    public void Register(){
        homPage = new HomPage(driver);
        homPage.ClickOnRegisterButton();
        registerPage = new RegisterPage(driver);
        System.out.println(FirstName + LastName + Email +Password);
        registerPage.SetFirstName(FirstName);
        registerPage.SetLastName(LastName);
        registerPage.SetEmail(Email);
        registerPage.SetPass(Password);
        registerPage.SetConfirmPass(Password);
        registerPage.RegistrationButton();


    }
}
