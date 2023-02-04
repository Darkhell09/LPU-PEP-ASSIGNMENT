class Node {
    int data;
    Node left;
    Node right;
  
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class BinaryTree {
    Node root;

    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    private Node insertRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        if (data < current.data) {
            current.left = insertRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = insertRecursive(current.right, data);
        } else {
            return current;
        }
        return current;
    }

    public void traversePreOrder() {
        traversePreOrderRecursive(root);
    }

    private void traversePreOrderRecursive(Node current) {
        if (current != null) {
            System.out.print(current.data + " ");
            traversePreOrderRecursive(current.left);
            traversePreOrderRecursive(current.right);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        System.out.println("Pre-Order Traversal:");
        tree.traversePreOrder();
    }
}
