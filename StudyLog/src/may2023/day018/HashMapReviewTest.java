package may2023.day018;

import java.util.HashMap;

public class HashMapReviewTest {
    public static void main(String[] args) {
        // 해시맵 선언
        // public class HashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable
        // K: 지도에서 관리하는 키의 데이터 유형입니다. 키는 고유해야 합니다.
        // V: 유지되는 값의 데이터 타입입니다. 값은 고유하지 않아도 됩니다. 중복될 수 있습니다.
        HashMap<String, Integer> memberInfo = new HashMap<>();

        // 데이터 삽입
        memberInfo.put("loopy", 1001);
        memberInfo.put("dooly", 1002);
        memberInfo.put("ddochi", 1003);
        memberInfo.put("michael", 1004);
        System.out.println(memberInfo); // {michael=1004, loopy=1001, dooly=1002, ddochi=1003}

        // map 정보 확인
        System.out.println(memberInfo.entrySet()); // [michael=1004, loopy=1001, dooly=1002, ddochi=1003] , Set으로 반환
        System.out.println(memberInfo.keySet()); // [michael, loopy, dooly, ddochi] , key만 Set으로 반환
        System.out.println(memberInfo.values()); // [1004, 1001, 1002, 1003] , 모든 요소의 값만 묶어서 반환

        // key의 값 반환 못찾으면 null
        System.out.println(memberInfo.get("loopy")); // 1001

        // getOrDefualt - 지정된 키의 값을 반환, 키를 못찾으면 기본값으로 지정된 객체를 반환
        System.out.println(memberInfo.getOrDefault("nobody", -9999)); // -9999
        System.out.println(memberInfo.getOrDefault("ddochi", -9999)); // 1003

        // 삭제 - HashMap에 지정된 키로 저장된 값(객체)를 제거
        memberInfo.remove("michael"); // 1003
        System.out.println(memberInfo); // {loopy=1001, dooly=1002, ddochi=1003}


    }
}
