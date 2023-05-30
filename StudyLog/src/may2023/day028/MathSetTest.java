package may2023.day028;

import java.util.Arrays;
import java.util.HashSet;

public class MathSetTest {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // 데이터 추가 - 중복값 추가하지 않음
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set); // [1, 2, 3]
        // 크기
        System.out.println(set.size()); // 3
        // 삭제
        set.remove(1);
        System.out.println(set); // [2, 3]

        // 집합 A, 집합B
        HashSet<Integer> a = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        HashSet<Integer> b = new HashSet<>(Arrays.asList(2, 4, 6, 8, 10));

        // 교집합
        a.retainAll(b);
        System.out.println(a); // [2, 4]

        // 합집합
        a.addAll(b);
        System.out.println(a); // [2, 4, 6, 8, 10]

        // 차집합
        a.removeAll(b);
        System.out.println(a); // []
    }
}
