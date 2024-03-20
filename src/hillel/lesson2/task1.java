package hillel.lesson2;

public class task1 {
    public static void main(String[] args) {
        int baseOfExponent = Integer.parseInt(args[0]);
        int exponent = Integer.parseInt(args[1]);

        double result = Math.pow(baseOfExponent,exponent);

        System.out.println(result);

}
}

