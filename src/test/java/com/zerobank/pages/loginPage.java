package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

    @FindBy (xpath = "//button [@id='signin_button']")
    public WebElement entranceToSignInButton;

    @FindBy (xpath = "//input[@id='user_login']")
    public WebElement loginInputBox;

    @FindBy (xpath = "//input[@id='user_password']")
    public WebElement passwordInputBox;

    @FindBy (xpath = "//input[@name='submit']")
    public  WebElement signInButton;
//==================================================================
    public loginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

//=================================================================
    public  void  login (String userName, String password){
        entranceToSignInButton.click();
        BrowserUtils.waitForPageToLoad(10);

        loginInputBox.sendKeys(userName);
        passwordInputBox.sendKeys(password, Keys.ENTER);
    }
//===================================================================

}
