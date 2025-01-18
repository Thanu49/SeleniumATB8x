package com.thetestingacademy.Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;

public class Actions3 {

    @Test
    public void test3() throws Exception{

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver=new EdgeDriver(edgeOptions);

        driver.get("https://www.spicejet.com");

        WebElement fromcity= driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));
        Actions action=new Actions(driver);
        action.moveToElement(fromcity).click().sendKeys("BLR").build().perform();

        Thread.sleep(2000);
        driver.quit();
    }
}
