package starter.duckduckgo;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class ClickActions extends UIInteractions {
    @Step("Remove Google Warning")
    public void removeTheGoogleCookiesWarning(){
        $("#L2AGLb").click();

    }
}
