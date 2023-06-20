import may2023.day004.collection.Member;

import java.util.HashMap;
import java.util.Iterator;

class MemberHashMap1 {
    private HashMap<Integer, Member> hashMap;

    public MemberHashMap1() {
        hashMap = new HashMap<>();
    }

    public void addMember(Member member){
        hashMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId) {
        if (hashMap.containsKey(memberId)) {
            hashMap.remove(memberId);
            return true;
        }
        return false;
    }

    public void showAllMembers() {
        Iterator<Integer> ir = hashMap.keySet().iterator();
        while (ir.hasNext()) {
            Integer key = ir.next();
            Member member = hashMap.get(key);
            System.out.println(member);
        }
    }
}
public class MapTest {
    public static void main(String[] args) {
        MemberHashMap1 memberHashMap = new MemberHashMap1();


        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");
        Member memberHong = new Member(1004, "홍길동");

        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberKang);
        memberHashMap.addMember(memberHong);

        memberHashMap.showAllMembers();

        memberHashMap.removeMember(1004);
        memberHashMap.showAllMembers();
    }
}
