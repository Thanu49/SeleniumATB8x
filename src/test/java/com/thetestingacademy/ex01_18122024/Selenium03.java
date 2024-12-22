package com.thetestingacademy.ex01_18122024;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class Selenium03 {
    //webdriver heirarchy
    @Test
    public void test_selenium(){
        WebDriver driver = new EdgeDriver();
//        WebDriver driver1 = new ChromeDriver();
//        WebDriver driver2 = new FirefoxDriver();
//        WebDriver driver4 = new InternetExplorerDriver();
//        WebDriver driver5 = new SafariDriver();

        //Searchcontext(I)(2) -> webdriver(I)(10) -> Remotewebdriver(C)(15) -> chromiumdriver(c)(15) -> Edgedriver(C)(45)
        //Searchcontext(I)(2) -> webdriver(I)(10) -> Remotewebdriver(C)(15) -> chromiumdriver(c)(15) -> chromedriver(C)(45)

        //Searchcontext - interface -findelement, and findelements -GGf
        //webdriver - interface -some incomplete functions -gf
        //remotewebdriver - class - it also has some functions -F
        //Chromedriver,firefoxdriver,edgedriver,safaridriver,internetexplorerdriver


//        SearchContext driver = new ChromeDriver();
//        WebDriver driver1 = new ChromeDriver();
//        RemoteWebDriver driver2 =new ChromeDriver();

        //Scenarios

        //1 do you want to run your testcases on chrome or edge?
        //ChromeDriver dri =  new ChromeDriver();1%

        //2. do you want to run on chrome then change to edge?
//        WebDriver dri = new ChromeDriver(); 97%
//        dri = new ChromeDriver();
//

        //3. do you want to runn on multiple browsers ,aws machine ?2%
        //Remotewebdriver dri(with grid) - advance(last 2 sessions)


//
    }
}
