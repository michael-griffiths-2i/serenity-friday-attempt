package saucedemo;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.Keys;

public class LoginActions extends UIInteractions {
    @Step("Enter Data into Username Box")
    public void usernameEntry(String username){
        $("#user-name").sendKeys(username, Keys.ENTER);
    }
    @Step("Enter Data into Password Box")
    public void passwordEntry(String password){
        $("#password").sendKeys(password, Keys.ENTER);

    }
    @Step("Click on the Login Box")
    public void loginClick(){
        $("#login-button").click();
    }
}
