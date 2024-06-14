package Stack;

public class StackUsingDynamicArray {

    //Length of the Array used to implement the stack.
    protected int capacity;

    // Default array capacity
    public static final int CAPACITY = 16; // power of 2;
    public static int MIN_CAPACITY = 1 << 15; // power of 2

    //    Array used to implement the stack
    protected int[] stackRep;

    //    Index of the top element of the stack in the array;
    protected int top = -1;

    //   Initialize the stack to use an array of default length.
    public StackUsingDynamicArray() {
        this(CAPACITY);             // Default capacity
    }

    public StackUsingDynamicArray(int cap) {
        capacity = cap;
        stackRep = new int[capacity];   // Compiler may give warning, but this is ok
    }

    // Return the number of elements int the stack. This method runs in O(1) time.
    public int size() {
        return (top + 1);
    }

    //    Tester whether the stack is empty, This method runs in O(1) time.
    public boolean isEmpty() {
        return (top < 0);
    }

    //    Insert an element at the top of the stack. This method runs in O(1) time.
    public void push(int data) throws Exception {
        if (size() == capacity) {
            expand();
        }
        stackRep[++top] = data;
    }

    private void expand() {
        int length = size();
        int[] newStack = new int[length << 1];
        System.arraycopy(stackRep, 0, newStack, 0, length);
        stackRep = newStack;
        this.capacity = this.capacity << 1;
    }

    //    Dynamic Array operation: Shrink to 1/2 if more than 3/4 empty
    private void shrink() {
        int length = top + 1;
        if (length <= MIN_CAPACITY || top << 2 >= length) {
            return;
        }
        length = length + (top << 1); // still means shrink to at 1/2 or less of the heap
        if (top < MIN_CAPACITY) {
            length = MIN_CAPACITY;
        }
        int[] newStack = new int[length];
        System.arraycopy(stackRep, 0, newStack, 0, top + 1);
        stackRep = newStack;
        this.capacity = capacity;
    }

    //    Inspects the element at the top of the stack. This method runs in O(1) time.
    public int top() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty");
        }
        return stackRep[top];
    }

    //    Remove tha top element from the stack. This method runs in O(1) time.
    public int pop() throws Exception {
        int data;
        if (isEmpty()) {
            throw new Exception("Stack is Empty");
        }
        data = stackRep[top];
        stackRep[top--] = Integer.MAX_VALUE; // Dereference S[top] for garbage collection.
        shrink();
        return data;
    }

//    Return a string representation of the stack as a list of element, with the top element at the end:[..., pre, top].
//    This method runs in O(n) time, where n is the size of the stack.

    public String toString() {
        String s;
        s = "[";
        if (size() > 0)
            s += stackRep[0];
        if (size() > 1)
            for (int i = 1; i <= size() - 1; i++) {
                s += ", " + stackRep[i];
            }
        return s + "]";
    }

    public static void main(String[] args) {
        System.out.println("Stack Using Dynamic Array\n");

        StackUsingDynamicArray dynamicStack = new StackUsingDynamicArray(8);
        try {
            dynamicStack.push(2);
            dynamicStack.push(4);
            System.out.println(dynamicStack);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
