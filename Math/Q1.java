// check the number is the prime number or not ?

public class Q1 {
    public static void checkPrime(int num) {
        int sum = 0, count = 0;
        for (int i = 2; i < num; i++) {
            int value = num % i;
            if (value == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }

    public static void main(String[] args) {
        int num = 6;
        checkPrime(num);
    }
}