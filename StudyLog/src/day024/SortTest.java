package day024;

import java.util.Arrays;
import java.util.Comparator;

public class SortTest {
    public static void main(String[] args) {
        int[] ints = {13, 56, 32, 123, 61, 123, 1, 6};
        // 기본타입 배열이라면 Object를 상속하는 Wrapper 클래스로 박싱해주어야 역순정렬이 가능
        Integer[] tmpInts = Arrays.stream(ints).boxed().toArray(Integer[]::new);
        Arrays.sort(tmpInts, (a, b) -> b - a); // 람다식 사용
        Arrays.sort(tmpInts, (a, b) -> b.compareTo(a));
        Arrays.sort(tmpInts, Comparator.reverseOrder());
        System.out.println(Arrays.toString(tmpInts)); // [123, 123, 61, 56, 32, 13, 6, 1]

        String[] strs = {"Banana", "banana", "bana", "Carrot", "car", "Car", "Apple", "apple"};
        // String, Integer, Double 등과 같은 Object 타입으로 따로 변환안해주고 사용
        Arrays.sort(strs, (a, b) -> b.compareTo(a)); // 1. ompareTo 사용
        Arrays.sort(strs, Comparator.reverseOrder()); // 2. Comparator.reverseOrder 사용
        System.out.println(String.join(", ", strs));
        // car, banana, bana, apple, Carrot, Car, Banana, Apple
    }
}
