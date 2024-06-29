package hillel.lesson17.HW_12_2;

import java.util.List;
public interface Course {
    List<BlockProfessionItem> getCourses();
    List<BlockProfessionItem> getAdditionalCourses();
    List<String> getOpportunities();
//    <T extends Course> goToCategory(String category);

}
