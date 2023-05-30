package may2023.day003.exception;

class AutoCloseObj implements AutoCloseable {

    @Override // AutoCloseable 인터페이스는 반드시 close() 메서드를 구현해야 함 - 파일스트림을 닫거나, 네트워크 연결을 해제하는 코드 등을 작성
    public void close() throws Exception {
        System.out.println("리소스가 close() 되었습니다.");
    }
}
public class AutoCloseTest {
    public static void main(String[] args) {
        // 정상적으로 처리
        try (AutoCloseObj obj = new AutoCloseObj()) { // try문 괄호안에 리소스를 선언, 리소스 여러개면 ; 붙여서 또 생성해 사용
                                                      // try (A a = new A(); B b = new B();) { } catch (...) { }
            // 정상처리 되어도 자동으로 close() 메서드 닫힘
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("예외 부분입니다.");
        }

        // 예외 처리 - java 9 이상부터 향상된 try - with - resources
        AutoCloseObj obj = new AutoCloseObj();
        try (obj) {
            throw new Exception(); // 강제로 예외 발생
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("예외 발생");
        }
    }
}
