package day001;

class Company {
    private Company() {} // 생성자는 private으로 선언
    private static Company instance = new Company(); // 클래스 내부에 유일한 private 인스턴스 생성

    // • 외부에서 유일한 인스턴스를 참조할 수 있는 public 메서드 제공
    public static Company getInstance() {
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
public class SingleToneTest {
    public static void main(String[] args) {
        Company company1 = Company.getInstance();

        Company company2 = Company.getInstance();

        System.out.println(company1); // day001.Company@28a418fc
        System.out.println(company2); // day001.Company@28a418fc

        //Calendar calendar = Calendar.getInstance();

    }
}
