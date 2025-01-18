package com.thetestingacademy.shadow_dom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium_javascriptexecutor {

    @Test
    public void javascriptexecutor() throws Exception{

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver=new EdgeDriver(edgeOptions);

        driver.get("https://selectorshub.com/xpath-practice-page/");

        JavascriptExecutor js=(JavascriptExecutor)driver;

//        js.executeScript("window.scrollBy(0,500);");
        WebElement div_scroll=driver.findElement(By.xpath("//div[@id='userName']"));
        js.executeScript("arguments[0].scrollIntoView(true);",div_scroll);

        String url=js.executeScript("return document.URL;").toString();

        System.out.println(url);
    }
}
