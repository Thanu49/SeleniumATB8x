package com.thetestingacademy.wait_action_window_svg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium_input_checkbox_radio {

    @Test
    public void checkbox_radio(){
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://awesomeqa.com/practice.html");

        driver.findElement(By.name("firstname")).sendKeys("Thanu");


        driver.findElement(By.name("lastname")).sendKeys("shree");

        //radio button
        WebElement gender= driver.findElement(By.id("sex-1"));
        gender.click();

        WebElement experience= driver.findElement(By.id("exp-2"));
        experience.click();

        WebElement check= driver.findElement(By.xpath("//input[@id=\"profession-0\"]"));
        check.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();

    }
}
