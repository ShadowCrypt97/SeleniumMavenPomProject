package org.example.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static org.example.utils.Constants.TIMEOUT;

public class HelperClass {
    private static HelperClass helperClass;
    private static WebDriver driver;
    public HelperClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();
    }
    public static void openPage(String url) {
        driver.get(url);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static WebElement webDriverFluentWait(int timeoutSegundos,
                                                 int intervaloReintentosSegundos,
                                                 WebElement webElement){
        return new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(timeoutSegundos))
                .pollingEvery(Duration.ofSeconds(intervaloReintentosSegundos))
                .ignoring(NoSuchElementException.class).until(driver -> webElement);
    }
    public static void setUpDriver() {

        if (helperClass==null) {

            helperClass = new HelperClass();
        }
    }

    public static void tearDown() {

        if(driver!=null) {
            driver.close();
            driver.quit();
        }

        helperClass = null;
    }

}
