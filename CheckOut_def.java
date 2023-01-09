package Stepdef;

import Pages.CheckOut;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckOut_def {
    WebDriver CHDriver;
    CheckOut Ckt=new CheckOut();
    @Given("user goto site page")
    public void UserGotoSite() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harini\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        CHDriver = new ChromeDriver();
        CHDriver.manage().window().maximize();
        CHDriver.get("https://practice.automationtesting.in/");
        Thread.sleep(10);
    }
    @When("user click on shop link")
    public void userClickOnShopLink() {
      Ckt.ClickShopCheckout(CHDriver);
    }
    @Then("User will scroll down")
    public void ScrollDownP(){
        Ckt.Scroll(CHDriver);
    }
    @And("user navigate to the selenium ruby book")
    public void userNavigateToTheSeleniumRubyBook() throws InterruptedException {
       Ckt.SeleniumRuby(CHDriver);
       Thread.sleep(90);
    }
    @When("user click add to basket")
    public void userClickAddToBasket() {
        Ckt.AddToBasket(CHDriver);
    }
    @And("click on cart")
    public void clickOnCart() throws InterruptedException {
        Ckt.ClickOnCartButton(CHDriver);
        Thread.sleep(30);
    }
    @And("click on proceed to checkout button")
    public void clickOnProceedToCheckoutButton() throws InterruptedException {
       Ckt.ProceedCheckO(CHDriver);
       Thread.sleep(50);
    }
    @Then("user see the billing details form")
    public void userSeeTheBillingDetailsForm() {
        //String BillingH=CHDriver.findElements(B)//
        //Billing Details//
        Ckt.BillingDetails(CHDriver);
    }
    @When("user enter Firstname Lastname Company name Email")
    public void userEnterFirstnameLastnameCompanyNameEmail() {
        Ckt.FirstNLastNCompanyNEmail("Robert","Sarah","Dell inc","Diju2024@gmail.com","9594509934",CHDriver);
    }
    @And("user select required country")
    public void userSelectRequiredCountryFromTheDropdown() {
      Ckt.SelectCountry("HongKong",CHDriver);
    }
    @And("user enter address")
    public void userEnterAddress() {
      Ckt.EnterAddressC("44 Rally drive","Kowloon",CHDriver);
    }
    @And("user select city state")
    public void userSelectCityState() {
        Ckt.SelectCityState("Trail",CHDriver);
    }
    @And("user enter zip code")
    public void userEnterZipCode() {
        Ckt.EnterZip("289768",CHDriver);
    }
    @And("user select paypal")
    public void userSelectPaypal() {
        Ckt.SelectPay(CHDriver);
    }
    @And("user click place order button")
    public void userClickPlaceOrderButton() {
        Ckt.PlaceOrd(CHDriver);
    }
    @Then("user direct to the paypal page")
    public void userDirectToThePaypalPage() {

    }
}
