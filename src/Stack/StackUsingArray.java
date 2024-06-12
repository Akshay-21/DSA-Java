package Stack;

public class StackUsingArray {

    private int maxSize;
    private int[] arr;
    private int top;

    public StackUsingArray(int capacity) {
        maxSize = capacity;
        arr = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = value;
        System.out.println(value + " pushed into Stack");
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if(top < 0){
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public static void main(String[] args) {

//        StackUsingArray stack = new StackUsingArray(0);
//        stack.push(10);
//        System.out.println(stack.pop());

        StackUsingArray stack = new StackUsingArray(5);
        stack.push(10);
        stack.pop();

        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.pop() +"Popped from Stack");
        System.out.println(stack.peek());


        System.out.print("Elements present in stack: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        System.out.println("\n");
        System.out.println(stack.peek());
    }
}
