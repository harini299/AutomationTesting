package Pages;

import Base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Product extends Base {
    public void ShopProduct(WebDriver CHDriver){
        CHDriver.findElement(By.xpath("//header//div/nav//li//a[text()='Shop']")).click();
    }
    public void NavMasterJavaBook(WebDriver CHDriver){
        JavascriptExecutor j = (JavascriptExecutor) CHDriver;
        j.executeScript("window.scrollBy(0,1800)");
    }
    public void AddBasket(WebDriver CHDriver){
        CHDriver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[7]/a[2]")).click();
    }
    public void ClickCartLin(WebDriver CHdriver){
        CHdriver.findElement(By.xpath("//*[@id=\"wpmenucartli\"]/a")).click();
    }
    public void ClickOnShopMenu(WebDriver CHDriver){
        CHDriver.findElement(By.xpath("//header//div/nav//li//a[text()='Shop']")).click();
    }
    public void HtmlWebApp(WebDriver CHDriver){
        CHDriver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[4]/a[1]/img")).click();
    }
    public void CategoryHtmlLink(WebDriver CHDriver){
        CHDriver.findElement(By.xpath("//*[@id=\"product-182\"]/div[2]/div[3]/span[1]/a")).click();
    }
    public void NavigateToProduct(WebDriver CHDriver){
        CHDriver.navigate().to("https://practice.automationtesting.in/product/html5-webapp-develpment/");
    }
    public void TagHtml(WebDriver CHDriver){
        CHDriver.findElement(By.linkText("html")).click();
    }
    public void ShopNavigationMenu(WebDriver CHDriver){
        CHDriver.findElement(By.xpath("//header//div/nav//li//a[text()='Shop']")).click();
    }
    public void HtmlBook(WebDriver CHDriver){
        CHDriver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[3]/a[1]/img")).click();
    }
    public void ReviewTab(WebDriver CHDriver){
       CHDriver.findElement(By.xpath("//*[@id=\"product-181\"]/div[3]/ul/li[2]/a")).click();
    }
    public void OneStarRating(WebDriver CHDriver){
       CHDriver.findElement(By.xpath("//*[@id=\"commentform\"]/p[2]/p/span/a[1]")).click();
    }
    public void EnterReviewFirst(String ReviewFirst,WebDriver CHDriver){
       CHDriver.findElement(By.xpath("//*[@id=\"comment\"]")).sendKeys(ReviewFirst);
    }
    public void EnterNameEmail(String name,String email,WebDriver CHDriver){
        CHDriver.findElement(By.id("author")).sendKeys(name);
        CHDriver.findElement(By.id("email")).sendKeys(email);
    }
    public void SubmitButton(WebDriver CHDriver){
        CHDriver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
    }
    public void TwoStarRating(WebDriver CHDriver){
        CHDriver.findElement(By.xpath("//*[@id=\"commentform\"]/p[2]/p/span/a[2]")).click();
    }
    public void EnterReviewSecond(String ReviewSecond,WebDriver CHDriver){
        CHDriver.findElement(By.xpath("//*[@id=\"comment\"]")).sendKeys(ReviewSecond);
    }
    public void EnterNameEmailSecond(String NameS,String EmailS,WebDriver CHDriver){
        CHDriver.findElement(By.id("author")).sendKeys(NameS);
        CHDriver.findElement(By.id("email")).sendKeys(EmailS);
    }
    public void SubmitButtonSecond(WebDriver CHDriver){
        CHDriver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
    }
    public void ThreeStarRating(WebDriver CHDriver){
        CHDriver.findElement(By.xpath("//*[@id=\"commentform\"]/p[2]/p/span/a[3]")).click();
    }
    public void EnterReviewThird(String ReviewThird,WebDriver CHDriver){
        CHDriver.findElement(By.xpath("//*[@id=\"comment\"]")).sendKeys(ReviewThird);
    }
    public void EnterNameEmailThird(String NameT,String EmailT,WebDriver CHDriver){
        CHDriver.findElement(By.id("author")).sendKeys(NameT);
        CHDriver.findElement(By.id("email")).sendKeys(EmailT);
    }
    public void SubmitButtonThird(WebDriver CHDriver){
        CHDriver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
    }
    public void FourStarRating(WebDriver CHDriver) {
        CHDriver.findElement(By.xpath("//*[@id=\"commentform\"]/p[2]/p/span/a[4]")).click();
    }
    public void EnterReviewFourth(String ReviewFourth,WebDriver CHDriver){
        CHDriver.findElement(By.xpath("//*[@id=\"comment\"]")).sendKeys(ReviewFourth);
    }
    public void EnterNameEmailFourth(String NameF,String EmailF,WebDriver CHDriver){
        CHDriver.findElement(By.id("author")).sendKeys(NameF);
        CHDriver.findElement(By.id("email")).sendKeys(EmailF);
    }
    public void SubmitButtonFourth(WebDriver CHDriver){
        CHDriver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
    }
    public void FiveStarRating(WebDriver CHDriver) {
        CHDriver.findElement(By.xpath("//*[@id=\"commentform\"]/p[2]/p/span/a[5]")).click();
    }
    public void EnterReviewFifth(String ReviewFifth,WebDriver CHDriver){
        CHDriver.findElement(By.xpath("//*[@id=\"comment\"]")).sendKeys(ReviewFifth);
    }
    public void EnterNameEmailFifth(String NameFi,String EmailFi,WebDriver CHDriver){
        CHDriver.findElement(By.id("author")).sendKeys(NameFi);
        CHDriver.findElement(By.id("email")).sendKeys(EmailFi);
    }
    public void SubmitButtonFifth(WebDriver CHDriver){
        CHDriver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
    }




}
