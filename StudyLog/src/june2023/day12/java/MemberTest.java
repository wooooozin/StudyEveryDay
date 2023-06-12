package june2023.day12.java;

import java.util.ArrayList;
import java.util.Iterator;

class Member {

    private int memberId;        //회원 아이디
    private String memberName;   //회원 이름

    public Member(int memberId, String memberName){ //생성자
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {  //
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

    @Override
    public String toString(){   //toString 메소드 오버로딩
        return memberName + " 회원님의 아이디는 " + memberId + "입니다";
    }
}

class MemberArrayList {

    private ArrayList<Member> arrayList;  // ArrayList 선언

    public MemberArrayList(){
        arrayList = new ArrayList<Member>();  //멤버로 선언한 ArrayList 생성
    }

    public void addMember(Member member){  //ArrayList 에 멤버 추가
        arrayList.add(member);
    }

    public boolean removeMember(int memberId){  // 멤버 아이디를 매개변수로, 삭제 여부를 반환

//        for(int i =0; i<arrayList.size(); i++){ // 해당 아이디를 가진 멤버를 ArrayList에서 찾음
//            Member member = arrayList.get(i);
//            int tempId = member.getMemberId();
//            if(tempId == memberId){            // 멤버아이디가 매개변수와 일치하면
//                arrayList.remove(i);           // 해당 멤버를 삭제
//                return true;                   // true 반환
//            }
//        }
        Iterator<Member> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            if (member.getMemberId() == memberId) {
                arrayList.remove(member);
                return true;
            }
        }

        System.out.println(memberId + "가 존재하지 않습니다");  //for 가 끝날때 까지 return 이 안된경우
        return false;
    }

    public void showAllMember(){
//        for(Member member : arrayList){
//            System.out.println(member);
//        }
        Iterator<Member> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }
}

public class MemberTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");
        Member memberHong = new Member(1004, "홍길동");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberKim);
        memberArrayList.addMember(memberKang);
        memberArrayList.addMember(memberHong);

        memberArrayList.showAllMember();

        memberArrayList.removeMember(memberHong.getMemberId());
        memberArrayList.showAllMember();
    }
}
