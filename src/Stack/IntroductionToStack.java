package Stack;

import java.util.Stack;

public class IntroductionToStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        System.out.println(stack + "->" +stack.peek()+ " " + stack.size());
        stack.push(30);
        System.out.println(stack + "->" +stack.peek()+ " " + stack.size());
        stack.push(40);
        System.out.println(stack + "->" +stack.peek()+ " " + stack.size());
        stack.pop();
        System.out.println(stack + "->" +stack.peek()+ " " + stack.size());
        stack.pop();
        System.out.println(stack + "->" +stack.peek()+ " " + stack.size());
        stack.pop();
        System.out.println(stack + "->" +stack.peek()+ " " + stack.size());
        stack.pop();
        System.out.println(stack + "->" + " " + stack.size());
    }
}
