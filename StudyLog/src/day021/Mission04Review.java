package day021;

import java.util.Random;
import java.util.Scanner;

/*
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void generateResidentRegistrationNumber(int year, int month, int day, String gender) {
        int genderNumber = 0;

        if (year < 2000) {
            switch (gender) {
                case "m":
                    genderNumber = 1;
                    break;
                case "f":
                    genderNumber = 2;
                    break;
            }
        } else if (year >= 2000) {
            switch (gender) {
                case "m":
                    genderNumber = 3;
                    break;
                case "f":
                    genderNumber = 4;
                    break;
            }
        }

        String result = String.format("%02d%02d%02d-%d%d", year % 100, month, day, genderNumber, new Random().nextInt(1000000));
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("주민등록번호 계산");
        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        int year = sc.nextInt();
        System.out.print("출생월를 입력해 주세요.(mm):");
        int month = sc.nextInt();
        System.out.print("출생일를 입력해 주세요.(dd):");
        int day = sc.nextInt();
        System.out.print("성별을 입력해 주세요.(m/f):");
        String gender = sc.next();

        generateResidentRegistrationNumber(year, month, day, gender);
    }
}


new Random().nextInt(1000000)
로 처리를 하게되면,
작은 값이 나오는 경우, 주민번호의 자릿수가 맞지 않기 때문에
실행한 이후에 format 함수로 자릿수에 맞게 작성해 주시면 좋을 듯 합니다.

 */
public class Mission04Review {
    public static void calc(int year, int month, int day, String gender) {
        //yymmdd-g______
        //111111 -> 임의생성

        Random random = new Random();
        int min = 100000;
        int max = 999999;
        int seq = random.nextInt(max - min + 1) + min;
        int genderValue = "m".equalsIgnoreCase(gender) ? 3 : 4;

        String sn = String.format("%02d%02d%02d-%d%06d", (year % 100), month, day, genderValue, seq);
        System.out.println(sn);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("주민등록번호 계산");
        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        int year = sc.nextInt();
        System.out.print("출생월를 입력해 주세요.(mm):");
        int month = sc.nextInt();
        System.out.print("출생일를 입력해 주세요.(dd):");
        int day = sc.nextInt();
        System.out.print("성별을 입력해 주세요.(m/f):");
        String gender = sc.next();

        calc(year,month,day,gender);
    }
}
