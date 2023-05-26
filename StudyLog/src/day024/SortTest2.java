package day024;

import java.util.Arrays;
import java.util.Comparator;

public class SortTest2 {
    public static void main(String[] args) {
        // 람다식 이용하기
        int[][] ints = {{10, 3}, {10, 5}, {10, 1}, {6, 11}};
        Arrays.sort(ints, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        System.out.println(Arrays.deepToString(ints));
        // [[6, 11], [10, 5], [10, 3], [10, 1]]

        // Comparator 이용하기
        Comparator<int[]> comparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] == o1[0] ? o2[0] - o1[0] : o1[0] - o2[0];
            }
        };
        int[][] ints2 = {{10, 3}, {10, 5}, {10, 1}, {6, 11}};
        Arrays.sort(ints2, comparator);
        System.out.println(Arrays.deepToString(ints2));
        // [[6, 11], [10, 5], [10, 3], [10, 1]]

        String[][] strs = {{"cat", "apple"}, {"apple", "cat"}, {"dice", "bear"}, {"bear", "dice"}};
        Arrays.sort(strs, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1[0].compareTo(o2[0]);
            }
        });
        System.out.println(Arrays.deepToString(strs));
        // [[apple, cat], [bear, dice], [cat, apple], [dice, bear]]
    }
}
