package com.thetestingacademy.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Task3_30dec {

    @Test
    public void check_freetrailtext() throws Exception{

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.idrive360.com/enterprise/login");

        Thread.sleep(3000);

        WebElement email=driver.findElement(By.id("username"));
        email.sendKeys("augtest_040823@idrive.com");
        WebElement password= driver.findElement(By.xpath("//input[@name=\"password\"]"));
        password.sendKeys("123456");

        WebElement signin= driver.findElement(By.xpath("//button[text()='Sign in']"));
        signin.click();
        Thread.sleep(20000);

        WebElement errormes=driver.findElement(By.xpath("//h5[@class='id-card-title']"));
        System.out.println(errormes.getText());


        driver.quit();
    }
}
