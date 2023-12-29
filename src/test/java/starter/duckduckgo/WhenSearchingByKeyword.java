/*
    Probably the most complex of the four files, brings the classes together and uses the methods.


 */

package starter.duckduckgo;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenSearchingByKeyword {

    @Managed(driver ="chrome", options = "headless")
    WebDriver driver;
    NavigateActions navigate;
    SearchActions search;
    SearchResultsSidebar searchResultSidebar;
    ClickActions clicks;
    @Test
    void theKeywordShouldAppearInTheResultsSidebar(){
        navigate.toTheDuckDuckGoSearchPage();
        search.byKeyword("Cucumber");
        Serenity.reportThat("The keyword should appear in the sidebar heading",
                ()->assertThat(searchResultSidebar.heading()).isEqualTo("Cucumber")
        );
    }
    @Test
    void theGoogleKeywordShouldAppearInTheResults(){
        navigate.toTheGoogleHomepage();
        clicks.removeTheGoogleCookiesWarning();
        search.byGoogleKeyword("Cucumber");
        Serenity.reportThat("The keyword should appear in the Google results",
                ()->assertThat(searchResultSidebar.googleHeading()).isEqualTo("Cucumber")
        );

    }

}
