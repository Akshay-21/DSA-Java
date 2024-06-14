package Stack;

import java.util.Objects;

public class StackUsingLinkedList<T extends Integer> {

    private int maxSize;
    private Node<T> top;

    // Creating constructor with the size = 0 and top = null;
    public StackUsingLinkedList() {
        this.maxSize = 0;
        this.top = null;
    }

    //  Push operation to add an element to the stack.
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.nextNode = top;
        top = newNode;
        maxSize++;
    }

    //    Pop operation to remove and return the top element from the stack.
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty, Cannot pop!");
            return -1;
        }
        int poppedData = top.data;
        top = top.nextNode;
        maxSize--;
        return poppedData;
    }

    //    Peek operation to return the top element without removing it.
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty, Cannot peek!");
            return -1;
        }
        int peek = top.data;
        return peek;
    }

    //    Return the size of the stack.
    public int size() {
        return maxSize;
    }

    // Check if the stack is empty.
    public boolean isEmpty() {
        return (top == null);
    }

    // Print all element in the stack.
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return;
        }

        Node<T> current = top;
        while (current != null) {
            System.out.println("Elements are " + current.data + " ");
            current = current.nextNode;
        }
        System.out.println();
    }

    // Find element from stack.
    public boolean findElement(T data) {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return false;
        }

        Node<T> current = top;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.nextNode;
        }
        return false;
    }

    // Search for an element in the stack and return its position (1-based index)
    public int search(T data) {
        Node<T> current = top;
        int position = 0;
        while (current != null) {
            if (current.data == data) {
                return position;
            }
            current = current.nextNode;
            position++;
        }
        return -1; // Element not found
    }


    // Search for an element in the stack and return its value data;

    public int searchElement(T data) {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        Node<T> current = top;
        while (current != null) {
            if (Objects.equals(current.data, data)) {
                return current.data;
            }
            current = current.nextNode;
        }
        return -1;
    }

    public static void main(String[] args) {
        StackUsingLinkedList<Integer> stackUsingLinkedList = new StackUsingLinkedList<>();
        stackUsingLinkedList.push(10);
        stackUsingLinkedList.push(20);
        stackUsingLinkedList.push(30);

        System.out.println("Top element is: " + stackUsingLinkedList.peek());

        // Pop elements from the stack.
        System.out.println("Popped element is: " + stackUsingLinkedList.pop());
        System.out.println("Top element is: " + stackUsingLinkedList.peek());

        // Check if stack is empty.
        System.out.println("Is stack empty? = " + stackUsingLinkedList.isEmpty());

        // Push more elements.
        stackUsingLinkedList.push(40);
        stackUsingLinkedList.push(50);

        // Print size of the stack.
        System.out.println("Size of the stack: " + stackUsingLinkedList.size());
        System.out.println();

        // Pop all elements to empty the stack.
        /*
        while (!stackUsingLinkedList.isEmpty()) {
            System.out.println("Popped element: " + stackUsingLinkedList.pop());
        }
        System.out.println("Is stack empty? = " + stackUsingLinkedList.isEmpty());
        */

        // Print all element of stack
        stackUsingLinkedList.printStack();

        // Find Element 30 in the stack.
        System.out.println(stackUsingLinkedList.findElement(30));
        // Find Element 40 in the stack.
        System.out.println(stackUsingLinkedList.findElement(40));
        System.out.println();

        // Search for an element in the stack
        int searchElement = 20;
        int position = stackUsingLinkedList.search(searchElement);
        if (position != -1) {
            System.out.println("Element " + searchElement + " found at position: " + position);
        } else {
            System.out.println("Element " + searchElement + " not found in the stack.");
        }

        System.out.println();
        int searchData = stackUsingLinkedList.searchElement(20);
        System.out.println("Searched Element is " + searchData);
    }
}

class Node<T> {
    T data;
    Node<T> nextNode;

    public Node(T data) {
        this.data = data;
        this.nextNode = null;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
}