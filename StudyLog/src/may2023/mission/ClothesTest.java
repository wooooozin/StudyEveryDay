package may2023.mission;

// https://school.programmers.co.kr/learn/courses/30/lessons/42578

import java.util.HashMap;

public class ClothesTest {
    static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> countHashMap = new HashMap<>();

        // 종류별 옷의 갯수 구하기
        for (int i = 0; i < clothes.length; i++) {
            String key = clothes[i][1];
            countHashMap.put(key, countHashMap.getOrDefault(key, 0) + 1);
        }
        // 각 종류별 경우의 수를 계산합니다.
        for (String key : countHashMap.keySet()) {
            answer *= countHashMap.get(key) + 1;
        }

        answer--;
//        System.out.println(countHashMap);

        return answer;
    }

    public static void main(String[] args) {
        String arr[][] = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(arr));
    }
}
