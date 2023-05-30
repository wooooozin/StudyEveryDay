package may2023.day001;

public class BitOperator {
    public static void main(String[] args) {
        //  비트 이동 연산자(<<. >>, >>>)
        // x << y : 정수 x의 각 비트를 y만큼 왼쪽으로 이동시킵니다. (빈자리는 0으로 채워집니다.)
        // x >> y : 정수 x의 각 비트를 y만큼 오른쪽으로 이동시킵니다. (빈자리는 정수 a의 최상위 부호비트와 같은 값으로 채워집니다.)
        // x >>> y	: 정수 x의 각 비트를 y만큼 오른쪽으로 이동시킵니다. (빈자리는 0으로 채워집니다.)

        int x = 2;
        int y = 3;
        System.out.println(Integer.toBinaryString(x)); // 0010
        System.out.println(Integer.toBinaryString(x << y)); // 10000

        System.out.println(Integer.toBinaryString(x >> y)); // 0
        System.out.println(Integer.toBinaryString(x >> 1)); // 1

        // & (AND연산) - &연산(논리곱)은 2진수로 표현된 2개의 피연산자를 AND연산 하여 결과를 나타냅니다.
        //              2진수로 표현된 두 비트가 모두 1일 경우에만 연산결과가 1로 표현됩니다.
        System.out.println("15 & 25 = " + (15 & 25)); // 9
        System.out.println(Integer.toBinaryString(15)); // 01111
        System.out.println(Integer.toBinaryString(25)); // 11001
        System.out.println(Integer.toBinaryString(9));  // 01001 - 둘다 1이면 1 다르면 0

        // | (OR연산) - |연산(논리합)은 2진수로 표현된 2개의 피연산자를 OR연산 하여 결과를 나타냅니다.
        //              2진수로 표현된 두 비트 중 하나가 1일 경우에만 연산결과가 1로 표현됩니다.
        System.out.println("15 | 25 = " + (15 | 25)); // 31
        System.out.println(Integer.toBinaryString(15)); // 01111
        System.out.println(Integer.toBinaryString(25)); // 11001
        System.out.println(Integer.toBinaryString(31)); // 11111 - 둘중 하나 1이면 1

        // ^ (XOR연산) - ^연산(배타적 논리합)은 2진수로 표현된 2개의 피연산자를 XOR연산 하여 결과를 나타냅니다.
        //              2진수로 표현된 두 비트 중 하나는 1이고 다른 하나가 0일경우에 연산결과가 1로 표현됩니다.
        System.out.println("15 ^ 25 = " + (15 ^ 25)); // 22
        System.out.println(Integer.toBinaryString(15)); // 01111
        System.out.println(Integer.toBinaryString(25)); // 11001
        System.out.println(Integer.toBinaryString(22)); // 10110 - 다르면 1 같으면 0



        // ~ (보수) - ~연산(논리부정)은 이진수로 표현된 피연산자의 값을 반전(보수)시켜주어 표현합니다.
        // 보수는 보충해주는 수 - 어떤 수를 만들기 위해 필요한 수
        // 쉽게 말하면 'n의 보수'는 '어떤 수에 대해 n의 제곱수가 되도록 만드는 수'
        // n진법에서의 n-1의 보수는 (n의 보수 - 1)이 됩니다.
//        "어떤 수를 부호를 바꾸고자 한다면 비트를 반전시킨 뒤 1을 더하면 된다"

        System.out.println("~25 = " + (~25)); // -26
        System.out.println("~25 = " + (~25 + 1)); // -25
        System.out.println(Integer.toBinaryString(25)); // 11001
        System.out.println(Integer.toBinaryString(~25));  //  11111111111111111111111111100110
        System.out.println(Integer.toBinaryString(~25 + 1));  //  11111111111111111111111111100111


    }
}
