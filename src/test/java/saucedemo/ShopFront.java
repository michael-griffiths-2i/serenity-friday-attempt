package saucedemo;

import net.serenitybdd.core.steps.UIInteractions;

import net.serenitybdd.core.pages.PageComponent;

public class ShopFront extends PageComponent {
    public String productHeading(){
        //should return product
        return $("#header_container > div.header_secondary_container > span").getText();

    }

}
