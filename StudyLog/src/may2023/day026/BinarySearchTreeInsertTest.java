package may2023.day026;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int value;
    Node left;
    Node right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

class BinarySearchTree {
    Node root;

    BinarySearchTree(int value) {
        this.root = new Node(value, null, null);
    }

    public Node insertNode(Node parent, int value) {
        if (parent == null) { // 이진 탐색 트리가 비어있다면
            return new Node(value, null, null); // 새로 들어온 value를 루트로 삽입해줍니다.
        }

        if (value < parent.value) {
            // 삽입할 value가 현재 노드의 값보다 작은 경우, 왼쪽 서브트리로 이동하여 재귀적으로 삽입
            parent.left = insertNode(parent.left, value);
        } else {
            // 삽입할 value가 현재 노드의 값보다 큰 경우, 오른쪽 서브트리로 이동하여 재귀적으로 삽입
            parent.right = insertNode(parent.right, value);
        }
        return parent; // 부모 노드를 가리키는 포인터로서, 삽입 과정에서 부모 노드의 링크를 갱신
    }

    public Node removeNode(Node parent, int value) {
        if (parent == null) { // 트리가 비어있는 경우 null로 반환
            return null;
        }

        if (value < parent.value) {
            // 삭제할 값이 현재 노드의 값보다 작은 경우, 왼쪽 서브트리에서 삭제 수행
            parent.left = removeNode(parent.left, value); // 왼쪽 자식 노드를 갱신
        } else if (value > parent.value) {
            // 삭제할 값이 현재 노드의 값보다 큰 경우, 오른쪽 서브트리에서 삭제 수행
            parent.right = removeNode(parent.right, value); // 오른쪽 자식 노드를 갱신
        } else {   // 삭제할 값과 현재 노드의 값이 같은 경우, 삭제할 노드를 찾았음
            if (parent.left == null) {
                // Case 1: 삭제할 노드가 왼쪽 자식 노드를 가지지 않는 경우
                return parent.right; // 오른쪽 자식 노드를 반환하여 부모 노드의 링크 갱신
            } else if (parent.right == null) {
                // Case 2: 삭제할 노드가 오른쪽 자식 노드를 가지지 않는 경우
                return parent.left; // 왼쪽 자식 노드를 반환하여 부모 노드의 링크 갱신
            } else {
                // Case 3: 삭제할 노드가 두 개의 자식 노드를 가지는 경우
                Node predecessor = parent; // 삭제할 노드의 바로 이전 노드 (왼쪽 서브트리에서 가장 큰 값)
                Node successor = parent.left; // 왼쪽 서브트리에서 시작하여 가장 큰 값을 찾기 위한 노드

                while (successor.right != null) {
                    // 왼쪽 서브트리에서 가장 큰 값을 찾기 위해 오른쪽으로 이동
                    predecessor = successor;
                    successor = successor.right;
                }
                predecessor.right = successor.left; // 대체된 값을 삭제할 노드의 위치에 설정
                parent.value = successor.value; // 대체된 값의 원래 위치를 삭제
            }
        }
        return parent; // 삭제된 노드의 부모 노드의 링크를 갱신하기 위해 반환
    }

    public void leveOrder(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node); // 주어진 노드 node를 큐에 추가
        while (!queue.isEmpty()) {
            Node cur = queue.poll(); // 큐에서 현재 노드를 꺼내고 값을 출력
            // 다음 에는 먼저 들어온 왼쪽 노드 먼저 출력하고 다시 반복
            // 다음에는 먼저 들어온 오른쪽 노드 먼저 출력하고 다시 반복
            System.out.print(cur.value + " ");

            if (cur.left != null) {         // 현재 노드의 왼쪽 자식 노드가 있다면 큐에 추가
                queue.offer(cur.left);
            }
            if (cur.right != null) {         // 현재 노드의 오른쪽 자식 노드가 있다면 큐에 추가
                queue.offer(cur.right);
            }
        }
        System.out.println();
    }
}
public class BinarySearchTreeInsertTest {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(8); // 8이 루트인 이진탐색트리 생성
        bst.root = bst.insertNode(bst.root, 4);
        bst.root = bst.insertNode(bst.root, 10);
        bst.root = bst.insertNode(bst.root, 5);
        bst.root = bst.insertNode(bst.root, 2);
        bst.root = bst.insertNode(bst.root, 15);
        bst.root = bst.insertNode(bst.root, 9);
        bst.root = bst.insertNode(bst.root, 3);
        bst.root = bst.insertNode(bst.root, 1);
//        System.out.println("7 삽입 전");
//        bst.leveOrder(bst.root);
//        System.out.println("7 삽입 후");
        bst.root = bst.insertNode(bst.root, 7);
//        bst.leveOrder(bst.root);
//        System.out.println("13 삽입 후");
        bst.root = bst.insertNode(bst.root, 13);
//        bst.leveOrder(bst.root);

        bst.root = bst.removeNode(bst.root, 3);
        System.out.println("3 삭제 후");
        bst.leveOrder(bst.root);
        bst.root = bst.removeNode(bst.root, 2);
        System.out.println("2 삭제 후");
        bst.leveOrder(bst.root);
        bst.root = bst.removeNode(bst.root, 8);
        System.out.println("8 삭제 후");
        bst.leveOrder(bst.root);


    }
}
