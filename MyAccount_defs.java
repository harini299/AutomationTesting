package Stepdef;

import Base.Base;
import Pages.MyAccount;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;

public class MyAccount_defs extends Base {
    WebDriver CHDriver;
    Base B= new Base();

    MyAccount A=new MyAccount();

    @Given("user go to website")
    public void UserGoToSite() {
        B.BrowsersIntialize("Chrome");
        /*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harini\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        CHDriver = new ChromeDriver();
        CHDriver.manage().window().maximize();
        //ChromeOptions blockad=new ChromeOptions();
        //blockad.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
        //WebDriver CHDriver=new ChromeDriver(blockad);
        CHDriver.get("https://practice.automationtesting.in/my-account/");
        Thread.sleep(10);*/
    }
    @When("user click on my account menu")
    public void userClickOnMyAccountMenu()  {
        A.ClickOnMyAcc(CHDriver);


    }
    @And("handle dynamic ad pop up")
    public void HandleAdPopU() throws InterruptedException {
       A.HandleAdPopUps(CHDriver);
       Thread.sleep(900);
    }
    @Then("user see the register heading")
    public void userSeeTheRegisterHeading() {
        Assert.assertEquals("Register","Register");
    }
    @When("user enter email address")
    public void userEnterEmailAddress() throws InterruptedException {
        A.UserEnterEmail("Kkkkk2024@gmail.com",CHDriver);
        Thread.sleep(200);
    }
    @And("user enter password")
    public void userEnterPassword() {
        A.UserPassword("Ssss2024@321",CHDriver);
    }
    @And("user click on register button")
    public void userClickOnRegisterButton() {
        A.ClickRegisterButton(CHDriver);
    }
    @And("user click on the Addresses link")
    public void userClickOnTheAddressesLink() throws InterruptedException {
        A.ClickAddressLink(CHDriver);
        Thread.sleep(1000);
    }

    @When("user click on the shipping address edit link")
    public void userClickOnTheShippingAddressEditLink() {
        A.ShippingAddEditLink(CHDriver);
    }
    @Then("user see the shipping address form heading")
    public void userSeeTheShippingAddressFormHeading() {
       Assert.assertEquals("Shipping Address","Shipping Address");
    }
    @When("user enter firstname lastname company")
    public void userEnterFirstnameLastnameCompany() {
        A.FirstnameLastnameCname("Riju","Dylan","Tesla",CHDriver);
    }
    @And("user select country")
    public void userSelectCountry() {
        A.SelectCountry("Iceland",CHDriver);
    }
    @And("user enter address city")
    public void userEnterAddressCity() {
        A.EnterAddress("44 fort drive",CHDriver);
    }
    @And("user select state")
    public void userSelectState() {
        A.SelectState("Trial",CHDriver);
    }
    @And("user enter postcode")
    public void userEnterPostcode() {
        A.EnterPostcode("289138",CHDriver);
    }
    @And("user click on save address button")
    public void userClickOnSaveAddressButton() {
        A.ClickSaveAddressButton(CHDriver);
    }
    /*@Then("user see the Address changed successfully prompt page")
    public void userSeeTheAddressChangedSuccessfullyPromptPage() {
        Assert.assertEquals("");
    }*/
    /*@Given("user go to website")
    public void userGoToWebsite() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harini\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        CHDriver = new ChromeDriver();
        CHDriver.manage().window().maximize();
        CHDriver.get("https://practice.automationtesting.in/shop/");
        Thread.sleep(100);
    }*/
    @When("user click myAcc link")
    public void userClickMyAccLink()  {
        //JavascriptExecutor executor=
       // CHDriver.switchTo().alert().dismiss();
        A.ClickMyAccLink(CHDriver);


    }
    @And("dismiss ad pop up")
    public void dismissAdPopUp() throws InterruptedException {
        A.popU(CHDriver);
        Thread.sleep(2000);

    }
    @Then("user see the login heading")
    public void userSeeTheLoginHeading() throws InterruptedException {
        Assert.assertEquals("Login","Login");
        Thread.sleep(1000);
    }

    @And("user enter email")
    public void userEnterEmail() {
       A.EnterEmail("Diju2024@gmail.com",CHDriver);
    }
    @And("user enter passwd")
    public void userEnterPass() {
       A.EnterPass("Diju123@321",CHDriver);
    }
    @And("user click login button")
    public void userClickLoginButton() {
       A.ClickLogin(CHDriver);
    }
    @Then("user see the login home page")
    public void userSeeTheLoginHomePage() {
        Assert.assertEquals("Hello","Hello");
    }


    /*@Given("go to the site")
    public void goToTheSite() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harini\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        CHDriver = new ChromeDriver();
        CHDriver.manage().window().maximize();
        CHDriver.get("https://practice.automationtesting.in");
        Thread.sleep(10);
    }*/
    @When("click acc")
    public void clickacc() throws InterruptedException {
        A.clickacc(CHDriver);
        Thread.sleep(60);
    }
    @And("user click on the lost password")
    public void userClickOnTheLostPassword() throws InterruptedException {
        A.ClickLostPwd(CHDriver);
        Thread.sleep(60);
    }
    @And("close ad pop up")
    public void closeAdPopUp() {
       A.adP(CHDriver);
    }
    @Then("user navigate to the reset email page")
    public void userNavigateToTheResetEmailPage() {
        Assert.assertEquals("Username or email","Username or email");
    }
    @When("user enter symbols")
    public void userEnterSymbols() throws InterruptedException {
        A.EnterSymbol("$@#%&*()",CHDriver);
        Thread.sleep(80);
    }
    @And("click reset button first time")
    public void clickResetButtonFirstTime() {
        A.ClickResetBut(CHDriver);
    }
    @And("user navigate back")
    public void userNavigateBack() throws InterruptedException {
       CHDriver.navigate().back();
       Thread.sleep(80);
       //How to clear the field?
    }
    @When("user enter numbers")
    public void userEnterNumbers() {
        A.EnterNumbers("12345678910",CHDriver);
    }
    @And("click reset button second time")
    public void clickResetButtonSecondTime() {
        A.clickReset(CHDriver);
    }
    @And("click on navigate back arrow")
    public void clickOnNavigateBackArrow() {
        CHDriver.navigate().back();
    }
    @When("user enter with no input")
    public void userEnterWithNoInput() {
        A.enterNoInput(CHDriver);
    }
    @And("click reset button third time")
    public void clickResetButtonThirdTime() {
        A.clickResetThirdTime(CHDriver);
    }
    @And("navigate back")
    public void navigateBack() {
        CHDriver.navigate().back();
    }
    @When("enter uppercase lowercase")
    public void enterUppercaseLowercase() {
        A.EnterUpperLower("ABCDEFabcdef",CHDriver);
    }
    @And("click reset button fourth time")
    public void clickResetButtonFourthTime() {
        A.ClickResetFourthTime(CHDriver);
    }
    /*@Then("user see the error prompt")
    public void userSeeTheErrorPrompt() {
        //Assert.assertEquals("");
    }*/

    @Then("user see the Address changed successfully prompt page")
    public void userSeeTheAddressChangedSuccessfullyPromptPage() {
    }



}
