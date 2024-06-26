package hillel.lesson13;

public class Main3 {
    public static RuntimeException main(String[] args) {
        Exception throwException;{
            try{
                RuntimeException exception = new RuntimeException();
                return exception;
            } catch (Exception e) {
                System.out.println("catch exception");
            }
        }
        return null;
    }
}
