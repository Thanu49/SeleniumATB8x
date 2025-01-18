package com.thetestingacademy.wait_action_window_svg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Selenium_implicitlywait {

    @Test
    public void listelements() throws Exception{

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");

        WebElement searchbox=driver.findElement(By.xpath("//input[@id='gh-ac']"));
        searchbox.sendKeys("macmini");
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

        List<WebElement> name=driver.findElements(By.xpath("//div[@class='s-item__title']"));
        List<WebElement> price=driver.findElements(By.xpath("//span[@class='s-item__price']"));

        System.out.println(name.size());
        System.out.println(price.size());

        Integer length=Math.min(name.size(), price.size());
        System.out.println(length);

        for(int i=0;i<length;i++){
            System.out.println("title of laptops" +name.get(i)  +" || " + price.get(i));
        }
        //implicit wait will wait upto everything will resolve.
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.quit();
    }
}
