package sept2023.day18;

import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        int length = A.length;
        for(int i = 0; i < length; i++) {
            answer += A[i] * B[length - i - 1];
        }

        return answer;
    }
}


public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arrA = {1, 4, 2};
        int[] arrB = {5, 4, 4};

        System.out.println(solution.solution(arrA, arrB));
    }
}
