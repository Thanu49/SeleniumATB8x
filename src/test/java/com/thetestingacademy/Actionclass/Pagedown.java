package com.thetestingacademy.Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Pagedown {

    @Test
    public void test() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://www.makemytrip.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"closeModal\"]")));

        driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]")).click();

        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();

        System.out.println("scrolldown");
    }
    }
