package hillel.lesson17.HW_12_2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BlockProfessionItem {

    @FindBy(className = "profession-bar_title")
    private WebElement title;
    @FindBy(className = "profession-subtitle_grade")
    private WebElement subTitle;
    @FindBy(className = "profession-bar_descr")
    private WebElement description;
    public String gerCourseName() {
        return title.getText();
    }

    @Override
    public String toString() {
        return "BlockProfessionItem{ " +
                "title= " + title.getText() +
                ", subTitle= " + subTitle.getText() +
                ", description= " + description.getText() +
                '}';
    }
}
