/*
    creates a function heading to return the text value

 */

package starter.duckduckgo;
import net.serenitybdd.core.pages.PageComponent;

public class SearchResultsSidebar extends PageComponent{
    public String heading(){
        return $("[data-testid=about] h2").getText();
    }

    public String googleHeading(){
        return $(".PZPZlf.ssJ7i.B5dxMb").getText();
    }

}
