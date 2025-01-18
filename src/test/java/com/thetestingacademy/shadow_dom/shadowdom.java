package com.thetestingacademy.shadow_dom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class shadowdom{
    EdgeDriver driver;
    @Test
    public void test_shadow() throws Exception{
        driver=new EdgeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().minimize();
        JavascriptExecutor js=(JavascriptExecutor)driver;

        WebElement div_scroll=driver.findElement(By.xpath("//div[@id='userName']"));
        js.executeScript("arguments[0].scrollIntoView(true);",div_scroll);

        Thread.sleep(1000);

        WebElement inputpizza=(WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"div#app2\").shadowRoot.querySelector(\"input#pizza\")");
        inputpizza.sendKeys("farmhouse");

        driver.quit();

    }
}
