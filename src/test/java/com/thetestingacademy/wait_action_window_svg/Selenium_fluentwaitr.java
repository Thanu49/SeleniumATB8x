package com.thetestingacademy.wait_action_window_svg;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;

public class Selenium_fluentwaitr {

    @Test
    public  void    testMethod01() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        //Thread.sleep(3000);

//        WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(3));
//
//
//        WebElement link_freetrail= driver.findElement(By.linkText("Start a free trial"));
//        link_freetrail.click();

        WebElement email=driver.findElement(By.name("username"));
        email.sendKeys("dasaya");

        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("123456");

        WebElement submit= driver.findElement(By.xpath("//button[@id=\"js-login-btn\"]"));
        submit.click();

        //explicit wait
//        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
//        wait.until(ExpectedConditions.textToBePresentInElement(error_msg,"Your email, password, IP address or location did not match"));
//
//        WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(3));
//        wait1.until(ExpectedConditions.visibilityOf(error_msg));

        //Fluentwait

        FluentWait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
                        .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);


        WebElement error_msg = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.className("notification-box-description"));
            }
        });

        System.out.println(error_msg.getText());

        driver.quit();
    }
}
