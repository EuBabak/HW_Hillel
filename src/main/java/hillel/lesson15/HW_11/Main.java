package hillel.lesson15.HW_11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import static java.sql.DriverManager.getDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        WebDriver browser = new SafariDriver();
        browser.get("https://ithillel.ua/");

        browser.manage().window().maximize();
//        browser.manage().timeouts().impicitlyWait(Duration.ofMillis(10));

        WebElement switchoverProgrammingButton = browser.findElement(By.cssSelector("[href=\"https://ithillel.ua/"));

        switchoverProgrammingButton.click();

        Thread.sleep(5000);

        String acceptButtonSelector = "button.btn.-small.-light.cookie-ntf_agreement";

        browser.findElement(By.cssSelector(acceptButtonSelector)).click();

        Thread.sleep(5000);

        WebElement frontEndBasicButton = browser.findElement(By.cssSelector("a.block-profession_link.prof"));

        ((JavascriptExecutor) browser).executeScript("arguments[0].scrollIntoView(true);");

        Thread.sleep(1000);

        frontEndBasicButton.click();

        Thread.sleep(5000);

        FluentWait<WebDriver> wait = new FluentWait<>(browser)
                .pollingEvery(Duration.ofMillis(100))
                .withTimeout(Duration.ofSeconds(15))
                .ignoring(NoSuchElementException.class);

        WebElement coachSection = wait.until((WebDriver driver) -> {
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0.200)");
            return driver.findElement(By.id("coachSection"));
        });

        System.out.println(coachSection);

        List<WebElement> coachesNames = coachSection.findElements(By.className("coach-card_name"));
        coachesNames.stream().map(WebElement::getText).forEach(System.out::println);
    }
}
