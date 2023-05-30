package may2023.day025;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    char data;
    Node left;
    Node right;

    public Node(char data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

class BinaryTreeLinked {
    Node head;
    BinaryTreeLinked() {};
    BinaryTreeLinked(char[] arr) {
        Node[] nodes = new Node[arr.length];

        for (int i = 0; i < arr.length; i++) {
            nodes[i] = new Node(arr[i], null, null);
        }

        for (int i = 0; i < arr.length; i++) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < arr.length) {
                nodes[i].left = nodes[left];
            }
            if (right < arr.length) {
                nodes[i].right = nodes[right];
            }
        }
        this.head = nodes[0];
    }

    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        this.preOrder(node.left);
        this.preOrder(node.right);
    }
    public void inOrder(Node node) {
        if (node == null) {
            return;
        }

        this.inOrder(node.left);
        System.out.print(node.data + " ");
        this.inOrder(node.right);
    }

    public void postOrder(Node node) {
        if (node == null) {
            return;
        }
        if (node == null) {
            return;
        }

        this.postOrder(node.left);
        this.postOrder(node.right);
        System.out.print(node.data + " ");
    }
    public void levelOrder(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            System.out.print(cur.data + " ");

            if (cur.left != null) {
                queue.offer(cur.left);
            }

            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }
    }
}

public class TreeTraversalLinkedListTest {
    public static void main(String[] args) {
        char[] arr = new char[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char)('A' + i);
        }

        BinaryTreeLinked bt = new BinaryTreeLinked(arr);
        bt.preOrder(bt.head);
        System.out.println();
        bt.inOrder(bt.head);
        System.out.println();
        bt.postOrder(bt.head);
        System.out.println();
        bt.levelOrder(bt.head);
    }
}
