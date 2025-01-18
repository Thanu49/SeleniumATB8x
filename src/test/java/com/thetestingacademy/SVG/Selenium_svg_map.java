package com.thetestingacademy.SVG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium_svg_map {

    EdgeDriver driver;
    @BeforeTest
    public void testsvg() {
        EdgeOptions options=new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver();

    }

    @Test
    public void svg_map(){

        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        System.out.println(driver.getTitle());
        driver.manage().window().minimize();

        List<WebElement> states=driver.findElements(By.xpath("//*[name()=\"svg\"]/*[local-name()=\"g\"][7]/*[name()=\"g\"]/*[name()=\"g\"]/*[local-name()='path']"));
//        for(int i=0;i<states.size();i++){
//           System.out.println(states.get(i).getDomAttribute("aria-label"));
//           if(states.get(i).getDomAttribute("aria-label").contains("Tripura")){
//               states.get(i).getText().c;
//           }
//        }

        for(WebElement state :states){
            System.out.println(state.getAttribute("aria-label"));
            if(state.getAttribute("aria-label").contains("Tripura  ")){
//                JavascriptExecutor js =(JavascriptExecutor)driver;
//                js.executeScript("arguments[0].click(true)");
                state.click();
            }

        }

    }

    @AfterTest
    public void sleep(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
