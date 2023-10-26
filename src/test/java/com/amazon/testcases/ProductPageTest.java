package com.amazon.testcases;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import com.amazon.base.TestBase;
import com.amazon.pages.HomePage;
import com.amazon.pages.ProductPage;
import org.testng.annotations.Test;

import java.util.List;

public class ProductPageTest extends TestBase {

    HomePage homePage;
    ProductPage productPage;

    public ProductPageTest(){
        super();
    }

	@BeforeClass
    public void setUp(){
        initialization();
        homePage = new HomePage();
        productPage = new ProductPage();
    }

    @Test
    public void productValues(){
        homePage.addTextOnSearch();
        homePage.clickOnSearch();

        List<String> productNames = productPage.getProductNames();
        List<String>  productPrices = productPage.getProductPrices();

        int minimumExpectedCount = 10;
//        Assert.assertEquals(productNames.size(), productPrices.size(), "Product names and prices count mismatch");

        for(int i= 0 ;i <minimumExpectedCount && i< productNames.size() && i < productPrices.size(); i++){
            String productName = productNames.get(i);
            String productPrice = productPrices.get(i);

            System.out.println("Product Name: " + productName);
            System.out.println("Product Price: " + productPrice);
        }
    }

    @AfterMethod
    public void tearDown(){
        quitDriver();
    }
}
