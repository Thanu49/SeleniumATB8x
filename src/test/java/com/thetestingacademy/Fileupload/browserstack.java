package com.thetestingacademy.Fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class browserstack {
    @Test
    public void appupload() throws InterruptedException{

        WebDriver driver=new EdgeDriver();

        driver.get("https://app-automate.browserstack.com/dashboard/v2/getting-started");

        Thread.sleep(2000);
        driver.findElement(By.id("user_email_login")).sendKeys("thanushree9483@gmail.com");
        driver.findElement(By.id("user_password")).sendKeys("Thanu@49");
        driver.findElement(By.name("commit")).click();

        WebElement upload=driver.findElement(By.xpath("//input[@id=\"file\"]"));
        String working=System.getProperty("user.dir");
        upload.sendKeys(working+"/"+"src/test/java/com/thetestingacademy/resource/example.apk");

        Thread.sleep(5000);

        driver.quit();
    }
}
