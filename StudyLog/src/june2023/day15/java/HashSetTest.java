package june2023.day15.java;

import java.util.HashSet;
import java.util.Iterator;

class Member {
    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String toString() {
        return memberName + " 회원님의 아이디는" + memberId + "입니다.";
    }

    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            if (this.memberId == member.getMemberId()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}

class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet(){
        hashSet = new HashSet<Member>();
    }

    public void addMember(Member member){
        hashSet.add(member);
    }

    public boolean removeMember(int memberId){

        Iterator<Member> ir = hashSet.iterator();

        while( ir.hasNext()){
            Member member = ir.next();
            int tempId = member.getMemberId();
            if( tempId == memberId){
                hashSet.remove(member);
                return true;
            }
        }

        System.out.println(memberId + "가 존재하지 않습니다");
        return false;
    }

    public void showAllMember(){
        for(Member member : hashSet){
            System.out.println(member);
        }
        System.out.println();
    }
}

public class HashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");


        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberKang);
        memberHashSet.showAllMember();

        Member memberHong = new Member(1003, "홍길동");  //1003 아이디 중복
        memberHashSet.addMember(memberHong);
        memberHashSet.showAllMember();

    }
}
