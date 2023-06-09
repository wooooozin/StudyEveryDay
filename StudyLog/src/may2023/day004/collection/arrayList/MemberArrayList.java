package may2023.day004.collection.arrayList;

import may2023.day004.collection.Member;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private ArrayList<Member> arrayList; // Member 타입을 참조하는 arrayList 선언

    public MemberArrayList() { // 생성자
        arrayList = new ArrayList<Member>(); // 멤버 형으로 선언한 ArrayList 생성
    }

    public void addMember(Member member) {
        arrayList.add(member); // list add 메서드
    }

    // 특정 위치에 추가
    public void addIndexMember(Member member, int index) {
        arrayList.add(index, member);
    }

    public boolean removeMember(int memberId) {
        for (int i = 0; i < arrayList.size(); i++) {
            Member member = arrayList.get(i);
            int tempId = member.getMemberId();
            if (tempId == memberId) {
                arrayList.remove(i);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public boolean fixRemoveMember(int memberId) {
        Iterator<Member> ir = arrayList.iterator();
        while (ir.hasNext()) { // 다음 요소가 있는 동안
             Member member = ir.next(); // 다음 회원을 반환
            int tempId = member.getMemberId();
            if (tempId == memberId) {
                arrayList.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "일치하는 정보가 없다.");
        return false;
    }

    public void showAllMember() {
        for (Member member : arrayList) {
            System.out.println(member);
        }
        System.out.println();
    }

}
