package june2023.day20.java;

import java.util.List;

public class MemberTest {
    public static void main(String[] args) {

        Member member = new Member();
        member.setUserId("loopy123");
        MemberService memberService = new MemberService();
        boolean result = memberService.register(member);
        boolean result2 = memberService.withdraw(member);

        List<Member> members = memberService.getList();

        System.out.println(member.getUserId());
    }
}
