package Stack;

import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {

        String exp1 = "[(a+b)+{(c+d)*(e/f)}]";
        String exp2 = "[a+b)+{(c+d)*(e/f)]}";
        String exp3 = "[(a+b)+{(c+d)*(e/f)}";
        String exp4 = "([(a+b)+{(c+d)*(e/f)}]";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp1.length(); i++) {
            char ch = exp1.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')') {
                boolean val = handleClosing(stack, '(');
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            } else if (ch == '}') {
                boolean val = handleClosing(stack, '{');
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            } else if (ch == ']') {
                boolean val = handleClosing(stack, '[');
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            } else {

            }
        }

        if (stack.size() == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }


    private static boolean handleClosing(Stack<Character> stack, char ch) {
        if (stack.size() == 0) {
            return false;
        } else if (stack.peek() != ch) {
            return false;
        } else {
            stack.pop();
            return true;
        }

    }

}

class Stack1 {

    int capacity;
    char arr[];
    int top = -1;

    private static final int CAPACITY = 16;

    Stack1() {
        this(CAPACITY);
    }

    Stack1(int cap) {
        capacity = cap;
        arr = new char[capacity];
    }

    public int size() {
        return (top + 1);
    }

    public boolean isEmpty() {
        return (capacity == top);
    }

    public void push(char data) {
        if (size() == capacity) {
            System.out.println("Stack is Full");
        }
        arr[++top] = data;
    }

    public char top() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        }
        return arr[top];
    }

    public char pop() {
        char data;
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        }
        data = arr[top];
        arr[top--] = Character.MIN_VALUE;
        return data;
    }

    public String toString() {
        String s;
        s = "[";
        if (size() > 0) {
            s = s + arr[0];
        }
        if (size() > 1) {
            for (int i = 1; i <= size() - 1; i++) {
                s = s + ", " + arr[i];
            }
        }
        return s + "]";
    }
}
