package study.stack;

public class StackMain {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(5);
        arrayStack.peek();
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.peek();
        arrayStack.pop();
        arrayStack.peek();
    }
}
