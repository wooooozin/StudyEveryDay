package may2023.day028;

import java.util.ArrayList;

class MySet {
    ArrayList<Integer> list;

    MySet() {
        this.list = new ArrayList<>();
    }

    MySet(int[] arr) {
        this.list = new ArrayList<>();
        for(int n : arr) {
            this.list.add(n);
        }
    }

    // add 구현하기, 중복 X
    public void add(int x) {
        for (int item : this.list) {
            if (item == x) {
                return;
            }
        }
        this.list.add(x);
    }

    // 교집합 구현
    public MySet retainAll(MySet b) {
        MySet result = new MySet();

        for (int item : this.list) {
            for (int itemB : b.list) {
                if (item == itemB) {
                    result.add(item);
                }
            }
        }
        return result;
    }

    // 합집합 구현
    public MySet addAll(MySet b) {
        MySet result = new MySet();

        for (int item : this.list) {
            result.add(item);
        }

        for (int item : b.list) {
            result.add(item);
        }
        return result;
    }

    // 차집합
    public MySet removeAll(MySet b) {
        MySet result = new MySet();

        for (int item : this.list) {
            boolean retainFlag = false;

            for (int itemB : b.list) {
                if (item == itemB) { // a 의 원소와 b의 원소가 같다면
                    retainFlag = true; // 트루로 변경하고
                    break; // 멈춤
                }
            }
            if (!retainFlag) { // false면
                result.add(item); // a에 남는 원소가 되니까 결과에 add 반복
            }
        }
        return result;
    }
}
public class MathMySetTest {
    public static void main(String[] args) {
        MySet a = new MySet();
        a.add(1);
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println(a.list); // [1, 2, 3]

        a = new MySet(new int[] {1, 2, 3, 4, 5});
        MySet b = new MySet(new int[] {2, 4, 6, 8, 10});

        MySet result = a.retainAll(b);
        System.out.println(result.list); // [2, 4]

        result = a.addAll(b);
        System.out.println(result.list); // [1, 2, 3, 4, 5, 6, 8, 10]

        result = a.removeAll(b);
        System.out.println(result.list); // [1, 3, 5]
    }
}
