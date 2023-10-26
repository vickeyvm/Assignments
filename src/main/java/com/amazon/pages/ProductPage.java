package com.amazon.pages;

import com.amazon.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ProductPage extends TestBase {


    @FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']")
    private List<WebElement> productNameLocator;

    @FindBy(xpath="//span[@class='a-price']")
    private List<WebElement> productPriceLocator;

    public ProductPage(){
        PageFactory.initElements(driver,this);
    }

    public List<String> getProductNames(){
        List<String> productNames = new ArrayList<>();
        for(WebElement element : productNameLocator){
            productNames.add(element.getText());
        }

        return productNames;
    }

    public List<String> getProductPrices(){
        List<String> productPrices = new ArrayList<>();
        for(WebElement element : productPriceLocator){
            productPrices.add(element.getText());
        }

        return productPrices;
    }


}
