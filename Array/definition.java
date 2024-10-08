/**
 * definition
 */
public class definition {
    public static void main(String[] args) {

        // ============ One dimentional array =============>
        // int array =>
        // int[] age = { 1, 2, 3, 4 };
        // for (int i = 0; i < age.length; i++) {
        // System.out.println(age[i] + "<----- int is here!");
        // }

        // // String array =>
        // String[] car = { "hoda", "ertiga" };
        // for (int i = 0; i < car.length; i++) {
        // System.out.println(car[i] + "<----- String is here!");
        // }

        // // float array =>
        // float[] decimal = { 5.3f, 5.5f, 4.6f };
        // for (int i = 0; i < decimal.length; i++) {
        // System.out.println(decimal[i] + "<----- float is here!");
        // }

        // // char array =>
        // char[] vowels = { 'a', 'b', 'c' };
        // for (int i = 0; i < vowels.length; i++) {
        // System.out.println(vowels[i] + "<----- char is here!");
        // }

        // ====== Multi dimentional array ===============>
        // int array =>
        int[][] numbers = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j] + "<------ int multidimentional array!");
            }
        }

        // string array =>
        String[][] words = { { "hey", "hello" }, { "jitesh", "jay" } };
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                System.out.println(words[i][j] + "<------ string multidimentional array!");
            }
        }

        // char array =>
        char[][] vowels = { { '1', '2' }, { '3', '4' } };
        for (int i = 0; i < vowels.length; i++) {
            for (int j = 0; j < vowels[i].length; j++) {
                System.out.println(vowels[i][j] + "<------ char multidimentional array!");
            }
        }

        // float array =>
        float[][] decimals = { { 2.3f, 3.0f }, { 2.6f, 3.4f } };
        for (int i = 0; i < decimals.length; i++) {
            for (int j = 0; j < decimals[i].length; j++) {
                System.out.println(decimals[i][j] + "<------ char multidimentional array!");
            }
        }
    }
}