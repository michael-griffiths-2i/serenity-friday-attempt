/*
    Similar to the Navigate Actions, this sets up a Step to input a keyword (parameter) to be sent
    to a #searchbox_input box.
 */

package starter.duckduckgo;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SearchActions extends UIInteractions {
    @Step("Search for '{0}'")
    public void byKeyword(String keyword){
        $("#searchbox_input").sendKeys(keyword, Keys.ENTER);
    }

    @Step("Search for '{0}'")
    public void byGoogleKeyword(String keyword){
        $("#APjFqb").sendKeys(keyword, Keys.ENTER);

    }


}
