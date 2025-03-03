
public class CreatingCLass {
    int a;
    int b;

    CreatingCLass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return a + b;
    }

    // inner class =>
    public class InnerClass {
        int a;
        float b;

        InnerClass(int a, float b) {
            this.a = a;
            this.b = b;
        }
    }

    public static void main(String[] args) {
        // created class in main class =>
        CreatingCLass obj1 = new CreatingCLass(23, 23);
        System.out.println(obj1.a + " " + obj1.b);
        System.out.println(obj1.sum());

        // created object of inner class =>
        CreatingCLass.InnerClass firstClass = obj1.new InnerClass(2332, 0323f);
        System.out.println(firstClass.a + " " + firstClass.b);

        // outer class object =>
        OuterClass outerObj = new OuterClass(322, 322);
        System.out.println(outerObj.sum());
    }
}

// if creating outer class keep it without using public keyword, otherwise you will have to create this class in another file then you can use of public keyword
// because public keyword used to access that class , which is created inside to the other file or packages.
class OuterClass {
    int a;
    int b;

    OuterClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return a + b;
    }
}
