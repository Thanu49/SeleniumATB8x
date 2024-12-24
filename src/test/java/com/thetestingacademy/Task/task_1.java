package com.thetestingacademy.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Watchable;

public class task_1 {
    @Test
    public void testMethod1() throws Exception{

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement make_appointment= driver.findElement(By.linkText("Make Appointment"));
        make_appointment.click();

        WebElement username=driver.findElement(By.id("txt-username"));
        username.sendKeys("John Doe");

        WebElement password=driver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement log_button=driver.findElement(By.id("btn-login"));
        log_button.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");

        Thread.sleep(3000);

        driver.quit();

    }
}
