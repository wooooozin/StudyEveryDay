package may2023.day004.hashset;

import may2023.day004.collection.Member;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet() {
        this.hashSet = new HashSet<Member>();
    }

    public void addMember(Member member) {
        hashSet.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator<Member> ir = hashSet.iterator();
        Member member = ir.next(); // 다음 변수 반환, Iterator 순환
        while (ir.hasNext()) {
            int tempId = member.getMemberId();
            if (tempId == memberId) {
                hashSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "is not founded");
        return false;
    }

    public void showAllMember() {
        for (Member member : hashSet) {
            System.out.println(member);
        }
        System.out.println();
    }
}
