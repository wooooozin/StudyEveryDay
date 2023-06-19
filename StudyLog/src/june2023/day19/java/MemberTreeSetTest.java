package june2023.day19.java;

import may2023.day004.collection.Member;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class MemberTreeSet {

    private TreeSet<Member> treeSet;

    public MemberTreeSet(){
        treeSet = new TreeSet<Member>();
    }

    public void addMember(Member member){
        treeSet.add(member);
    }

    public boolean removeMember(int memberId){

        Iterator<Member> ir = treeSet.iterator();

        while( ir.hasNext()){
            Member member = ir.next();
            int tempId = member.getMemberId();
            if( tempId == memberId){
                treeSet.remove(member);
                return true;
            }
        }

        System.out.println(memberId + "가 존재하지 않습니다");
        return false;
    }

    public void showAllMember(){
        for(Member member : treeSet){
            System.out.println(member);
        }
        System.out.println();
    }
}

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberKim = new Member(1003, "김유신");
        Member memberLee = new Member(1001, "이순신");
        Member memberKang = new Member(1002, "강감찬");

        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberKang);
        memberTreeSet.showAllMember();
    }
}
