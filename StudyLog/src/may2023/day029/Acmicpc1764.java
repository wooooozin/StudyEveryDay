package may2023.day029;

import java.util.Scanner;
import java.util.TreeSet;

public class Acmicpc1764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> set1 = new TreeSet<>();
        TreeSet<String> set2 = new TreeSet<>();

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            set1.add(sc.next());
        }
        for (int i = 0; i < m; i++) {
            set2.add(sc.next());
        }
        set1.retainAll(set2);
        for (String s : set1) {
            System.out.println(set1.size());
            System.out.println(s);
        }
    }
}
