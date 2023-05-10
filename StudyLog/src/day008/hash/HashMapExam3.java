package day008.hash;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapExam3 {

    static int solution(int[] array) {
        int answer = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int n : array) {
            hashMap.put(n, hashMap.getOrDefault(n, 0) + 1);
        }

        int[] results = new int[hashMap.size()];
        int idx = 0;
        if (hashMap.size() == 1) {
            return array[0];
        }
        for (int key : hashMap.keySet()) {
            int count = hashMap.get(key);
            results[idx++] = count;
        }
        Arrays.sort(results);
        answer = (results[results.length - 1] == results[results.length -2]) ? -1 : results[results.length - 1];

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 4};
        System.out.println(solution(arr));

        int[] arr1 = {1, 1, 2, 2};
        System.out.println(solution(arr1));

        int[] arr2 = {1};
        System.out.println(solution(arr2));
    }
}
