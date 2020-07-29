package org.example;

import org.testng.Assert;
import org.openqa.selenium.By;

public class RegisterPage extends MyUtils {//create inheritance between Classes
    //Create object of LoadProp Class
    LoadProp loadProp = new LoadProp();

    //Store locators in variable
    private By _registerpageverifyText=By.xpath("//strong[text()=\"Your Personal Details\"]");
    private  String expectedTextforVerifyRegisterpage="Your Personal Details";
    private By _genderButton=By.cssSelector("input#gender-female");
    private By _fristName=By.cssSelector("input#FirstName");
    private By _lastName=By.cssSelector("input#LastName");
    private By _dateOfbirth=By.xpath("//select[@name=\"DateOfBirthDay\"]");
    private By _Monthofbirth=By.xpath("//select[@name=\"DateOfBirthMonth\"]");
    private By _YearofBirth=By.xpath("//select[@name=\"DateOfBirthYear\"]");
    private By _Email=By.xpath("//input[@id=\"Email\"]");
    private By _Company=By.xpath("//input[@id=\"Company\"]");
    private By _password=By.xpath("//input[@id=\"Password\"]");
    private By _ConfirmPassword=By.xpath("//input[@id=\"ConfirmPassword\"]");
    private By _NewsletterBox=By.xpath("//input[@id=\"Newsletter\"]");
    private By _ClickonButton=By.xpath("//input[@id=\"register-button\"]");


    public void registerMessageVerificationText()//create Method
    {
        //Assert to check Expected match to actual
        Assert.assertEquals(getElement(_registerpageverifyText),expectedTextforVerifyRegisterpage,"Page Not Found");
    }
    public void userEnterRegistrationDetails()//create Method
    {
        clickable(_genderButton);//call clickable method to select gender
        waituntillElmentVisible(_fristName,80);//add explicit wait

        //call SendKey method to send text to first name by using TesTDataConfig.properties
        Sleep1(6);
        sendKeyElements(_fristName,loadProp.getProperty("FirstName"));

        //Use Explcit Wait
        waituntillElmentVisible(_lastName,60);

        // call sendkeyElements method to send text to last name by using Testdataconfig.properties
        sendKeyElements(_lastName,loadProp.getProperty("lastname"));

        //select date of birth by using method
        selectDropDownVisibleText(_dateOfbirth,"6");

        //select date of month by index value using method
        selectDropDownIndexValue (_Monthofbirth,6);

        //select date of year by value calling method
        selectDropDownValue(_YearofBirth,"1980");

        //Store Email with TimeStamp by getting key value of TestDataConfig.properties
        String date=loadProp.getProperty("email1")+"+"+TimeStamp()+loadProp.getProperty("email2");
        sendKeyElements(_Email,date);

        // call sendkeyElements method to send text to Company name by using Testdataconfig.properties
        sendKeyElements(_Company,loadProp.getProperty("company"));
        clickable(_NewsletterBox);//method call to untick box
        Sleep1(3);
        // call sendkeyElements method to send text to password by using Testdataconfig.properties
        sendKeyElements(_password,loadProp.getProperty("password"));
        // call sendkeyElements method to send text to confirm Password by using Testdataconfig.properties
        sendKeyElements(_ConfirmPassword,loadProp.getProperty("confirmpassword"));
    }
    public void clickRegisterButton() {
        // call clickable method to click on Button
        clickable(_ClickonButton);
    }

}
