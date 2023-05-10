package day008.hash;

import java.util.HashMap;

public class HashMapExam1 {

    static int solution(String s) {
        int answer = -1;
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String str : s.split("")) {
            hashMap.put(str, hashMap.getOrDefault(str, 0) + 1);
        }
        for (String key : hashMap.keySet()) {
            if (hashMap.get(key) == 1) {
//                System.out.println(key + " " + hashMap.get(key));
                answer = s.indexOf(key);
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("statitsics"));
        System.out.println(solution("aabb"));
        System.out.println(solution("stringshowtime"));
        System.out.println(solution("abcdeabcdfg"));
        System.out.println(solution("teachertimeachest"));
    }
}
