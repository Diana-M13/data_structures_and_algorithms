package data_structure_and_algorithms;


import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<String> queue1=new PriorityQueue<>(String.CASE_INSENSITIVE_ORDER);

        queue1.add("a");
        queue1.add("c");
        queue1.add("d");
        queue1.add("D");
        queue1.add("D1");
        queue1.add("z");
        System.out.println(queue1);

        while (queue1.isEmpty()){
            System.out.println(queue1.peek());
        }
    }
}
