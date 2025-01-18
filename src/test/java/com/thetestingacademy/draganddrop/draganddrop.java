package com.thetestingacademy.draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class draganddrop {

    @Test
    public void sample1() throws InterruptedException{

        WebDriver driver=new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        WebElement a=driver.findElement(By.id("column-a"));
        WebElement b=driver.findElement(By.id("column-b"));

        Actions actions=new Actions(driver);
        //actions.dragAndDrop(a,b).build().perform();

        actions.moveToElement(a).clickAndHold(a).moveToElement(b).release(b).build().perform();

        Thread.sleep(3000);

        driver.quit();

    }
}
