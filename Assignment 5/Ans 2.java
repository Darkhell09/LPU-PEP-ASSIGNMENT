/*Insert the element at end of the linked list
Adding nodes to the End of the list: 1 
Adding nodes to the End of the list: 1 2 
Adding nodes to the End of the list: 1 2 3
Adding nodes to the End of the list: 1 2 3 4  */


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

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
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
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);

        System.out.println("Adding nodes to the end of the list: ");
        list.printList();
    }
}
