package hillel.lesson17.HW_12_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TestingCoursePage extends BasePage implements Course {

    @FindBy(css = "*.block-profession_list")
    private WebElement blockProfessionList;

    public TestingCoursePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public List<BlockProfessionItem> getCourses() {
        return blockProfessionList
                .findElement(By.cssSelector("*.block-profession_item"))
                .stream()
                .map(item -> PageFactory.initElements(item, BlockProfessionItem.class))
                .toList();
    }

    @Override
    public List<BlockProfessionItem> getCourses() {
        Thread.sleep(5000);
        List<BlockProfessionItem> courses = ArrayList<>();
        for (WebElement item : items) {
            courses.add(PageFactory.initElements(item, BlockProfessionItem.class));
        }
        return courses;
    }

    public <T extends Course> T goToCategory(String category) {
        T coursePage = null;
        switch (category) {
            case TESTING_COURSE_NAME:
                coursePage = (T) new TestingCoursePage(getDriver());
                break;
            default: throw new RuntimeException();
        }
        return coursePage;
    }

    @Override
    public void openPage() {
        openPage(TestingCoursePageConstants.PAGE_LINK);
    }

/*
    public List<Course> getCourses() {
        List<Course> coursList = ArrayList <>();

        for (WebElement cours : courses) {
            courseList.add(PageFactore.initElements(cours, Course.class));
        }
        return coursList;
    }

 */
}
