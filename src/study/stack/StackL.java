package study.stack;

import java.util.Stack;

public class StackL {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.push(1));
        System.out.println(stack.peek());
        System.out.println(stack.push(2));
        System.out.println(stack.pop());
    }
}
