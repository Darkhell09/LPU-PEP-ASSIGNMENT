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

    public Node findStartingPointOfLoop() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
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

    public void createLoop() {
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = head.next.next;
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtPosition(1, 0);
        list.insertAtPosition(2, 1);
        list.insertAtPosition(3, 2);
        list.insertAtPosition(4, 3);
        list.insertAtPosition(5, 4);
        list.insertAtPosition(6, 5);
        list.createLoop();
        Node start = list.findStartingPointOfLoop();
        System.out.println("Starting point of loop: " + start.data);
    }
}
