package Codingpractice6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class XpathLoginTestThree {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qaebank.ccbp.tech/ebank/login");
        driver.manage().window().maximize();
        WebElement element1=driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[1]/input"));
        element1.sendKeys("142420");
        WebElement elment2=driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[2]/input"));
        elment2.sendKeys("231225");
        WebElement element3=driver.findElement(By.xpath("/html/body/div/div/div/div/form/button"));
        element3.submit();
        String ExpectedUrl="https://qaebank.ccbp.tech/";
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(ExpectedUrl));
        String currentUrl=driver.getCurrentUrl();
        if(currentUrl.equals(ExpectedUrl)){
            System.out.println("Logged in Successfully");
            System.out.println(driver.getCurrentUrl());
        }
        driver.quit();
    }
}
