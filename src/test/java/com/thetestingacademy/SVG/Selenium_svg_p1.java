package com.thetestingacademy.SVG;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;

import java.util.List;

public class Selenium_svg_p1 {
    EdgeDriver driver;
    @BeforeTest
    public void testsvg() {
        EdgeOptions options=new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver();

    }

    @Test
    public void flipkart(){

        driver.get("https://www.flipkart.com");
        System.out.println(driver.getTitle());
        driver.manage().window().minimize();
        driver.findElement(By.cssSelector("input[name=\"q\"]")).sendKeys("macmini");
        List<WebElement> listsvg= driver.findElements(By.xpath("//*[local-name()='svg']"));
        listsvg.get(0).click();

        List<WebElement> listmac=driver.findElements(By.xpath("//div[contains(@data-id,\"CPU\")]/div/a[2]"));
        System.out.println(listmac.size());
        for(int i=0;i<listmac.size();i++){
            System.out.println(listmac.get(i).getText());
        }

    }

    @AfterTest
    public void sleep(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
    
}
