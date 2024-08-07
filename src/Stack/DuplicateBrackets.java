package Stack;

import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) {

        String exp1 = "((a+b)+(c+d))";
        String exp2 = "(a+b)+((c+d))";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp1.length(); i++) {
            char ch = exp1.charAt(i);

            if (ch == ')') {
                if (stack.peek() == '(') {
                    System.out.println(true);
                    return;
                } else {
                    while (stack.peek() != '(') {
                        stack.pop();
                    }
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
            System.out.println(stack);
        }
        System.out.println(false);
    }
}
