package day013;

import java.util.Hashtable;
import java.util.Scanner;

public class CountingNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputLength = sc.nextInt();
        int[] inputNumberArray = new int[inputLength];
        Hashtable<Integer, Integer> ht = new Hashtable<>();

        for (int i = 0; i < inputNumberArray.length; i++) {
            inputNumberArray[i] = sc.nextInt();
            ht.put(inputNumberArray[i], ht.getOrDefault(inputNumberArray[i], 0) + 1);
        }

        int findValue = sc.nextInt();
        Integer count = ht.get(findValue);
        if (count != null) {
            System.out.println(count);
        } else {
            System.out.println(0);
        }
    }
}
