package Stack;

public class DuplicateBracketsStackUsingLinkedList<T> {

    int size;
    NodeDBS<T> top;

    public DuplicateBracketsStackUsingLinkedList() {
        this.size = 0;
        this.top = null;
    }

    //	Push Operation to add an element to the stack
    public void push(T data) {
        NodeDBS<T> newNode = new NodeDBS<T>(data);
        newNode.nextNode = top;
        top = newNode;
        size++;
    }

//	Pop Operation to remove an element from the stack
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot pop!");
            return null;
        }

        T popped = top.data;
        top = top.nextNode;
        size--;
        return popped;
    }

//	Peek Operation to return the top element without removing it.
    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot pop!");
            return null;
        }
        return top.data;
    }


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (top == null);
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        NodeDBS<T> currentNode = top;
        while (currentNode != null) {
            System.out.println("Stack Elements are: " + currentNode.data);
            currentNode = currentNode.nextNode;
        }
        System.out.println();
    }


    public static void main(String[] args) {

        DuplicateBracketsStackUsingLinkedList<Character> stack = new DuplicateBracketsStackUsingLinkedList<>();

        String exp = "((a+b)+(c+d))";
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == ')') {
                if(stack.peek() == '(') {
                    System.out.println(true);
                    return;
                }else {
                    while(stack.peek() != '(') {
                        stack.pop();
                    }
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }

        }
        System.out.println(false);
        System.out.println();
    }
}

// Linked List Data Structure
class LinkedList<T> {

    NodeDBS<T> head;

    public void insert(T data) {
        NodeDBS<T> newNode = new NodeDBS<T>(data);

        if (head == null) {
            head = newNode;
        } else {
            NodeDBS<T> currentNode = head;
            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(newNode);
        }
    }

    public void delete(T data) {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head.getData() == data) {
            head = head.getNextNode();
            return;
        }

        NodeDBS<T> tempNode = head;
        while (tempNode.getNextNode() != null && tempNode.getNextNode().getData() != data) {
            tempNode = tempNode.getNextNode();
        }

        if (tempNode.getNextNode() == null) {
            System.out.println("Node with Values " + data + " not found !");
        } else {
            tempNode.setNextNode(tempNode.getNextNode().getNextNode());
        }
    }

    public boolean searchIsElementThere(T data) {

        if (head == null) {
            System.out.println("List is Empty");
            return false;
        }

        if (head.getData() == data) {
            return true;
        }

        NodeDBS<T> node = head;
        while (node != null) {
            if (node.getData() == data) {
                return true;
            }
            node = node.getNextNode();
        }
        return false;
    }

    public void display() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        NodeDBS<T> node = head;
        while (node != null) {
            System.out.println(node.getData());
            node = node.getNextNode();
        }
        System.out.println();
    }
}

class NodeDBS<T> {
    T data;
    NodeDBS<T> nextNode;

    NodeDBS(T data) {
        this.data = data;
        this.nextNode = null;
    }

    public T getData() {
        return data;
    }

    public NodeDBS<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(NodeDBS<T> nextNode) {
        this.nextNode = nextNode;
    }

}
