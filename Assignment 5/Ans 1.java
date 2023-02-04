/*Insert the element at beginning of the linked list In Java
Adding nodes to the start of the list: 1 
Adding nodes to the start of the list: 2 1 
Adding nodes to the start of the list: 3 2 1 
Adding nodes to the start of the list: 4 3 2 1 */

class Node {
    int data;
    Node next;
  
    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {
    Node head;

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);

        System.out.println("Adding nodes to the start of the list: ");
        list.printList();
    }
}
