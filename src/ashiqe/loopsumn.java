package ashiqe;

public class loopsumn {
    void sum(double... numbers) {
        double sum = 0;
        for (double x : numbers) {
            sum += x;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        loopsumn ob = new loopsumn();
        ob.sum(5.7);
        ob.sum(5, 10, 8);
        ob.sum(3, 6, 4, 2);
    }
}
