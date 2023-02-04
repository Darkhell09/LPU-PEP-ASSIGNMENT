/*Remove the element at Given position of the linked list
Input: position = 2, Linked List = 8->2->3->1->7
Output: Linked List =  8->3->1->7*/

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

    public void removeAtPosition(int position) {
        if (head == null) {
            return;
        }
        if (position == 0) {
            head = head.next;
            return;
        }
        Node curr = head;
        int currPos = 0;
        while (curr.next != null && currPos < position - 1) {
            curr = curr.next;
            currPos++;
        }
        curr.next = curr.next.next;
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
        list.insertAtPosition(8, 0);
        list.insertAtPosition(2, 1);
        list.insertAtPosition(3, 2);
        list.insertAtPosition(1, 3);
        list.insertAtPosition(7, 4);

        System.out.println("Linked List before removing element: ");
        list.printList();

        list.removeAtPosition(2);

        System.out.println("\nLinked List after removing element: ");
        list.printList();
    }
}
