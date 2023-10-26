package com.amazon.pages;

import com.amazon.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @FindBy(xpath="//*[@id=\"nav-logo-sprites\"]")
    WebElement homePageLabel;

    @FindBy(xpath="//input[@id='twotabsearchtextbox']")
    WebElement searchClick;

    @FindBy(xpath="//input[@type='submit']")
    WebElement btnCLick;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public String verifyHomePageTitle(){
        return driver.getTitle();
    }

    public void addTextOnSearch(){
        searchClick.sendKeys(prop.getProperty("productname"));
//        btnCLick.click();
    }

    public void clickOnSearch(){
        btnCLick.click();
    }

}
