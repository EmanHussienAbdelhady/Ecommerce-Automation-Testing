package org.example.pages;

import org.example.stepdefi.hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepdefi.hook.driver;

public class homepage {
    public WebElement registertab(){
        return driver.findElement(By.className("ico-register"));
    }
  public   homepage(){
      PageFactory.initElements(driver,this );


    }
    @FindBy(id = "gender-female")
    public WebElement genderfem;
    @FindBy(id = "gender-male")
    public WebElement gendermale;
}
