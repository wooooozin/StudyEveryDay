package may2023.day020;

/*

import java.util.Scanner;

public class Main {
    private static final int SPECIAL_DISCOUNT_FEE = 4000;
    private static final int NOMAL_DISCOUNT_FEE = 8000;
    private static final int FEE = 10000;


    public static void getEntranceFee(int age, int hour, String national, String welfare) {
        int fee = FEE;

        if (age <= 3) {
            fee = 0;
        } else if ((age >= 4 && age < 13) || (hour >= 17 && hour <= 24)) {
            fee = SPECIAL_DISCOUNT_FEE;
        } else if (national.equals("y") || welfare.equals("y")) {
            fee = NOMAL_DISCOUNT_FEE;
        }
        System.out.printf("입장료 : %d\n", fee);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[입장료 계산]");
        System.out.print("나이를 입력해 주세요.(숫자):");
        int age = sc.nextInt();
        System.out.print("입장 시간을 입력해 주세요.(숫자입력):");
        int hour = sc.nextInt();
        System.out.print("국가 유공자 여부를 입력해 주세요.(y/n):");
        String national = sc.next();
        System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
        String welfare = sc.next();

        getEntranceFee(age, hour, national, welfare);
    }
    // 나의 작성 코드
    문자열 비교를 위한 equals 함수는
    변수보다는 상수문자열을 기준으로 비교함수를 호출하는게 좋음
    늘 null에 대해서 고민해야 함.

}

 */

import java.util.Scanner;
public class Mission03Review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[입장료 계산]");
        System.out.print("나이를 입력해 주세요.(숫자):");
        int age = sc.nextInt();
        System.out.print("입장 시간을 입력해 주세요.(숫자입력):");
        int hour = sc.nextInt();
        System.out.print("국가 유공자 여부를 입력해 주세요.(y/n):");
        String national = sc.next();
        System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
        String welfare = sc.next();

        int fee = 10000;
        if (age <= 3) {
            fee = 0;
        } else if (age < 13 || hour > 17) {
            fee = 4000;
        } else if ("y".equalsIgnoreCase(welfare)|| // 상수문자열을 기준으로 비교함수를 호출
                "y".equalsIgnoreCase(national)) { // 상수문자열을 기준으로 비교함수를 호출
            fee = 8000;
        }

        System.out.printf("입장료 : %d\n", fee);

    }
}
