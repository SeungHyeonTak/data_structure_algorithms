package study.stack;

public class ArrayStack {
    int top;
    int size;
    int[] stack;

    public ArrayStack(int size) {
        this.size = size;
        top = -1;
        stack = new int[this.size];
    }

    public void peek() {
        if (top >= 0) {
            System.out.println("peek : " + stack[top]);
        } else {
            System.out.println("[peek] 비어있습니다.");
        }
    }

    public void push(int item) {
        stack[++top] = item;
        System.out.println("push : " + stack[top]);
    }

    public void pop() {
        System.out.println("pop : " + stack[top]);
        stack[top--] = 0;
    }
}
