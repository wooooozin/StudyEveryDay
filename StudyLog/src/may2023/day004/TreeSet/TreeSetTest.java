package may2023.day004.TreeSet;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Lee");
        treeSet.add("Kim");
        treeSet.add("Park");

        for (String str : treeSet) {
            System.out.println(str); // KIm Lee Park
        }
    }
}
