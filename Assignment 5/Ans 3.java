/*Insert the element at Given position of the linked list
Input: 3->5->8->10, data = 2, position = 2
Output: 3->2->5->8->10*/

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

    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node curr = head;
        int currPos = 0;
        while (curr.next != null && currPos < position - 1) {
            curr = curr.next;
            currPos++;
        }
        newNode.next = curr.next;
        curr.next = newNode;
    }

    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtPosition(3, 0);
        list.insertAtPosition(5, 1);
        list.insertAtPosition(8, 2);
        list.insertAtPosition(10, 3);
        list.insertAtPosition(2, 2);

        System.out.println("Inserting element at given position: ");
        list.printList();
    }
}
