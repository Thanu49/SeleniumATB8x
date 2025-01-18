package com.thetestingacademy.Webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class webtable_static {

    @Test
    public void statictables() throws Exception{

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver=new EdgeDriver(edgeOptions);

        driver.get("https://awesomeqa.com/webtable.html");

        List<WebElement> row=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));

        List<WebElement> col=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td"));

        for(int i=2;i<=row.size();i++){
            for (int j=1;j<=col.size();j++){
                String path= "//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]";
                String data=driver.findElement(By.xpath(path)).getText();
                //System.out.println(data);
                if(data.contains("Helen Bennett")){
                    String country=path+"/following-sibling::td";
                    String company=path+"/preceding-sibling::td";

                    System.out.println(driver.findElement(By.xpath(country)).getText());
                    System.out.print(driver.findElement(By.xpath(company)).getText());
                }
            }
            System.out.print("---");
        }
        driver.quit();

    }
}
