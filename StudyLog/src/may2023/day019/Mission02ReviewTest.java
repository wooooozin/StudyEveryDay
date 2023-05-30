package may2023.day019;
/*

이전 코드 -

public class Main {
    private static final int CASH_BACK_0 = 0;
    private static final int CASH_BACK_100 = 100;
    private static final int CASH_BACK_200 = 200;
    private static final int CASH_BACK_300 = 300;

    public static void getCashBackPrice(int price) {
        int cashBackResult;
        int cashBackPrice = (int)(price * 0.1);

        switch (cashBackPrice / 100) {
            case 0:
                cashBackResult = CASH_BACK_0;
                break;
            case 1:
                cashBackResult = CASH_BACK_100;
                break;
            case 2:
                cashBackResult = CASH_BACK_200;
                break;
            default:
                cashBackResult = CASH_BACK_300;
                break;
        }
        System.out.printf("결제 금액은 %d원 이고, 캐시백은 %d원 입니다.", price, cashBackResult);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해 주세요.(금액):");
        getCashBackPrice(sc.nextInt());
    }
}

내가 작성한 코드는 금액에 따른 분기처리를 해줬는데
캐시백을 먼저 구하고 이에 따른 결과에 따라 분기처리로 피드백
아래 코드는 300원 이상일 때는 300원 캐시백,
이 아래는 백원 단위로 적립되기 때문에 2100 -> 210 에서 100으로 나눈 나머지를 빼주어 십단위 아래 금액은 날린다.
너무 어렵게 생각한거 ..같은 너낌..
 */

import java.util.Scanner;

public class Mission02ReviewTest {
    public static void main(String[] args) {
        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해 주세요.");

        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int point = (int) ((double) money * 0.1);
        point = point - (point % 100);

        if (point > 300) {
            point = 300;
        }

        System.out.printf("결제 금액은 %d원이고, 캐시백은 %d원 입니다.", money, point);
    }
}
