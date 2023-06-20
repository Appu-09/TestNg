import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void verifyLoginFunctionality(){
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();


        String username = "Aparna";
        String password = "App123";
        loginPage.enterCredentials(username,password);

        loginPage.clickLoginButton();

        HomePage homePage = new HomePage();
        boolean isHomePageDisplayed = homePage.isHomePageDisplayed();
        Assert.assertTrue(isHomePageDisplayed,"User is not directed to home page after login.");
    }
}
