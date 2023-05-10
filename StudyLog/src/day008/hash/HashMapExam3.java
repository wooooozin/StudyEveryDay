package day008.hash;

import java.util.HashMap;

public class HashMapExam3 {

    static int solution(int[] array) {
        int answer = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int n : array) {
            hashMap.put(n, hashMap.getOrDefault(n, 0) + 1);
        }

        boolean isDuplicate = false;
        for (int key : hashMap.keySet()) {
            int count = hashMap.get(key);
            if (count == answer) {
                isDuplicate = true;
            } else if (count > answer) {
                answer = count;
                isDuplicate = false;
            }
        }
        return isDuplicate ? -1 : answer;
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
