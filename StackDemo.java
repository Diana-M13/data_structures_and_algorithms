package data_structure_and_algorithms;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("item 1");
        stack.push("item 2");
        stack.push("item 3");
        stack.push("item 4");
        stack.push("item 5");
        stack.push("item 6");
        stack.push("item 7");
        stack.push("item 8");
        stack.push("item 9");
        stack.push("item 10");

        System.out.println(stack.getLast());

        System.out.println(stack.peek());
        System.out.println(stack.size());
        stack.setSize(23);
        System.out.println(stack.getLast());
        System.out.println(stack.peek());

        System.out.println(stack.size());
        stack.set(22, "item 20");
        System.out.println("aaaaaaaaaaaaa");
        System.out.println(stack.peek());
        System.out.println(stack.getLast());
        System.out.println(stack.pop());


        for (String s : stack) {
            System.out.println(s);
        }
    }
}
