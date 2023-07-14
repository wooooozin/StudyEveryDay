package july2023.day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static int[] solution(int n, int m, int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int idx = 0;

        for (int i = 0; i < m - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int left = 0;
        for (int right = m - 1; right < n; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            result.add(map.size());
            map.put(arr[left], map.get(arr[left]) - 1);
            if (map.get(arr[left]) == 0) {
                map.remove(arr[left]);
            }
            left++;
        }
        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : solution(n, m, arr)) {
            System.out.print(num + " ");
        }
    }
}
