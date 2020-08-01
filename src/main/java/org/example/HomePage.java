package org.example;
import org.testng.Assert;

import org.openqa.selenium.By;

public class HomePage extends MyUtils { //create inheritance between Classes
    //Create object of LoadProp Class
    LoadProp loadProp = new LoadProp();
    //Store locators in variable
    private By _verifyhomepagetext = By.xpath("//h2[text()=\"Welcome to our store\"]");
    private String expectedTextofHomepage = "Welcome to our store";
    private By _registerClickButton = By.xpath("//div[@class=\"header-links\"]/ul[1]/li[1]/a");


    public void homepageverification() {//create method
        //Assert to check Expected match to actual
        Assert.assertEquals(getElement(_verifyhomepagetext), expectedTextofHomepage, "PAGE NOT FOUND");
    }
    public void ClickonRegisterButton() {

        //call clickable method for click on register button

        clickable(_registerClickButton);
    }

    public void userclickonCategory(String category) {
        clickable((By.linkText(category)));
    }
}
