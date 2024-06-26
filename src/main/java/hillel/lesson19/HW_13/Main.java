package hillel.lesson19.HW_13;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Map<String, List<User>> collect = Stream.generate(() -> UserProvider.getUser())
                .limit(20)
                .filter(u -> u.getAge() > 18)
                .filter(e -> e.getEmail() != null)
                .sorted((u1, u2) -> u1.getName().compareTo(u2.getName()))
                .collect(Collectors.groupingBy(User::getGender));
        System.out.println(collect);
    }

}
