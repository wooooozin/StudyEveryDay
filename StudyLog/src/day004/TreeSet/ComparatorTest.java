package day004.TreeSet;

import java.util.*;

class MyCompare implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
     return (s1.compareTo(s2)) * -1;
    }
}

public class ComparatorTest {
    public static void main(String[] args) {
        // 매개변수로 MyCompare 전달해 재정의된 메서드 적용
        Set<String> set = new TreeSet<>(new MyCompare());
        set.add("aaa");
        set.add("ddd");
        set.add("bbb");
        set.add("ccc");
        System.out.println(set); // [ddd, ccc, bbb, aaa]
    }
}
