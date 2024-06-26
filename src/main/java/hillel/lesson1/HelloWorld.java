package hillel.lesson1;

public class HelloWorld {
    public static void main(String[] args) {
//        String symbol = "*";
//        int numberOfStars;
//        for (int i = 0; i < 10; i++) {
//            System.out.println(
//                    generateFrom( numberOfStars : 10, symbol));
//
//        }
//    }
//    public static String generateFrom (
//            int numberOfStars, String symbol ) {
//        StringBuffer builder = new StringBuffer();
//        for (int i = 0; i < 10; i++) {
//            builder.append(symbol);
//
//        }
//        return builder.toString();
//    }
//}
//










        int width = 5;
        int height = 3;

        for (int i = 0; i <height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

