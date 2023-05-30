package may2023.day008.hash;

import java.util.HashMap;

public class HashMapTest {
    static void solution(String s) {
        HashMap<Character, Integer> sH = new HashMap<>();
        for (char c : s.toCharArray()) { // ['s', 't', ... ,'s']
            sH.put(c, sH.getOrDefault(c, 0) + 1); // c를 키로 해서 (s를 키로해서) getOrDefault(c, 0) + 1;
            // c 값이 없으면 0을 값으로 넣고(default) c 값이 있으면 c의 값을 가져와서 + 1 해주고 덮어씀
            // put ('s' : 1)
            // put ('s'.getOrDefault('s', 0) + 1) s가 있기때문에 s의 값인 1을 가져오고 + 1 덮어씀
            // 빈도수 카운트
        }
        for (char key: sH.keySet()) { // 모든 key를 돌면서 key를 가져와서 key마다 값을 출력하면 빈도수를 구할 수 있음
            System.out.println(key + " " + sH.get(key));
        }
    }

    public static void main(String[] args) {
        solution("statitsics");
    }
}
