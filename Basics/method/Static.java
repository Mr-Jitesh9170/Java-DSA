/* 
 * Static method => in case of static method if any method type is static , it means it belongs to the main method, and void type does not return anything.
 * 
 */

public class Static {

    public static void print() {
        System.out.println("hello world!");
    }

    public static void multipleArguments(String name, String lastName) {
        System.out.println(name + " " + lastName);
    }

    public static void main(String[] args) {
        print();
        multipleArguments("Jitesh", "pandey");
    }
}