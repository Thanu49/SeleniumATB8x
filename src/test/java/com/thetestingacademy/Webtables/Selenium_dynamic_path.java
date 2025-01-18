package com.thetestingacademy.Webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium_dynamic_path {

    @Test
    public void testtables() throws Exception{

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver=new EdgeDriver(edgeOptions);

        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Hacker@4321");
        driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();

    }
}
