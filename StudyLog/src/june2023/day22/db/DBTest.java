package june2023.day22.db;

import java.util.Scanner;

public class DBTest {
    public static void main(String[] args) {
        MemberService db = new MemberService();
        db.dbSelect();
//        db.dbInsert();
//        db.dbUpdate();
//        db.dbDelete();
        Scanner sc = new Scanner(System.in);

//        String memberType = "email";
//
//        System.out.println("아이디 입력 >> ");
//        String userId = sc.next();
//        System.out.println("비밀번호 입력 >> ");
//        String password = sc.next();
//        System.out.println("이름 입력 >> ");
//        String name = sc.next();
//
//        Member member = new Member();
//        member.setMemberType(memberType);
//        member.setUserId(userId);
//        member.setPassword(password);
//        member.setName(name);
//
//        db.registerMember(member);
    }
}
