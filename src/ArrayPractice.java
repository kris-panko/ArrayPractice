import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    Scanner scanner = new Scanner(System.in);

    public void task1() {
        int[] array = {1, 2, 3};
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index " + i + ": " + array[i]);
        }
    }

    public void task2() {
        int[] array = {13, 5, 7, 68, 2};
        int middleIndex = array.length / 2;
        System.out.println("Middle element: " + array[middleIndex]);
    }

    public void task3() {
        String[] colors = {"red", "green", "blue", "yellow"};
        System.out.println("Array length: " + colors.length);
    }

    public void task4() {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);
        // Uncomment the line below to see the exception produced
        // System.out.println("Value at index length: " + numbers[numbers.length]);
        // Uncomment the line below to see the exception produced
        // numbers[numbers.length] = 6;
    }

    public void task5() {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println("Array: " + Arrays.toString(array));
    }

    public void task6() {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }
        System.out.println("Array: " + Arrays.toString(array));
    }

    public void task7() {
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            if (i != 2) {
                System.out.println("Element at index " + i + ": " + array[i]);
            }
        }
    }

    public void task8() {
        String[] array = {"one", "two", "three", "four", "five"};
        System.out.println("Before swap: " + Arrays.toString(array));
        String temp = array[0];
        array[0] = array[array.length / 2];
        array[array.length / 2] = temp;
        System.out.println("After swap: " + Arrays.toString(array));
    }

    public void task9() {
        int[] array = {4, 2, 9, 13, 1, 0};
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("The smallest number is " + array[0]);
        System.out.println("The biggest number is " + array[array.length - 1]);
    }

    public void task10() {
        Object[] array = {1, "two", "three", "four", 5.0};
        System.out.println("Array: " + Arrays.toString(array));
    }

    public void task11() {
        System.out.println("How many favorite things do you have?");
        int numFavorites = scanner.nextInt();
        String[] favorites = new String[numFavorites];
        scanner.nextLine(); // Consume newline character
        for (int i = 0; i < numFavorites; i++) {
            System.out.println("Enter your thing: ");
            favorites[i] = scanner.nextLine();
        }
        System.out.println("Your favorite things are: " + Arrays.toString(favorites));
    }
}