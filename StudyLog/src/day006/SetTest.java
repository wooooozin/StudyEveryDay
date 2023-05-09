package day006;

import java.util.Arrays;
import java.util.HashSet;

public class SetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
        System.out.println(set);  //  [e, H, l, o] 출력

        // 교집합
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
        HashSet<Integer> result = new HashSet<>(s1);
        result.retainAll(s2);
        System.out.println(result); // [4, 5, 6]

        // 합집합
        result = new HashSet<>(s1);
        result.addAll(s2);
        System.out.println(result); // [1, 2, 3, 4, 5, 6, 7, 8, 9]

        // 차집합
        result = new HashSet<>(s1);  //
        result.removeAll(s2); // 차집합 수행
        System.out.println(result);  // [1, 2, 3] 출력
    }
}
