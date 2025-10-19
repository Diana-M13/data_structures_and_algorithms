package data_structure_and_algorithms;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Spliterator;

public class ArrayDequeDemo {
    public static void main(String[] args) {

        ArrayDeque<String> q1 = new ArrayDeque<>();

        q1.add("a");
        q1.add("b");
        q1.add("z");
        q1.add("h");
        q1.add("f");

        System.out.println(q1+"  q1");
        System.out.println(q1.size()+ " size ");

        Iterator<String> i = q1.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println(q1.peek()+ " peek");
        q1.addLast("g");
        System.out.println(q1);
        System.out.println(q1.size());
        System.out.println(q1.offerFirst("asd"));
        System.out.println(q1.offerLast("asd"));
        System.out.println(q1);
        Spliterator spliterator= q1.spliterator();
        spliterator.forEachRemaining(System.out::println);
        spliterator.forEachRemaining(w->System.out.println(w));

    }
}
