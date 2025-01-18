package com.thetestingacademy.Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class handlewindows {

    @Test
    public void windows() throws Exception{

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver=new EdgeDriver(edgeOptions);

        driver.get("https://the-internet.herokuapp.com/windows");
            //it is string because these are names of the windows
//        String parentwindoe=driver.getWindowHandle();
//        System.out.print("parent window" + parentwindoe);

        WebElement child= driver.findElement(By.linkText("Click Here"));
        child.click();

        Set<String> win=driver.getWindowHandles();
        for (String han:win){
            driver.switchTo().window(han);
            if(driver.getPageSource().contains("New Window")){
                System.out.println("testcase passed");
                break;
            }


        }
        driver.quit();

    }
}
