package Stack;

public class NextGreaterElementOnTheRight {

    public static void main(String[] args) {

        int n = 9;
//		int a[] = new int[n];

        int[] a = new int[] {2, 5, 9, 3, 1, 12, 6, 8, 7};

        /*
         * for(int b = 0; b<a.length; b++) { System.out.print(a[b] +" "); }
         */

        for(int b = 0; b<a.length; b++) {
            System.out.print(a[b] +" ");
        }

        System.out.println();

        int[] aa = solve(n, a);
        display(aa);
    }

    private static int[] solve(int n, int[] ar) {

        int[] nge = new int[n];

        Stack12<Integer> stack = new Stack12<>();

        stack.push(ar[ar.length - 1]);
        nge[ar.length - 1] = -1;

        for (int i = ar.length - 1; i >= 0; i--) {
            // -a+
            // -(pop) a(print) +(push)

            while (stack.size() > 0 && ar[i] >= stack.peek()) {
                stack.pop();
            }

            if (stack.size() == 0) {
                nge[i] = -1;
            } else {
                nge[i] = stack.peek();
            }
            stack.push(ar[i]);

        }

        return nge;
    }

    private static void display(int[] aa) {
        for(int b = 0; b<aa.length; b++) {
            System.out.print(aa[b] +" ");
        }
    }

}

class Stack12<T extends Integer> {

    int size;
    Node12<T> top;

    Stack12() {
        this.size = 0;
        this.top = null;
    }

    public void push(T data) {
        Node12<T> node = new Node12<>(data);
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

class Node12<T> {
    T data;
    Node12<T> nextLink;

    Node12(T data) {
        this.data = data;
        this.nextLink = null;
    }

    public T getData() {
        return data;
    }

    public Node12<T> getNextLink() {
        return nextLink;
    }

    public void setNextLink(Node12<T> nextLink) {
        this.nextLink = nextLink;
    }

}
