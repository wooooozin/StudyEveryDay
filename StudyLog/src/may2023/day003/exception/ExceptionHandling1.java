package may2023.day003.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("a.txt");

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("여기도 호출이 됩니다.");
    }
}
