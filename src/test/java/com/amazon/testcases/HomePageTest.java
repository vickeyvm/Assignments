package com.amazon.testcases;

import org.testng.annotations.*;
import org.testng.AssertJUnit;
import com.amazon.base.TestBase;
import com.amazon.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    HomePage homePage;

    public  HomePageTest(){
        super();
    }

    @BeforeMethod
	@BeforeClass
    public void setUp(){
        initialization();
        homePage = new HomePage();
    }

//    @Test(priority=0)
//    public void verifyHomePageTitleTest() {
//        String title = homePage.verifyHomePageTitle();
//        AssertJUnit.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","Home Page title not found");
//
//    }

    @Test(priority=1)
    public void addProductName(){
        homePage.addTextOnSearch();
    }

    @Test(priority=2)
    public void clickProductName(){
        homePage.clickOnSearch();
    }

    @AfterMethod
    public void tearDown(){
        quitDriver();
    }



}
