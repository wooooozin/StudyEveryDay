package august2023.day16;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int value) {
        this.data = value;
        this.left = null;
        this.right = null;
    }
}

public class Main {
    static Node root;

    private static void dfs(Node root) {
        if (root == null) {
            return;
        } else {
//            System.out.print(root.data + " "); // 전위순회
            dfs(root.left);
//            System.out.print(root.data + " "); // 중위순회
            dfs(root.right);
            System.out.print(root.data + " "); // 후위순회
        }
    }

    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        dfs(root);
    }

}
