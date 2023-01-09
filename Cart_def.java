package Stepdef;

import Base.Base;
import Pages.Cart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Cart_def extends Base {
    //WebDriver CHDriver;
    Cart C=new Cart();
    Base B=new Base();
    @Given("goto the site url")
    public void GoToSite() throws InterruptedException {
        //this.CHDriver=CHDriver;
        B.BrowsersIntialize("Chrome");
        /*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harini\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        CHDriver = new ChromeDriver();
        CHDriver.manage().window().maximize();
        CHDriver.get("https://practice.automationtesting.in/");*/
        Thread.sleep(1000);
    }
    @When("user click on shop menu")
    public void userClickOnShopMenu()  {
        C.ClickShopLink(CHDriver);
        WebDriverWait wait=new WebDriverWait(CHDriver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
    }
    @Then("navigate to the html web app development book")
    public void navigateToTheHtmlWebAppDevelopmentBook() throws InterruptedException {
        C.NavigateToHtml(CHDriver);
        CHDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     }
    @When("user click on add to basket button")
    public void userClickOnAddToBasketButton() throws InterruptedException {
       /* Actions act =  new Actions(CHDriver);
        act.moveToElement(CHDriver.findElement(By.xpath("//a[text()='Add to basket']"))).click().perform();*/
        C.AddToBasket(CHDriver);
        Thread.sleep(100);
    }
    @And("click on view basket")
    public void clickOnViewBasket() throws InterruptedException {
        /*Actions act =  new Actions(CHDriver);
        act.moveToElement(CHDriver.findElement(By.xpath("//a[text()='View Basket']"))).click().perform();*/
        C.ViewBasket(CHDriver);
        Thread.sleep(200);
    }
    @Then("navigate to the cart page")
    public void navigateToTheCartPage() throws InterruptedException {
        //CHDriver.navigate().to("https://practice.automationtesting.in/basket/");
        Assert.assertEquals("Product","Product");
        Thread.sleep(100);
    }
    @When("user enter symbol in the coupon field")
    public void userEnterSymbolInTheCouponField() {
        C.EnterSymbol("abcde",CHDriver);
    }
    @And("click apply coupon one time")
    public void clickApplyCouponOneTime() throws InterruptedException {
       C.ApplyCoupon(CHDriver);
       Thread.sleep(50);
    }
    @And("enter mixed inputs")
    public void enterMixedInputs() throws InterruptedException {
       C.MixedInputs("ASDFGHJ%!$#123",CHDriver);
       Thread.sleep(50);
    }
    @And("user click apply coupon button second time")
    public void userClickApplyCouponButtonSecondTime() {
       C.ApplyCouponSecond(CHDriver);
    }
    @And("user enter lowercase numbers symbols")
    public void userEnterLowercaseNumbersSymbols() throws InterruptedException {
       C.LowercaseSymbolsNumbers("asdfghjklA123@#@$",CHDriver);
       Thread.sleep(50);
    }
    @And("click apply coupon third time")
    public void clickApplyCouponThirdTime(){
       C.ApplyCouponThird(CHDriver);
    }
    @When("user enter invalid input")
    public void userEnterInvalidInput() {
       C.InvalidInput("))))))0000000/////KAJ",CHDriver);
    }
    @And("click apply coupon button fourth time")
    public void clickApplyCouponButtonFourthTime() {
       C.ApplyCouponFourth(CHDriver);
    }
    @And("user enter no input")
    public void userEnterNoInput() {
        C.EnterNoInput(CHDriver);
    }
    @And("click on apply coupon button fifth time")
    public void clickOnApplyCouponButtonFifthTime() {
        C.ApplyCouponFifth(CHDriver);
    }
    @Then("user see the error prompts")
    public void userSeeTheErrorPrompts() {
       C.Prompt(CHDriver);
    }
}
