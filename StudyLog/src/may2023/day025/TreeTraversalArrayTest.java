package may2023.day025;

// 배열을 이용한 전위 순회(preoder traversal)
class BinaryTree {
    char[] arr;

    BinaryTree() {}
    BinaryTree(char[] data) {
        this.arr = data.clone();
    }

    public void preOder(int idx) {
        System.out.println("current : " + this.arr[idx]);
        int left = 2 * idx + 1;
        int right = 2 * idx + 2;

        if (left < this.arr.length) {
            this.preOder(left);
        }

        if (right < this.arr.length) {
            this.preOder(right);
        }
    }

    public void inOrder(int idx) {
        int left = 2 * idx + 1;
        int right = 2 * idx + 2;

        if (left < this.arr.length) {
            this.inOrder(left);
        }
        System.out.print(this.arr[idx] + " ");

        if (right < this.arr.length) {
            this.inOrder(right);
        }
    }

    public void postOrder(int idx) {
        int left = 2 * idx + 1;
        int right = 2 * idx + 2;

        if (left < this.arr.length) {
            this.postOrder(left);
        }

        if (right < this.arr.length) {
            this.postOrder(right);
        }

        System.out.print(this.arr[idx] + " ");


    }

    public void levelOrder(int idx) {
        for (int i = 0; i < this.arr.length; i++) {
            System.out.print(this.arr[i] + " ");
        }
        System.out.println();
    }
}
public class TreeTraversalArrayTest {
    public static void main(String[] args) {
        char[] arr = new char[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char)('A' + i);
        }

        BinaryTree bt = new BinaryTree(arr);
        bt.preOder(0);
        bt.inOrder(0);
        System.out.println();
        bt.postOrder(0);
        System.out.println();
        bt.levelOrder(0);
    }
}
