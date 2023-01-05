package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NavigationTests {

    WebDriver driver;



@Test
    public void Test1chrome() throws InterruptedException {

        //1. Open browser
        driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to website: https://google.com
        driver.get("https://google.com");

        //3. Save the title in a string variable
    String googletitle = driver.getTitle();

    //4. Go to https://etsy.com
    driver.navigate().to("https://etsy.com");

        //5. Save the title in a string variable
    String estytitle = driver.getTitle();

    //6. Navigate back to previous page
    driver.navigate().back();
    Thread.sleep(1000);

    //7. Verify that title is same is in step3
    String backtitle = driver.getTitle();
    StringUtility.verifyEquals(backtitle,googletitle);

        //8. Navigate forward to previous page
    driver.navigate().forward();
    Thread.sleep(1000);
        //9. Verify that title is same is in step5
    String forwardtitle = driver.getTitle();
    StringUtility.verifyEquals(estytitle,forwardtitle);
}

    @Test
    public void Test2firefox() throws InterruptedException {

        //1. Open browser
        driver = BrowserFactory.getDriver("firefox");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to website: https://google.com
        driver.get("https://google.com");

        //3. Save the title in a string variable
        String googletitle = driver.getTitle();

        //4. Go to https://etsy.com
        driver.navigate().to("https://etsy.com");

        //5. Save the title in a string variable
        String estytitle = driver.getTitle();

        //6. Navigate back to previous page
        driver.navigate().back();
        Thread.sleep(1000);

        //7. Verify that title is same is in step3
        String backtitle = driver.getTitle();
        StringUtility.verifyEquals(backtitle,googletitle);


        //8. Navigate forward to previous page
        driver.navigate().forward();
        Thread.sleep(1000);
        //9. Verify that title is same is in step5
        String forwardtitle = driver.getTitle();
        StringUtility.verifyEquals(estytitle,forwardtitle);
    }

    @Test
    public void Test3safari() throws InterruptedException {

        //1. Open browser
        driver = BrowserFactory.getDriver("safari");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to website: https://google.com
        driver.get("https://google.com");

        //3. Save the title in a string variable
        String googletitle = driver.getTitle();

        //4. Go to https://etsy.com
        driver.navigate().to("https://etsy.com");

        //5. Save the title in a string variable
        String estytitle = driver.getTitle();

        //6. Navigate back to previous page
        driver.navigate().back();
        Thread.sleep(1000);

        //7. Verify that title is same is in step3
        String backtitle = driver.getTitle();
        StringUtility.verifyEquals(backtitle,googletitle);

        //8. Navigate forward to previous page
        driver.navigate().forward();
        Thread.sleep(1000);
        //9. Verify that title is same is in step5
        String forwardtitle = driver.getTitle();
        StringUtility.verifyEquals(estytitle,forwardtitle);
    }

        @AfterMethod
        public void teardown(){
         driver.close();
        }

}
