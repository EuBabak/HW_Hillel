package hillel.lesson17.HW_12_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestingCoursePage1 {
    private static final By MAIN_COURSES_SELECTOR = By.cssSelector(".block-profession > *:not(:last-child) .profession-bar_title");
    private static final By ADDITIONAL_COURSES_SELECTOR = By.cssSelector(".block-profession > *:last-child .profession-bar_title");
    private static final By OPPORTUNITIES_SELECTOR = By.cssSelector("li.opportunity-item:not(:first-child) > p.opportunity-item_title");

    private static final String LINK = "https://ithillel.ua/courses/testing";
    private final WebDriver driver;

    private WebElement programmingButton;
    private WebElement testingButton;
    private WebElement managementButton;
    private WebElement businessTrainingButton;
    private WebElement marketingButton;
    private WebElement designButton;
    private WebElement teenageButton;
    private WebElement kidsButton;

    private List<WebElement> mainCourses;
    private List<WebElement> additionalCourses;
    private List<WebElement> opportunities;

    public TestingCoursePage1 (WebDriver driver) {
        this.driver = driver;
    }
    public void openPage () {
        driver.get(LINK);
    }

    public void getCourses () {
        mainCourses = driver.findElements(MAIN_COURSES_SELECTOR);
        for (WebElement element : mainCourses) {
            System.out.println(element.getText());
        }
    }

    public void getAdditionalCourses () {
        additionalCourses = driver.findElements(ADDITIONAL_COURSES_SELECTOR);
        for (WebElement element : additionalCourses) {
            System.out.println(element.getText());
        }
    }

    public void getOpportunities () {
        opportunities = driver.findElements(OPPORTUNITIES_SELECTOR);
        for (WebElement element : opportunities) {
            System.out.println(element.getText());
        }
    }

    public void goToCategory(String category) {
        switch (category) {
            case "programming":
                programmingButton = driver.findElement(By.cssSelector("a.categories_link[href*=\"" +category +"\"]"));
                programmingButton.click();
            case "testing":
                testingButton = driver.findElement(By.cssSelector("a.categories_link[href*=\"" +category +"\"]"));
                testingButton.click();
            case "management":
                managementButton = driver.findElement(By.cssSelector("a.categories_link[href*=\"" +category +"\"]"));
                managementButton.click();
            case "business-training":
                businessTrainingButton = driver.findElement(By.cssSelector("a.categories_link[href*=\"" +category +"\"]"));
                businessTrainingButton.click();
            case "marketing":
                marketingButton = driver.findElement(By.cssSelector("a.categories_link[href*=\"" +category +"\"]"));
                marketingButton.click();
            case "design":
                designButton = driver.findElement(By.cssSelector("a.categories_link[href*=\"" +category +"\"]"));
                designButton.click();
            case "kids":
                teenageButton = driver.findElement(By.cssSelector("a.categories_link[href*=\"" +category +"\"]"));
                teenageButton.click();
            case "kids-7-11":
                kidsButton = driver.findElement(By.cssSelector("a.categories_link[href*=\"" +category +"\"]"));
                kidsButton.click();
        }
    }
}
