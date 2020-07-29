package org.example;

import org.testng.Assert;
import org.openqa.selenium.By;

public class RegisterSuccessPage extends  MyUtils {
    //store locators variable
    private By _actualTextofVerifyregistrationcomplete=By.xpath("//div[text()=\"Your registration completed\"]");
    private String expectedTextofRegistrationComplete="Your registration completed";
    private By _clickOnContinueButton=By.cssSelector("input[name=register-continue]");

    public void verifyRegistrationCompleteText(){
       //Assert to check Expected match to actual
        Assert.assertEquals(getElement(_actualTextofVerifyregistrationcomplete),expectedTextofRegistrationComplete,"Registration NOT Complete");
    }
    public void clickOnContinueButton(){
        clickable(_clickOnContinueButton);//call clickable method to click on Continue button
    }
}
