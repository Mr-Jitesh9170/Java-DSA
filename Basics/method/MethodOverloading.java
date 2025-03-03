// Method Overloading => method overloading means multiple method can be similer name with different parameters.
// Note=> 1- In case of method overloading during the excecution , it identified by parameters that which method being used.
public class MethodOverloading {
    
    static int sum(int a, int b) {
        return a + b;
    }

    static float sum(float a, float b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        float floatSum = sum(1.5f, 2.54f);
        int intSum = sum(4, 5);
        int multiSum=sum(1, 2,3);

        System.out.println("Float sum => " + floatSum);
        System.out.println("Int sum => " + intSum);
        System.out.println("Int sum => " + multiSum);
    }
}
