package day004.TreeSet;

import day004.collection.Member;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
    private TreeSet<Member> treeSet;
    public MemberTreeSet() {
        this.treeSet = new TreeSet<Member>();
    }

    public void addMember(Member member) {
        treeSet.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator<Member> ir = treeSet.iterator();

        while (ir.hasNext()) {
            Member member = ir.next();
            int tempId = member.getMemberId();
            if (tempId == memberId) {
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "is not founded");
        return false;
    }

    public void showAllMember() {
        for (Member member : treeSet) {
            System.out.println(member);
        }
        System.out.println();
    }
}
