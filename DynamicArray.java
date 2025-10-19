package data_structure_and_algorithms;

import java.util.*;

public class DynamicArray {
    public static void main(String[] args) {
        ArrayList<Integer> dynamicArray =
                new ArrayList<>(Arrays.asList(2, 3, 4, 5, 3, 2, 1, 0, 6, 7, 5, 4, 2, 1, 3));

        System.out.println("Dynamic Array : " + dynamicArray);

        reversedDynamicArray(dynamicArray);
        System.out.println("Reversed : " + dynamicArray);

        System.out.println("The maximum is : " + getMax(dynamicArray));

        removeDuplicates(dynamicArray);
        System.out.println("Without duplicates : " + dynamicArray);

        System.out.println("The sum of elements is : " + sumOfElements(dynamicArray));

        insertElements(dynamicArray, 567, 12);
        System.out.println("After inserting : " + dynamicArray);
    }

    // Task 1: Reverse a Dynamic Array
    public static void reversedDynamicArray(ArrayList<Integer> dynamicArray) {
        Collections.reverse(dynamicArray);
    }

    // Task 2: Find Maximum Element
    public static int getMax(ArrayList<Integer> dynamicArray) {
        int max = dynamicArray.get(0);
        for (int i = 1; i < dynamicArray.size(); i++) {
            if (dynamicArray.get(i) > max) {
                max = dynamicArray.get(i);
            }
        }
        return max;
    }

    // Task 3: Remove Duplicates
    public static void removeDuplicates(ArrayList<Integer> dynamicArray) {
        HashSet<Integer> seen = new HashSet<>();
        for (int i = 0; i < dynamicArray.size(); ) {
            if (seen.contains(dynamicArray.get(i))) {
                dynamicArray.remove(i); // remove by index, not by value
            } else {
                seen.add(dynamicArray.get(i));
                i++;
            }
        }
    }

    // Task 4: Dynamic Array Sum
    public static int sumOfElements(ArrayList<Integer> dynamicArray) {
        int sum = 0;
        for (int num : dynamicArray) { // cleaner enhanced loop
            sum += num;
        }
        return sum;
    }

    // Task 5: Insert at Position
    public static void insertElements(ArrayList<Integer> dynamicArray, int element, int index) {
        if (index >= 0 && index <= dynamicArray.size()) {
            dynamicArray.add(index, element);
        } else {
            dynamicArray.add(element); // ArrayList doesn’t have addLast()
            System.out.println("Index out of range — element added at the end.");
        }
    }
}
