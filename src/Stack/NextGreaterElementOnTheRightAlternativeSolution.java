package Stack;

public class NextGreaterElementOnTheRightAlternativeSolution {

    public static void main(String[] args) {

        int n = 9;

        int a[] = new int[]{2, 5, 9, 3, 1, 12, 6, 8, 7};

        for (int b = 0; b < a.length; b++) {
            System.out.print(a[b] + " ");
        }

        System.out.println();

        int aa[] = solve(n, a);
        display(aa);
    }

    private static int[] solve(int n, int ar[]) {

        int[] nge = new int[n];

        Stack123<Integer> stack = new Stack123<>();

        stack.push(0);
        for (int i = 1; i < ar.length; i++) {
            while (stack.size() > 0 && ar[i] > ar[stack.peek()]) {
                int pos = stack.peek();
                nge[pos] = ar[i];
                stack.pop();
            }
            stack.push(i);
        }

        while (stack.size() > 0) {
            int pos = stack.peek();
            nge[pos] = -1;
            stack.pop();
        }

        return nge;
    }

    private static void display(int aa[]) {
        for (int b = 0; b < aa.length; b++) {
            System.out.print(aa[b] + " ");
        }
    }

}

class Stack123<T extends Integer> {

    int size;
    Node123<T> top;

    Stack123() {
        this.size = 0;
        this.top = null;
    }

    public void push(T data) {
        Node123<T> node = new Node123<T>(data);
        node.nextLink = top;
        top = node;
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        int popped = (int) top.data;
        top = top.nextLink;
        size--;
        return popped;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        return (int) top.data;
    }

    public boolean isEmpty() {
        return (top == null);
    }

    public int size() {
        return size;
    }
}

class Node123<T> {
    T data;
    Node123<T> nextLink;

    Node123(T data) {
        this.data = data;
        this.nextLink = null;
    }

    public T getData() {
        return data;
    }

    public Node123<T> getNextLink() {
        return nextLink;
    }

    public void setNextLink(Node123<T> nextLink) {
        this.nextLink = nextLink;
    }


}
