package ashiqe;

public class exception1 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            
        } finally {
            System.out.println("The End");
        }
    }
}
