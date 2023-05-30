package may2023.day008.hash;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapExam2 {
    static int[] solution(int[] nums, int target) {
        int[] answer = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            hashMap.put(nums[i], difference);

            for (int key : hashMap.keySet()) {
                if (hashMap.get(key) == nums[i]) {
                    answer[0] = key < nums[i] ? key : nums[i];
                    answer[1] = key > nums[i] ? key : nums[i];
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 13, 9, 15, 8, 11};
        System.out.println(Arrays.toString(solution(arr, 12)));

        int[] arr1 = {21, 12, 30, 15, 6, 2, 9, 19, 14};
        System.out.println(Arrays.toString(solution(arr1, 24)));

        int[] arr2 = {12, 18, 5, 8, 21, 27, 22, 25, 16, 2};
        System.out.println(Arrays.toString(solution(arr2, 28)));

        int[] arr3 = {7, 5, 12, 20};
        System.out.println(Arrays.toString(solution(arr3, 15)));

        int[] arr4 = {7, 5, 12, -9, -12, 22, -30, -35, -21};
        System.out.println(Arrays.toString(solution(arr4, -14)));

    }
}
