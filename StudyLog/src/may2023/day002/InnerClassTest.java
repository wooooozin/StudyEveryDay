package may2023.day002;
// 내부 클래스
// 하나의 클래스 내부에 선언된 또다른 클래스를 의미
// 내부 클래스는 외부 클래스에 대해 두개의 클래스가 서로 긴밀한 관계를 맺고 있을 때 선언하자

// 장점
// 1. 내부 클래스에서 외부 클래스의 멤버에 손쉽게 접근 가능
// 2. 서로 관련 있는 클래스를 논리적으로 묶어서 표현해 코드의 캡슐화를 증가
// 3. 외부에서는 내부 클래스에 접근할 수 없으므로, 코드의 복잡성을 줄일 수 있음

// 종류
// 1. 정적 클래스(Static class) - 주로 외부 클래스(outer class)의 클래스 메소드에 사용될 목적으로 선언
// 2. 인스턴스 클래스(Instance class) - 주로 외부 클래스(outer class)의 인스턴스 변수나 인스턴스 메소드에 사용될 목적으로 선언
// 3. 지역 클래스(local class) - 외부 클래스의 메소드나 초기화 블록에 선언된 클래스를 의미, 지역 클래스는 선언된 블록 내에서만 사용
// 4. 익명 클래스(anonymous class) - 다른 내부 클래스와는 달리 이름을 가지지 않는 클래스를 의미,
//                              - 클래스의 선언과 동시에 객체를 생성하므로, 단 하나의 객체만을 생성하는 일회용 클래스
//                              - 생성자를 선언할 수도 없으며, 오로지 단 하나의 클래스나 단 하나의 인터페이스를 상속받거나 구현할 수 있을 뿐
//                              - 구현해야 하는 메소드가 매우 적은 클래스를 구현할 때 사용

// 인스턴스 클래스
class OutClass {
    private int num = 10;
    private static int sNum = 20;

    private InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    class InClass { // 인스턴스 내부 클래스
        int inNum = 100;
        void inTest() {
            System.out.println("Outclass num " + num + "out class variable");
            System.out.println("Innerclass num" + sNum + "inner class variable");
        }
        public void usingClass() {
            inClass.inTest();
        }
    }
}

public class InnerClassTest {
    public static void main(String[] args) {
        System.out.println("외부 클래스를 이용해 내부 클래스 호출");
        OutClass outClass = new OutClass();
        OutClass.InClass inClass = outClass.new InClass();
        inClass.usingClass();
    }

}
