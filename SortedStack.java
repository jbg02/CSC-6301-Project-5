
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * This class contains functions used to sort integer arrays into a stack, a
 * function used to collect an array of integers from the user, as well as a
 * main function which calls these functions for demonstrative purposes.
 *
 * This class originally dealt with sorting arrays into linked lists. It has
 * been altered where necessary to sort arrays into stacks.
 *
 * @author Joshua Gabel
 * @version 1.0.2
 * @since 9/23/2022, updated 10/5/2022
 */
public class SortedStack {

    /**
     * Main function
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] numbers = {2, 45, 37, 21, 31, 50, 29, 22, 67, 88, 56};
        System.out.println("Example 1 (hard-coded):");
        System.out.println(Arrays.toString(numbers) + " sorted into a stack:");
        Stack<Integer> sorted = sortedStack(numbers);
        System.out.println(sorted);
        System.out.println();

        int[] numbersTwo = {5, 4, 3, 2, 1};
        System.out.println("Example 2 (hard-coded):");
        System.out.println(Arrays.toString(numbersTwo) + " sorted into a stack:");
        Stack<Integer> sortedTwo = sortedStack(numbersTwo);
        System.out.println(sortedTwo);
        System.out.println();

        System.out.println("Example 3 (user input):");
        int[] numbersThree = getUserInput();
        System.out.println(Arrays.toString(numbersThree) + " sorted into a stack:");
        Stack<Integer> sortedThree = sortedStack(numbersThree);
        System.out.println(sortedThree);

    }

    /**
     * This method prompts user for a list of integers, stores them in and
     * returns an integer array.
     *
     * Originally, this function prompted user for a list of integers, stored
     * them in an array, then called SortedLinkedList() in order to return a
     * linked list. When this project was updated to store numbers in a sorted
     * stack, this method was altered to simply return the array, rather than
     * calling another function and returning that result. This was done so that
     * this function could be more general and relevant for other purposes.
     *
     * @return an integer array of user input integers
     */
    public static int[] getUserInput() {
        Scanner in = new Scanner(System.in);
        // prompt for length of array
        System.out.println("Enter number of integers: ");
        int numberOfInts = in.nextInt();
        int[] numbers = new int[numberOfInts];

        // prompt for each integer and store in array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter integer ");
            int add = in.nextInt();
            numbers[i] = add;
        }
        return numbers;
    }

    /**
     * This method receives an integer array as input and iterates through the
     * array adding each element to a stack (originally: linked list) in
     * ascending order and returning the result.
     *
     * @param numbers, an array of integers.
     * @return, a sorted Stack consisting of integers from numbers
     */
    public static Stack<Integer> sortedStack(int[] numbers) {
        Stack<Integer> solution = new Stack<>();
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            solution.push(numbers[i]);
        }
        return solution;

    }
}
