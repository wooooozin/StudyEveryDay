package day003.scanner;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("직업 : ");
        String job = sc.nextLine();
        System.out.print("사번 : ");
        int num = sc.nextInt();

        System.out.println(name + " " + job + " " +  num);

    }
}