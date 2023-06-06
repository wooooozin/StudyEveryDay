package june2023.day06.algorithm;

public class Array06Test {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[5]; // 배열 본체를 생성한 뒤 배열 변수 scores 와 연결

        scores[0] = 90;
        scores[1] = scores[0] + 5;
        System.out.println(scores[0]); // 90
        System.out.println(scores.length); // 5

        char[] ch = new char[5];

        for (int i = 0; i < scores.length; i++) {
            System.out.printf(scores[i] + " "); // 90 95 0 0 0
            System.out.printf(ch[i] + " ");
        }

        int[] otherScores = {90, 95, 80, 85, 0};

        int[] numbers = {1, 100, 10};
        int max = numbers[0];

        if (max < numbers[1]) {
            max = numbers[1];
        }
        if (max < numbers[2]) {
            max = numbers[2];
        }
        System.out.println(max); // 100


        int[] nums = {1, 2, 3, 4, 5};
        int maxNumber = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (maxNumber < nums[i]) {
                maxNumber = nums[i];
            }
        }
        System.out.println(maxNumber); // 5
    }
}
