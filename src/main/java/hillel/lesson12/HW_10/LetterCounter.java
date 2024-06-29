package hillel.lesson12.HW_10;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public class LetterCounter {
    public static void main(String[] args) {

        String sentence = "Домашне завдання 10";

        Map<Character, Integer> letterCountMap = new HashMap<>();

        for (char c : sentence.toCharArray()) {
            if (c != ' ') {
                int count = letterCountMap.getOrDefault(c, 0);
                letterCountMap.put(c, count + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : letterCountMap.entrySet()) {
            System.out.println("Літера '" + entry.getKey() + "' зустрічається " + entry.getValue() + " разів.");
        }
    }
}
