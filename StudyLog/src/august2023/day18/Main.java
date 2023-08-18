package august2023.day18;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}

public class Main {
    static Node root;
    private static int dfs(int L, Node root) {
        if (root.left == null && root.right == null) { // 말단 노드 인지 확인
            return L; // 루트 노드의 레벨
        } else {
            return Math.min(dfs(L + 1, root.left), dfs(L + 1, root.right));
        }

    }

    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println(dfs(0, root));

    }
}
