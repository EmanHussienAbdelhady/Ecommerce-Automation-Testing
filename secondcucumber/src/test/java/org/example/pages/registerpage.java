package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.example.stepdefi.hook.driver;

public class registerpage {

    public registerpage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(id ="FirstName")
  public WebElement fname;
    @FindBy(id ="LastName")
    public WebElement lname;
    @FindBy(name = "DateOfBirthDay")
    public WebElement Day;
    @FindBy(name = "DateOfBirthMonth")
    public WebElement Month;
    @FindBy(name = "DateOfBirthYear")
    public WebElement year;
    @FindBy(id ="Email")
    public WebElement mail;
    @FindBy(id = "Newsletter")
    public WebElement nl;
    @FindBy(id = "Password")
    public WebElement pass;
    @FindBy(id = "ConfirmPassword")
    public WebElement Confirm;
    @FindBy(id="register-button")
    public WebElement button;
   @FindBy(className = "result")
    public WebElement msg;
   @FindBy(id ="Email-error" )
    public  WebElement emerror;
}