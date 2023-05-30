package may2023.day003.inputstream;

import java.io.IOException;
public class SystemInTest {
    public static void main(String[] args) throws IOException {
        System.out.println("알파벳 하나를 쓰고 엔터를 누르세요");
        int i;
        try {
            i = System.in.read(); // read()메서드로 1byte 읽음
            System.out.println(i);
            System.out.println((char) i);
            System.in.read(new byte[System.in.available()]); // 남아있는 입력 스트림을 삭제
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 문자 여러개 입력 받기
        System.out.println("알파벳 여러개 쓰고 엔터를 누르세요");
        int i1;
        try {
            while ((i1 = System.in.read()) != '\n') {
                System.out.print((char)i1);
            }
            System.in.read(new byte[System.in.available()]); // 남아있는 입력 스트림을 삭제
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
