package com.thetestingacademy.Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class Actionclass1 {

    @Test
    public void keyboard_action() throws Exception{

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver=new EdgeDriver(edgeOptions);

        driver.get("https://awesomeqa.com/practice.html");

        WebElement firstname=driver.findElement(By.cssSelector("input[name='firstname']"));

        Actions action=new Actions(driver);

        action.keyDown(Keys.SHIFT).sendKeys(firstname,"the testing academy")
                .keyUp(Keys.SHIFT).build().perform();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }


}
