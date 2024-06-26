package hillel.lesson19.HW_13;

import java.util.Random;

public class UserProvider {

    private static final String [] userName = new String[] {"Danial","Boris", "Vitalia", "Sonya", "Nazar"};
    private static final Integer [] userAge = new Integer[] {15, 75, 41, 27, 34, 52, 61, 20};
    private static final String [] userGender = new String[] {"Female", "Male"};
    private static final String [] userEmail = new String[] {null, "test@gmail.com", "test@ukr.net", "test@amazon.com", "test@microsoft.com"};

    public static User getUser() {
        Random random = new Random();
        return new User(userName[random.nextInt(userName.length)], userAge[random.nextInt(userAge.length)], userEmail[random.nextInt(userEmail.length)], userGender[random.nextInt(userGender.length)]);
    }
}
