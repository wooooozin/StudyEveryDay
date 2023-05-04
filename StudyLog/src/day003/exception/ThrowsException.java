package day003.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    // Class를 동적으로 로딩하여 반환하는 메서드
    public Class loadClass(String fileName, String className) throws // 뒤의 두 예외를 메서드가 호출 될 때 처리하도록 미룸
            FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName); // FileNotFoundException 발생 가능
        Class c = Class.forName(className); // ClassNotFoundException 발생 가능
        return c;
    }

    public static void main(String[] args) {
        ThrowsException test = new ThrowsException();
        // 각 상황마다 예외처리
        try {
            test.loadClass("a.txt", "java.lang.String"); // 메서드를 호출할 때 예외를 처리함
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
