import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationTest {

    @Test
    public void verifyUserRegistrationFunctionality(){
        RegistrationPageTest registrationPage = new RegistrationPageTest();

        String name = "Aparna";
        String email = "app999@gmail.com";
        String password = "App";
        registrationPage.enterUserDetails(name, email, password);

        registrationPage.clickSubmitButton();

        LoginPageTest loginPage = new LoginPageTest();
         boolean isLoginPageDisplayed = loginPage.isLoginPageDisplayed();
        Assert.assertTrue(isLoginPageDisplayed,"User is not redirected to login page after registration.");

        String expectedMessage = "Registration Successful.Please login with your credentials.";
        String actualMessage = loginPage.getSuccessMessage();

        Assert.assertEquals(actualMessage,expectedMessage,"Success message is not displayed after registration.");
    }
}
