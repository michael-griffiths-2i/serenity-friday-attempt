/*
    Probably the most complex of the four files, brings the classes together and uses the methods.


 */

package saucedemo;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenLoggingIntoSwagLabs {

    @Managed(driver ="chrome", options = "headless")
    WebDriver driver;
    NavigateActions navigate;
    ShopFront shop;
    LoginActions login;
    @ParameterizedTest
    @ValueSource(strings = {"standard_user", "locked_out_user", "problem_user","performance_glitch_user","visual_user","error_user"})
    void loggingInToSwagLabs(String username){
        navigate.toTheSwagLabsPage();
        login.usernameEntry(username);
        login.passwordEntry("secret_sauce");
        login.loginClick();
        Serenity.reportThat("The Products heading should appear on the page",
                ()->assertThat(shop.productHeading()).isEqualTo("Products"));

    }


}
