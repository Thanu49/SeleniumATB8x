package com.thetestingacademy.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class task_2 {
    @Test
    public void testMethod01()throws Exception{

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://awesomeqa.com/practice.html");

        WebElement first_name= driver.findElement(By.name("firstname"));
        first_name.sendKeys("Thanu");

        WebElement last_name= driver.findElement(By.name("lastname"));
        last_name.sendKeys("shree");

        WebElement gender= driver.findElement(By.id("sex-1"));
        gender.click();

        WebElement experience= driver.findElement(By.id("exp-2"));
        experience.click();

        WebElement date= driver.findElement(By.id("datepicker"));
        gender.sendKeys("10122023");

        WebElement profession= driver.findElement(By.id("profession-1"));
        profession.click();

        WebElement tools= driver.findElement(By.id("tool-2"));
        tools.click();

        WebElement continents= driver.findElement(By.name("continents"));
        continents.sendKeys("Asia");

        Thread.sleep(5000);

        driver.quit();

    }
}
