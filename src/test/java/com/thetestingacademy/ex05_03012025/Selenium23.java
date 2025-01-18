package com.thetestingacademy.ex05_03012025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium23 {

    @Test
    public void test() throws Exception{

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://cdpn.io/AbdullahSajjad/fullpage/LYGVRgK?anon=true&view=fullpage");

        driver.switchTo().frame("result");

        WebElement input= driver.findElement(By.xpath("//input[@id='username']"));
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        Thread.sleep(2000);
        WebElement before=driver.findElement(By.xpath("//input[@id='username']/preceding::label"));
        System.out.println(before.getText());
        WebElement next= driver.findElement(By.xpath("//input[@id='username']/following::small"));
        System.out.println(next.getText());

        driver.quit();



    }
}
