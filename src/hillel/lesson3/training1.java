package hillel.lesson3;

import java.util.Arrays;

public class training1 {
    public static void main(String[] args) {

//       Масив - впорядкований набір даних/ колекція даних

//       приклад написання масивів

        int[] defoultIntegers = new int[7];
        int[] integers = {10, 20, -25, 14};
        Integer[] wrapperIntegers = new Integer[4];
        boolean[] booleans = new boolean[5];
        String[] strings = new String[8];

        System.out.println(Arrays.toString(defoultIntegers));
        System.out.println(Arrays.toString(integers));
        System.out.println(Arrays.toString(booleans));
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(wrapperIntegers));

//        приклад двовимірного масиву
//        двовимірність - вкладеність

//        int[][] twoDimensionalArray = new int[3][];
//        всі змінні лежать в стеку

        int[][] twoDimensionalArray = new int[3][];
        twoDimensionalArray[0] = new int[]{0,1,2,3};
        twoDimensionalArray[1] = new int[]{10,11,12,13};
        twoDimensionalArray[2] = new int[]{20,21,22,23};

        System.out.println(twoDimensionalArray[2][3]);


        int[][] threeDimensionalArray = new int[3][];

    }
}
