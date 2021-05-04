import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
//        the results come back like this {[I@5acf9800}
        System.out.println(Arrays.toString(numbers));
        System.out.println();
        String[] Person = {"Tony", "Steve", "Bruce"};
        for (String Avenger : Person) {
            System.out.println(Avenger);
        }
    }
}
