package com.homerenting.test.modules.navigation;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Arthur on 21/04/14.
 */
@RunWith(JUnit4.class)
public class NavigationTest {

    private static WebDriver webDriver = null;
    private static String url = "http://www.google.com";

    /**
     * Called only once when the class is loaded into Junit framework
     */
    @BeforeClass
    public static void beforeClass(){
        webDriver = new FirefoxDriver();     //launches FireFox browser,
    }

    /**
     * called every time before testcases i.e., methods which are marked with @Test annotation
     */
    @Before
    public void beforeTestCaseMethod() throws InterruptedException{
        webDriver.get(url);                                   //Load the website
        Thread.sleep(5000);
    }
    /**
     * Test case to search hello world text in google.
     */
    @Test
    public void testHelloWorldSearch() throws InterruptedException{
        WebElement googleSearchBox = webDriver.findElement(By.id("gbqfq"));
        googleSearchBox.sendKeys("Hello World");
        WebElement googleSearchButton = webDriver.findElement(By.id("gbqfb")); //sometimes Search button id will be "gbqfba"
        googleSearchButton.click();
        Thread.sleep(5000);
    }
    /**
     * called every time before testcases i.e., methods which are marked with @Test annotation
     */
    @After
    public void afterTestCaseMethod() throws InterruptedException{
        webDriver.get(url);                                   //Optional, revert to page like before testcase.
        Thread.sleep(2000);
    }

    /**
     * Called only once when the class is unloaded from Junit framework
     */
    @AfterClass
    public static void afterClass(){
        webDriver.quit();                                   //Close the firefox
    }

}
