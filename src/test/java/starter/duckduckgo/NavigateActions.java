/*
    This file contains the navigation actions and extends UIInteractions.
    @Step breaks the test down to something that can be reported.
    The Navigate Action goes to the desired URL

 */

package starter.duckduckgo;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.WebElement;

public class NavigateActions extends UIInteractions {
    //extending UIInteractions injects @Managed WebDriver into the class
    @Step("Navigate to the DuckDuck Go Homepage")
    public void toTheDuckDuckGoSearchPage(){
        openUrl("https://duckduckgo.com/");
    }


    @Step("Navigate to the Google Homepage")
    public void toTheGoogleHomepage(){
        openUrl("https://google.co.uk");
    }

}
