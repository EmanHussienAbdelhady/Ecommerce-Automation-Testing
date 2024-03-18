package org.example.stepdefi;
import static org.example.stepdefi.hook.driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class signup {
    homepage home= new homepage();
    registerpage register=new registerpage();
@Given( "user go to register page")
    public void reg(){

    home.registertab().click();
}
    @And("user select gender type")
    public void userSelectGenderType() {
    home.genderfem.click();
    }

    @And("user enter first name  and last name")
    public void userEnterFirstNameAndLastName() {
    register.fname.sendKeys("eman");
    register.lname.sendKeys("hussien");
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
        Select s1= new Select(register.Day);
        s1.selectByValue("11");
       Select s2=new Select(register.Month);
       s2.selectByValue("3");
       Select s3=new Select(register.year);
       s3.selectByValue("1991");
    }

    @And("user enter email")
    public void userEnterEmail() {
    register.mail.sendKeys("aahs@ahsh.com");
    }

    @And("check option is selected")
    public void checkOptionIsSelected() {
    boolean status =register.nl.isSelected();
    if (status==false){
        register.nl.click();
    }
    }

    @And("user fills Password fields")
    public void userFillsPasswordFields() {
    register.pass.sendKeys("E123456$");
    register.Confirm.sendKeys("E123456$");
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
    register.button.click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        SoftAssert soft= new SoftAssert();
        soft.assertEquals(register.msg.getText(),"Your registration completed");
        soft.assertEquals(register.msg.getCssValue("color"),"rgba(76, 177, 124, 1)");
              soft.assertAll();
    }

    @And("user enter invalid email")
    public void userEnterInvalidEmail() {
     
    }

    @Then("unable to register")
    public void unableToRegister() {
    }

    @And("error message will be displayed")
    public void errorMessageWillBeDisplayed() {
        SoftAssert soft= new SoftAssert();
        String actualmsg=register.emerror.getText();
        soft.assertEquals(actualmsg,"Wrong email");
    }
}
