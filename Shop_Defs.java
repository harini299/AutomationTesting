package Stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.*;
import org.openqa.selenium.interactions.Actions;

public class Shop_Defs {
    WebDriver CHDriver;
    Shop s=new Shop();

    @Given("user open the browser")
    public void userOpenBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harini\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        CHDriver = new ChromeDriver();
        CHDriver.manage().window().maximize();
        CHDriver.get("https://practice.automationtesting.in/");
        Thread.sleep(10);
    }

    @When("user click on the shop menu")
    public void userClickOnTheShopMenu() throws InterruptedException {
        s.userClickTheShopMenu(CHDriver);
        Thread.sleep(80);
    }
    @And("handle ad")
    public void HandleAd() throws InterruptedException {
      s.handleAd(CHDriver);
      Thread.sleep(1000);
    }
    @Then("user navigate to the filter toggle menu")
    public void userNavigateToTheFilterToggleMenu() {Assert.assertEquals("FILTER BY PRICE","FILTER BY PRICE");
    }
    @When("user Set Minimum price level")
    public void userSetMinimumPriceLevelOfTo() throws InterruptedException {
        /*WebElement slider= CHDriver.findElement(By.xpath("//*[@id=\"woocommerce_price_filter-2\"]/form/div/div[1]/span[1]"));
        Actions action=new Actions(CHDriver);*//*
        //action.dragAndDrop("");
        //action.dragAndDropBy(slider,150,189).perform();
        //s.userSetMinimumPriceLevel(CHDriver);*/
         s.userSetMinimumPriceLevel(CHDriver);
         Thread.sleep(90);
    }
    @And("Click filter button one")
    public void clickFilterButtonOne() throws InterruptedException {
        s.clickFilterButton(CHDriver);
        Thread.sleep(90);
    }
    /*@Then("user should see the minimum price products")
    public void userShouldSeeTheMinimumPriceProducts() {
       s.userShouldSeeTheMinimumPrice(CHDriver);
    }
    @When("user Set Maximum price level")
    public void userSetMaximumPriceLevelOfTo() {
    }
    @And("Click filter Button two")
    public void clickFilterButtonTwo() {
        s.clickFilterButtonTwo(CHDriver);
    }
    @Then("user should see the maximum price products")
    public void userShouldSeeTheMaximumPriceProducts() {
    }
    @When("check the behavior of filter toggle bar by adjusting the price")
    public void adjustThePriceLevelTo() {

    }
    @And("Click Filter button three")
    public void clickFilterButtonThree() {
        s.clickFilterButtonThree(CHDriver);
    }*/
    /*@Then("user should see the {int} to {int} price products")
    public void userShouldSeeTheToPriceProducts(int arg0, int arg1) {
    }
    @When("Setting the Price level of {int} to {int}")
    public void settingThePriceLevelOfTo(int arg0, int arg1) {
    }
    @And("click filter button four")
    public void clickFilterButtonFour() {
        s.clickFilterButtonFour(CHDriver);
    }
    @When("Set the price from {int} to {int}")
    public void setThePriceFromTo(int arg0, int arg1) {
    }
    @And("click filter button five")
    public void clickFilterButtonFive() {
        s.clickFilterButtonFive(CHDriver);
    }
    @When("Set the price levels {int} to {int}")
    public void setThePriceLevelsTo(int arg0, int arg1) {
    }
    @And("click Filter button six")
    public void clickFilterButtonSix() {
        s.clickFilterButtonSix(CHDriver);
    }
*/
}


