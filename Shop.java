package Pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.io.OutputStream;
import java.time.Duration;
import java.util.List;

public class Shop {
    public void userClickTheShopMenu(WebDriver CHDriver){

        CHDriver.findElement(By.xpath("//header//div/nav//li//a[text()='Shop']")).click();

    }
    /*public void handleAd(WebDriver CHDriver){
        try {
            WebDriverWait wait = new WebDriverWait(CHDriver, Duration.ofMillis(8000));
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = CHDriver.switchTo().alert();
            System.out.println(alert.getText());
            alert.dismiss();
        } catch (Exception e) {
            //exception handling
       *//* }
        Alert alert=CHDriver.switchTo().alert();
        alert.dismiss();*//*
    }}*/
    public void handleAd(WebDriver CHDriver){
        try {
            WebDriverWait wait = new WebDriverWait(CHDriver, Duration.ofMillis(8000));
            CHDriver.switchTo().frame("aswift_7");
            CHDriver.switchTo().frame("ad_iframe");
            CHDriver.findElement(By.xpath("//span[text()='Close']")).click();
            /*wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = CHDriver.switchTo().alert();
            System.out.println(alert.getText());
            alert.dismiss();*/
        } catch (Exception e) {
            //exception handling
       /* }
        Alert alert=CHDriver.switchTo().alert();
        alert.dismiss();*/
        }}
    /*public void userNavigateTheFilterToggleMenu(WebDriver CHDriver){
        Assert.
    }*/
    public void userSetMinimumPriceLevel(WebDriver CHDriver ) throws InterruptedException {
        //CHDriver.switchTo().frame(CHDriver.findElement(By.xpath("//*[@id=\"ad_iframe\"]")));
        WebElement slider1 = CHDriver.findElement(By.xpath("//div//span[contains(@class,'ui-slider-handle')]"));
        WebElement slider2 = CHDriver.findElement(By.xpath("//div//span[contains(@class,'ui-slider-handle')][2]"));
        Thread.sleep(1000);
        Actions action=new Actions(CHDriver);
        action.clickAndHold(slider2);
        action.dragAndDropBy(slider1,0,0);
        Thread.sleep(1000);
        action.dragAndDropBy(slider2,-100,0).perform();
        //System.out.println("Products price:"+ );
    }
    public void clickFilterButton(WebDriver CHDriver){
        CHDriver.findElement(By.xpath("//button[text()='Filter']")).click();
    }
    //public void userShouldSeeTheMinimumPrice(WebDriver CHDriver){
        /*List<WebElement> list_of_products = CHDriver.findElements(By.xpath(""));
        List<WebElement> list_of_products_price = CHDriver.findElements(By.xpath(""));
        String product_name;
        String product_price;
        //for(int i=0;i<list_of_products.size();i++) {
            product_name = list_of_products.get().getText();//Iterate and fetch product name
            product_price = list_of_products_price.get().getText();//Iterate and fetch product price
          //  product_price = product_price.replaceAll("[^0-9]", "");//Replace anything wil space other than numbers
         //   int_product_price = Integer.parseInt(product_price);//Convert to Integer
         //   map_final_products.put(int_product_price,product_name);//Add product and price in HashMap
        }
        //product_name = list_of_products.getText();//Iterate and fetch product name
        //product_price = list_of_products_price.getText();
        //java.util.List<WebElement> list_of_products = CHDriver.findElements(By.xpath(""));

    }*/
   /* public void userSetMaximumPriceLevelOfTo(){

    }
    public void clickFilterButtonTwo(WebDriver CHDriver){
        CHDriver.findElement(By.linkText("Filter")).click();
    }
    public void userShouldSeeTheMaximumPriceProducts(){

    }
    public void adjustThePriceLevelTo(){

    }
    public void clickFilterButtonThree(WebDriver CHDriver){
        CHDriver.findElement(By.linkText("Filter")).click();
    }
    public void userShouldSeeTheToPriceProducts(){

    }*/
    /*public void settingThePriceLevelOfTo(){

    }
    public void clickFilterButtonFour(WebDriver CHDriver){
        CHDriver.findElement(By.linkText("Filter")).click();
    }
    public void setThePriceFromTo(){

    }
    public void clickFilterButtonFive(WebDriver CHDriver){
        CHDriver.findElement(By.linkText("Filter")).click();
    }
    public void setThePriceLevelsTo(){

    }
    public void clickFilterButtonSix(WebDriver CHDriver){
        CHDriver.findElement(By.linkText("Filter")).click();
    }*/






}
