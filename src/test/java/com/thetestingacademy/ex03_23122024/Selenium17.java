package com.thetestingacademy.ex03_23122024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium17 {
    @Description("verify the report")
    @Test
    public  void    testMethod01() throws Exception{

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        WebElement emailbox=driver.findElement(By.id("login-username"));
        emailbox.sendKeys("adcd@gmail.com");

        WebElement password = driver.findElement(By.id("login-password"));
        password.sendKeys("abcd");

        WebElement submit=driver.findElement(By.id("js-login-btn"));
        submit.click();

        //WebElement error_message=driver.findElement(By.id("js-notification-box-msg"));
        WebElement error_message= driver.findElement(By.cssSelector("[data-qa=rixawilomi]") );
        System.out.println(error_message.getText());
        //Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

        Thread.sleep(3000);

        driver.quit();






    }
}
