package may2023.day005.treemap;

import may2023.day004.collection.Member;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();

        Member memberPark = new Member(1003, "박서흰");
        Member memberLee = new Member(1001, "이지은");
        Member memberSon = new Member(1002, "손흥민");
        Member memberHong = new Member(1004, "홍길동");

        memberTreeMap.addMember(memberPark);
        memberTreeMap.addMember(memberLee);
        memberTreeMap.addMember(memberSon);
        memberTreeMap.addMember(memberHong);

        memberTreeMap.showAllMember();

        memberTreeMap.removeMember(1004);
        memberTreeMap.showAllMember();
    }
}
