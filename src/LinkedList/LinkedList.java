package LinkedList;

public class LinkedList<T extends Integer> {

    Node<T> head;

    public void insert(T data) {
        Node<T> newNode = new Node<T>(data);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> currentNode = head;
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

        Node<T> tempNode = head;
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

        Node<T> node = head;
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

        Node<T> node = head;
        while (node != null) {
            System.out.println(node.getData());
            node = node.getNextNode();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.insert(10);
		linkedList.insert(20);
		linkedList.insert(30);
		linkedList.insert(40);
		linkedList.display();

		linkedList.delete(30);
		linkedList.display();

		linkedList.delete(50);

		boolean b = linkedList.searchIsElementThere(20);
		System.out.println(b);
    }

}

class Node<T> {
    T data;
    Node<T> nextNode;

    Node(T data) {
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