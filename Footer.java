package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Footer {

    public void scrollDown(WebDriver CHDriver){
        JavascriptExecutor j = (JavascriptExecutor) CHDriver;
        j.executeScript("window.scrollBy(0,1800)");
    }
    public void clickLinkedin(WebDriver CHDriver){
        CHDriver.findElement(By.xpath("//*[@id=\"themify-social-links-2\"]/ul/li[5]/a")).click();
    }
    public void screenShotOfLinkedin(WebDriver CHDriver){
        File screenshotFile = ((TakesScreenshot) CHDriver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(screenshotFile, new File("C:\\Users\\Harini\\IdeaProjects\\ScreenShots\\linkedin.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
