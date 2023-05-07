package day005.hashmap;

import day004.collection.Member;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberPark = new Member(1001, "박서흰");
        Member memberLee = new Member(1002, "이지은");
        Member memberSon = new Member(1003, "손흥민");
        Member memberHong = new Member(1004, "홍길동");

        memberHashMap.addMember(memberPark);
        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberSon);
        memberHashMap.addMember(memberHong);

        memberHashMap.showAllMember();

        memberHashMap.removeMember(1004);
        memberHashMap.showAllMember();
    }
}
