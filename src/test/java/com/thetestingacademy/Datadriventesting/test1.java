package com.thetestingacademy.Datadriventesting;

import com.thetestingacademy.ExcelReader.Excel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class test1 {

    WebDriver driver;
    @Test(dataProvider = "logindata")
    public void test1(String email,String password,String expected_result) throws InterruptedException{

//        String email="thanushreeag01@gmail.com";
//        String password="Thanu49";
//        String expected_result="invalid";

        driver=new EdgeDriver();

        driver.get("https://App.vwo.com");


        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(email);
        driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys(password);
        driver.findElement(By.id("js-login-btn")).click();

        Thread.sleep(3000);

        if(expected_result.equalsIgnoreCase("valid")){
            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class=\"page-heading\"]")));

            WebElement dashboard=driver.findElement(By.xpath("//h1[@class=\"page-heading\"]"));
            System.out.println(dashboard.getText());
        }

        if (expected_result.equalsIgnoreCase("invalid")){
            WebElement error=driver.findElement(By.className("notification-box-description"));
            System.out.println(error.getText());
        }

        }

    @DataProvider(name="logindata")
    public String[][] testexcel() throws IOException {

        String testexcel="src/test/java/com/thetestingacademy/resource/CTD1.xlsx";
        Excel excelreader=new Excel();
        String[][] data=excelreader.getdatafromsheet(testexcel,"Main");
        return data;

    }

    @AfterMethod
    public void tear(){
        driver.quit();
    }
}
