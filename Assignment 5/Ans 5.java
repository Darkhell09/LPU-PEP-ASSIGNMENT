/*Search the element of the linked list
Input: = [10->20->30->12->0->23->2->12]  element = 23
Output: 5*/

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

    public int searchElement(int element) {
        int index = 0;
        Node curr = head;
        while (curr != null) {
            if (curr.data == element) {
                return index;
            }
            curr = curr.next;
            index++;
        }
        return -1;
    }

    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (head == null) {
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
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtPosition(10, 0);
        list.insertAtPosition(20, 1);
        list.insertAtPosition(30, 2);
        list.insertAtPosition(12, 3);
        list.insertAtPosition(0, 4);
        list.insertAtPosition(23, 5);
        list.insertAtPosition(2, 6);
        list.insertAtPosition(12, 7);

        int index = list.searchElement(23);
        System.out.println("Element found at index: " + index);
    }
}
