package day013;

import java.util.*;

public class PlanetXThreeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] countOneArray = new int[20];

        int inputNumber;
        int tmp = 0;
        int index;
        long answer = 0L;

        for (int i = 0; i < N; i++) { // N번째 까지 돌면서
            inputNumber = sc.nextInt(); // input 받은 숫자를
            index = 0;
            while (inputNumber != 0) {
                tmp = inputNumber % 2; // 2로 나눈 나머지가
                inputNumber = inputNumber / 2; // 19 -> 9 -> 4 -> 2 -> 0이면 반복문 종료
                if (tmp == 1) { // 1이면
                    countOneArray[index]++; // 해당 index에 1의 개수 증가
                }
                index++; // index 증가
            }
        }

        for (int i = 0; i < 20; i++){
            answer += (1L << i) * countOneArray[i] * (N - countOneArray[i]);
            // answer += (1L << i) ->  2의 i승 * 1의 갯수 * 0의 갯수
            System.out.printf("%d += (%d << %d) * %d * (%d - %d) ==> \n",answer, 1L, i,countOneArray[i], N, countOneArray[i]);
        }

        System.out.println(answer);

    }
}
