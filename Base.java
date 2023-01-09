package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {  //By using Base parent class I can access all the methods and properties from the base class to the child classes
    public static WebDriver CHDriver;
    public void BrowsersIntialize(String browser) {
        if (browser.equalsIgnoreCase("Chrome")) {//The equalsIgnoreCase() method compares two strings, ignoring lower case and upper case differences.
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harini\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
            CHDriver = new ChromeDriver();
            CHDriver.manage().window().maximize();
            CHDriver.get("https://practice.automationtesting.in/");
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Harini\\Desktopthis.\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
            CHDriver = new FirefoxDriver();
            CHDriver.manage().window().maximize();
            CHDriver.get("https://practice.automationtesting.in/");
        } else if (browser.equalsIgnoreCase("edge")) {
            //set path of msedgedriver.exe path
            System.setProperty("webdriver.edge.driver", "C:\\Users\\Harini\\Downloads\\edgedriver_win64\\msedgedriver.exe");
            //instance of EdgeDriver
            CHDriver = new EdgeDriver();
            //URL launch
            CHDriver.manage().window().maximize();
            CHDriver.get("https://practice.automationtesting.in/");
        }

    }
}
