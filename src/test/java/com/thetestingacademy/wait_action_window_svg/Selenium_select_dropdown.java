package com.thetestingacademy.wait_action_window_svg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Selenium_select_dropdown {

    @Test
    public void dropdown(){


        WebDriver driver=new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        System.out.println(driver.getTitle());
        driver.manage().window().minimize();

        WebElement element_select=driver.findElement(By.id("dropdown"));
        Select select=new Select(element_select);
        //select.selectByVisibleText("Option 2");
        select.selectByIndex(2);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
