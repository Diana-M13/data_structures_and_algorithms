package data_structure_and_algorithms;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVsArrayList {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Fill both lists with 1,000,000 elements
        for (int i = 0; i < 1_000_000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        // Test: removing elements from different positions
        System.out.println("=== Performance Comparison ===");

        long linkedListTime = measureTime(() -> {
            linkedList.remove(5000);
            linkedList.remove(999_989);
        });

        long arrayListTime = measureTime(() -> {
            arrayList.remove(5000);
            arrayList.remove(999_989);
        });

        System.out.println("LinkedList: " + linkedListTime + " ns");
        System.out.println("ArrayList:  " + arrayListTime + " ns");
    }

    private static long measureTime(Runnable action) {
        long start = System.nanoTime();
        action.run();
        return System.nanoTime() - start;
    }
}
