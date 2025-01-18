package com.thetestingacademy.Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Actions2 {

    @Test
    public void test() throws Exception{

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver=new EdgeDriver(edgeOptions);

        driver.get("https://www.makemytrip.com");

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"closeModal\"]")));

        driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]")).click();

        WebElement fromcity=driver.findElement(By.xpath("//input[@data-cy=\"fromCity\"]"));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Actions actions=new Actions(driver);
        actions.moveToElement(fromcity).sendKeys("DEL").build().perform();

        //1 method
//        List<WebElement> listel=driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li"));
//
//        for (WebElement c:listel){
//            if(c.getText().contains("New Delhi")){
//                c.click();
//                break;
//            }
//        }

        //2nd method
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actions.moveToElement(fromcity).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();

        driver.quit();

    }
}
