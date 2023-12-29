/*
    This file contains the navigation actions and extends UIInteractions.
    @Step breaks the test down to something that can be reported.
    The Navigate Action goes to the desired URL

 */

package saucedemo;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class NavigateActions extends UIInteractions {
    //extending UIInteractions injects @Managed WebDriver into the class
    @Step("Navigate to the Swag Labs website")
    public void toTheSwagLabsPage(){
        openUrl("https://www.saucedemo.com/");
    }

}
