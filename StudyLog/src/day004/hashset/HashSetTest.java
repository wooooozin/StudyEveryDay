package day004.hashset;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("AAA");
        set.add("BBB");
        set.add("CCC");
        set.add("AAA");

        System.out.println(set); // [AAA, CCC, BBB] , 중복 X, 순서 X
    }
}
