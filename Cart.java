package Pages;

import Base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

public class Cart {
    public void ClickShopLink(WebDriver Driver){
        Driver.findElement(By.linkText("Shop")).click();
        /*WebDriverWait wait = new WebDriverWait(CHDriver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.titleContains("Products – Automation Practice Site"));*/

    }
    public void NavigateToHtml(WebDriver Driver){
        String ActualTitle = Driver.getTitle();
        String ExpectedTitle = "HTML5 WebApp Develpment";
        Assert.assertEquals(ExpectedTitle, ActualTitle);
    }
    public void AddToBasket(WebDriver Driver)  {
        JavascriptExecutor k = (JavascriptExecutor) Driver;
        k.executeScript("window.scrollBy(0,800)");
        //Thread.sleep(10);
        Actions act =  new Actions(Driver);
        act.moveToElement(Driver.findElement(By.xpath("//a[text()='Add to basket']"))).click().perform();
        //CHDriver.findElement(By.className("button")).click();//
        /*WebDriverWait w = new WebDriverWait(CHDriver, Duration.ofSeconds(20));
        w.until(ExpectedConditions.visibilityOfElementLocated (By.linkText("Subscribe to Premium")));*/
    }
    public void ViewBasket(WebDriver Driver) {
        Driver.findElement(By.xpath("//*[@id=\"wpmenucartli\"]/a")).click();
        /*Actions act =  new Actions(CHDriver);
        act.moveToElement(CHDriver.findElement(By.xpath("//*[@id=\"wpmenucartli\"]/a"))).click().perform();*/

    }

    /*public void NavigateCartPage(WebDriver CHDriver){
        CHDriver.
    }*/
    public void EnterSymbol(String symbols,WebDriver CHDriver){
        CHDriver.navigate().to("https://practice.automationtesting.in/basket/");
        CHDriver.findElement(By.xpath("//input[@id='coupon_code']")).sendKeys(symbols);
    }
    public void ApplyCoupon(WebDriver CHDriver){
        CHDriver.findElement(By.xpath("//input[@name='apply_coupon']")).click();
    }
    public void MixedInputs( String mixedInput,WebDriver CHDriver){
        CHDriver.findElement(By.className("input-text")).sendKeys(mixedInput);
    }
    public void ApplyCouponSecond(WebDriver CHDriver){
        CHDriver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[2]/td/div/input[2]")).click();
    }
    public void LowercaseSymbolsNumbers(String lsn, WebDriver CHDriver){
        CHDriver.findElement(By.xpath("//*[@id=\"coupon_code\"]")).sendKeys(lsn);
    }
    public void ApplyCouponThird(WebDriver CHDriver){
        CHDriver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[2]/td/div/input[2]")).click();
    }
    public void InvalidInput(String input,WebDriver CHDriver){
        CHDriver.findElement(By.id("coupon_code")).sendKeys(input);
    }
    public void ApplyCouponFourth(WebDriver CHDriver){
        CHDriver.findElement(By.className("button")).click();
    }
    public void EnterNoInput(WebDriver CHDriver){
        CHDriver.findElement(By.xpath("//*[@id=\"coupon_code\"]"));
    }
    public void ApplyCouponFifth(WebDriver CHDriver){
        CHDriver.findElement(By.name("apply_coupon"));
    }
    public void Prompt(WebDriver CHDriver){
        CHDriver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/ul/li"));
    }
}
