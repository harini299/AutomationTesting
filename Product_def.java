package Stepdef;

import Base.Base;
import Pages.Product;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Product_def extends Base {
    WebDriver CHDriver;
    Product P=new Product();

    Base B= new Base();

    @Given("goto website page")
    public void UserGoToS() throws InterruptedException {
        B.BrowsersIntialize("Chrome");
        CHDriver = new ChromeDriver();
       /* System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harini\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

        CHDriver.manage().window().maximize();
        CHDriver.get("https://practice.automationtesting.in/");
        Thread.sleep(10);*/
    }
    @When("user click shop menu")
    public void userClickShopMenu() {
     P.ShopProduct(CHDriver);
    }
    @Then("navigate to Mastering Javascript book")
    public void navigateToMasteringJavascriptBook() {
        P.NavMasterJavaBook(CHDriver);
    }
    @When("click on add basket")
    public void clickOnAddBasket() {
       P.AddBasket(CHDriver);
    }
    @And("click on cart link")
    public void clickOnCartLink() {
      P.ClickCartLin(CHDriver);
    }
    @When("user click on shop nav menu")
    public void userClickOnShopNavMenu() {
       P.ClickOnShopMenu(CHDriver);
    }
    @And("user click on html product")
    public void userClickOnHtmlProduct() {
        P.HtmlWebApp(CHDriver);
    }
    @And("user click on the category HTML link")
    public void userClickOnTheCategoryHTMLLink() {
        P.CategoryHtmlLink(CHDriver);
    }
    @Then("user see the html products")
    public void userSeeTheHtmlProducts() {
        P.NavigateToProduct(CHDriver);
    }
    @When("user click tag html link")
    public void userClickTagHtmlLink() {
       P.TagHtml(CHDriver);
    }
    @When("user click on shop link nav menu")
    public void userClickOnShopLinkNavMenu() {
       P.ShopNavigationMenu(CHDriver);
    }
    @And("user click on html book")
    public void userClickOnHtmlBook() {
       P.HtmlBook(CHDriver);
    }
    @And("user click review tab")
    public void userClickReviewTab() {
       P.ReviewTab(CHDriver);
    }
    @And("user click on one star rating")
    public void userClickOnOneStarRating() {
       P.OneStarRating(CHDriver);
    }
    @And("user enter review")
    public void userEnterReview() {
        P.EnterReviewFirst("asnkdhsdhsadhasoidhasdasihsacasidh",CHDriver);
    }
    @And("user enter name email id")
    public void userEnterNameEmailId() {
        P.EnterNameEmail("Sarah","sarah2020@gmail.com",CHDriver);
    }
    @And("user click on submit button")
    public void userClickOnSubmitButton() {
       P.SubmitButton(CHDriver);
    }
    @When("user click on two star rating")
    public void userClickOnTwoStarRating() {
        P.TwoStarRating(CHDriver);
    }
    @And("user give some feedbacks")
    public void userGiveSomeFeedbacks() {
        P.EnterReviewSecond("tehHSJHDkjksjadjadksdjakd",CHDriver);
    }
    @And("user enter name email")
    public void userEnterNameEmail() {
        P.EnterNameEmailSecond("Sarah","Robert45@gmail.com",CHDriver);
    }
    @And("user click submit button")
    public void userClickSubmitButton() {
        P.SubmitButtonSecond(CHDriver);
    }
    @When("user click on three star rating")
    public void userClickOnThreeStarRating() {
        P.ThreeStarRating(CHDriver);
    }
    @And("user give some inputs")
    public void userGiveSomeInputs() {
        P.EnterReviewThird("I like the brief content",CHDriver);
    }
    @And("user enter name email in the field")
    public void userEnterNameEmailInTheField() {
       P.EnterNameEmailThird("Harsha","harsha20@gmail.com",CHDriver);
    }
    @And("user click submit button third time")
    public void userClickSubmitButtonThirdTime() {
        P.SubmitButtonThird(CHDriver);
    }
    @When("user click four star rating")
    public void userClickFourStarRating() {
        P.FourStarRating(CHDriver);
    }
    @And("user provide some reviews")
    public void userProvideSomeReviews() {
        P.EnterReviewFourth("The book sjdsdasjksjk",CHDriver);
    }
    @And("enter name and email")
    public void enterNameAndEmail() {
        P.EnterNameEmailFourth("Dayan","Dayan20@gmail.com",CHDriver);
    }
    @And("click submit button")
    public void clickSubmitButton() {
        P.SubmitButtonFourth(CHDriver);
    }
    @When("user click on five star rating")
    public void userClickOnFiveStarRating() {
        P.FiveStarRating(CHDriver);
    }
    @And("user provide inputs")
    public void userProvideInputs() {
        P.EnterReviewFifth("The book has hshdjasdh",CHDriver);
    }
    @And("enter user name and email")
    public void enterUserNameAndEmail() {
        P.EnterNameEmailFifth("khan","harshak20@gamil.com",CHDriver);
    }
    @And("click on submit button")
    public void clickOnSubmitButton() {
        P.SubmitButtonFifth(CHDriver);
    }
    @Then("user get the prompts Your comment is awaiting approval")
    public void userGetThePromptsYourCommentIsAwaitingApproval() {
    }
}
