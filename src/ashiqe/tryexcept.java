package ashiqe;

public class tryexcept {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int c = a / b;
            String S = "DIU";
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index out of bounds exception occurred: " + e.getMessage());
        }
    }
}
