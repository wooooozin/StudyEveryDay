package june2023.day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SumMultiplicationRuleTest {
    public static void main(String[] args) {
        // 합의 법칙
        int[] diceA = {1, 2, 3, 4, 5, 6};
        int[] diceB = {1, 2, 3, 4, 5, 6};
        int nA = 0;
        int nB = 0;
        int nAandB = 0;

        // 반복문 이용하기
        for (int a : diceA) {
            for (int b : diceB) {
                if ((a + b) % 3 == 0) { // 두 주사위 합이 3의 배수인 경우의 수
                    nA += 1;
                }
                if ((a + b) % 4 == 0) { // 두 주사위 합이 4의 배수인 경우의 수
                    nB += 1;
                }
                if ((a + b) % 12 == 0) { // 두 주사위 합이 3과 4의 배수가 되는 경우의 수
                    nAandB += 1;
                }
            }
        }
        System.out.println(nA + nB - nAandB); // 20

        // HashSet 이용하기
        HashSet<ArrayList<Integer>> allCase = new HashSet<>();
        for (int a : diceA) {
            for (int b : diceB) {
                if ((a + b) % 3 == 0 || (a + b) % 4 == 0) {
                    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(a, b));
                    allCase.add(list);
                }
            }
        }
        System.out.println(allCase.size()); // 20
        System.out.println(allCase);
        // [[2, 1], [5, 4], [2, 2], [3, 3], [4, 4], [6, 6],
        // [1, 2], [4, 5], [1, 3], [2, 4], [3, 5], [3, 6],
        // [1, 5], [2, 6], [5, 1], [6, 2], [6, 3], [3, 1],
        // [4, 2], [5, 3]]

        // 곱의 법칙
        nA = 0;
        nB = 0;

        for (int a : diceA) {
            if (a % 3 == 0) { // a 가 3의 배수 일 때
                nA += 1;
            }
        }
        for (int b : diceB) {
            if (b % 4 == 0) { // b가 4의 배수 일 때
                nB += 1;
            }
        }
        System.out.println(nA * nB); // 2
    }
}
