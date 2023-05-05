package day004.TreeSet;

import day004.collection.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberPark = new Member(1003, "박서흰");
        Member memberLee = new Member(1001, "이지은");
        Member memberSon = new Member(1002, "손흥민");

        memberTreeSet.addMember(memberPark);
        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberSon);
        memberTreeSet.showAllMember();

        Member memberHong = new Member(1003, "홍길동");
        memberTreeSet.addMember(memberHong);
        memberTreeSet.showAllMember();

    }
}
