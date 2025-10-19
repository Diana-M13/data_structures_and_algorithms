package data_structure_and_algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<String> queue1 = new LinkedList<>();
        queue1.add("client 1");
        queue1.add("client 2");
        queue1.add("client 3");
        queue1.add("client 4");
        queue1.add("client 5");
        queue1.add("client 6");
        queue1.add("client 7");
        queue1.add("client 8");
        queue1.add("client 9");

        System.out.println(queue1);

        System.out.println(queue1.element());
        System.out.println(queue1.remove("client 2"));
        System.out.println(queue1.isEmpty());
        System.out.println(queue1.contains("sdfh"));
        System.out.println(queue1.peek());
        queue1.poll();
        System.out.println(queue1);
        queue1.poll();
        System.out.println(queue1);
        queue1.poll();
        System.out.println(queue1);
        queue1.poll();
        System.out.println(queue1);


    }
}
