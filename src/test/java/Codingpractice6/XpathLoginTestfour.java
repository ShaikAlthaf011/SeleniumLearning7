package Codingpractice6;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class XpathLoginTestfour {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qaebank.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement e1=driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[1]/input"));
        e1.sendKeys("142420");
        WebElement e2=driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[2]/input"));
        e2.sendKeys("231225");
        WebElement e3=driver.findElement(By.xpath("/html/body/div/div/div/div/form/button"));
        e3.submit();
        String Str1="https://qaebank.ccbp.tech/";
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(Str1));
        String CurrentUrl1=driver.getCurrentUrl();
        if(CurrentUrl1.equals(Str1)){
            System.out.println("Logged is Successfully");
            System.out.println(driver.getCurrentUrl());
        }
        WebElement e4=driver.findElement(By.xpath("/html/body/div/div/div/button"));
        e4.click();
        String SecondExpectedurl="https://qaebank.ccbp.tech/ebank/login";
        WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.urlToBe(SecondExpectedurl));
        String CURRENTURL=driver.getCurrentUrl();
        if(CURRENTURL.equals(SecondExpectedurl)){
            System.out.println("Logged out Successfully");
            System.out.println(driver.getCurrentUrl());
        }
        driver.quit();

    }
}
