package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckOut {
    public void ClickShopCheckout(WebDriver CHDriver){
        CHDriver.findElement(By.linkText("Shop")).click();
        /*WebDriverWait wait = new WebDriverWait(CHDriver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.titleContains("Products – Automation Practice Site"));*/
        }
        public void Scroll(WebDriver CHDriver){
            JavascriptExecutor j = (JavascriptExecutor) CHDriver;
            j.executeScript("window.scrollBy(0,1200)");
        }
        public void SeleniumRuby(WebDriver CHDriver){
            Actions act =  new Actions(CHDriver);
            act.moveToElement(CHDriver.findElement(By.xpath("//a//img[@alt='Selenium Ruby']"))).click().perform();
        }
        public void AddToBasket(WebDriver CHDriver)  {
            Actions act =  new Actions(CHDriver);
            act.moveToElement(CHDriver.findElement(By.className("single_add_to_cart_button"))).click().perform();
            //CHDriver.findElement(By.className("button")).click();//
        /*WebDriverWait w = new WebDriverWait(CHDriver, Duration.ofSeconds(20));
        w.until(ExpectedConditions.visibilityOfElementLocated (By.linkText("Subscribe to Premium")));*/
        }
        public void ClickOnCartButton(WebDriver CHDriver){
            CHDriver.findElement(By.className("wpmenucart-contents")).click();
           }
        public void ProceedCheckO(WebDriver CHDriver){
            CHDriver.findElement(By.linkText("Proceed to Checkout")).click();
        }
        public void BillingDetails(WebDriver CHDriver){
            Assert.assertEquals("Billing Details","Billing Details");
        }
        public void FirstNLastNCompanyNEmail(String Fn,String Ln,String Cn,String E,String Phone,WebDriver CHDriver){
            CHDriver.findElement(By.id("billing_first_name")).sendKeys(Fn);
            CHDriver.findElement(By.name("billing_company")).sendKeys(Ln);
            CHDriver.findElement(By.id("billing_company")).sendKeys(Cn);
            CHDriver.findElement(By.id("billing_email")).sendKeys(E);
            CHDriver.findElement(By.id("billing_phone")).sendKeys(Phone);
        }
        public void SelectCountry(String Country,WebDriver CHDriver){
            CHDriver.findElement(By.id("s2id_billing_country")).click();
            CHDriver.findElement(By.name("select2-input")).sendKeys(Country);
        }
        public void EnterAddressC(String Add,String City,WebDriver CHDriver){
          CHDriver.findElement(By.id("billing_address_1")).sendKeys(Add);
          CHDriver.findElement(By.id("billing_city")).sendKeys(City);
        }
        public void SelectCityState(String State,WebDriver CHDriver){
          CHDriver.findElement(By.xpath("//*[@id=\"s2id_billing_state\"]/a")).click();
          CHDriver.findElement(By.xpath("//*[@id=\"s2id_autogen2_search\"]")).sendKeys(State);
        }
        public void EnterZip(String Zip,WebDriver CHDriver){
          CHDriver.findElement(By.id("billing_postcode")).sendKeys(Zip);
        }
      public void SelectPay(WebDriver CHDriver){
        CHDriver.findElement(By.id("payment_method_ppec_paypal")).click();
      }
     public void PlaceOrd(WebDriver CHDriver){
         CHDriver.findElement(By.id("place_order")).click();
}    }

