package Stepdef;

//import Modules.FooterElement;

import Pages.Footer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Footer_defs {
    WebDriver CHDriver;
    Footer f = new Footer();

    @Given("user go to the web application")
    public void userGotoTheWebApplication() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harini\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        CHDriver = new ChromeDriver();
        CHDriver.manage().window().maximize();
        CHDriver.get("https://practice.automationtesting.in/");
        Thread.sleep(1000);
    }

    @When("user should scroll down to the footer elements")
    public void userShouldScrollDownToTheFooterElements() throws InterruptedException {
        /*Actions LinkedIn = new Actions(CHDriver);
        //at.sendKeys(Keys.PAGE_DOWN).build().perform();
        CHDriver.findElement(By.className("fa"));
        linkedIn.sendKeys(Keys.PAGE_DOWN);*/
        f.scrollDown(CHDriver);
        Thread.sleep(1000);

    }

    @And("user click on the linkedin fav icon")
    public void userClickOnTheLinkedinFavIcon() throws InterruptedException {
        f.clickLinkedin(CHDriver);
        Thread.sleep(1000);
    }

    @Then("user direct to the automation testing linkedin page")
    public void userDirectToTheAutomationTestingLinkedinPage() {
        //LinkedIn: Log In or Sign Up
        Set<String> s = CHDriver.getWindowHandles();

        //String W_handle=CHDriver.getWindowHandle();//switchTo().window(i);
        for (String i : s) {
            String title = CHDriver.switchTo().window(i).getTitle();

            if (title.contains("LinkedIn: Log In or Sign Up")) ;
            {
                System.out.println("LinkedIn window appeared");

            }
        }
    }

    @And("user take screenshot")
    public void userTakeScreenshot() {
        f.screenShotOfLinkedin(CHDriver);
        CHDriver.close();
    }
}
