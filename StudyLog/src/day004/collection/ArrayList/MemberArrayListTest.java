package day004.collection.ArrayList;

import day004.collection.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLoop = new Member(1001, "Loopy");
        Member memberZanm = new Member(1002, "Zanmang");
        Member memberGaegu = new Member(1003, "Gaeguzange");
        Member memberBooro = new Member(1004, "BBororo");

        memberArrayList.addMember(memberLoop);
        memberArrayList.addMember(memberZanm);
        memberArrayList.addMember(memberGaegu);
        memberArrayList.addMember(memberBooro);

        memberArrayList.showAllMember();

        memberArrayList.removeMember(memberBooro.getMemberId());
        memberArrayList.removeMember(1007);
        memberArrayList.showAllMember();

        // 특정 인덱스에 멤버를 추가하려면?
        Member woozi = new Member(1005, "Woozi");
        memberArrayList.addIndexMember(woozi, 0);
        memberArrayList.showAllMember();

    }
}
