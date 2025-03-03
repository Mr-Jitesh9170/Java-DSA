// Return Method => in java a method can return primitive type data.
public class Return {

    public static int sum(int a, double b) {
        int sum = a + (int) b;
        return sum;
    }

    public static void main(String[] args) {
        int sum = sum(10, 40.50d);
        System.out.println(sum);
    }
}
