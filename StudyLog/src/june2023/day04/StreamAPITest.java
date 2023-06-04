package june2023.day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPITest {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        // 반복문을 사용해 각 요소 출력
        for (int i = 0; i < intArr.length; i++) {
            System.out.printf("%d ", intArr[i]);
        }
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d ", list.get(i));
        }
        System.out.println();

        // 배열 스트림 생성하여 출력
        Arrays.stream(intArr).forEach(n -> System.out.printf("%d ", n));
        System.out.println();

        // 컬렉션 스트림 생성하여 출력
        list.stream().forEach(n -> System.out.printf("%d ", n));
        System.out.println();

        // 인트스트림 생성하여 출력
        IntStream.rangeClosed(1, 5).forEach(n -> System.out.printf("%d ", n));

        String[] strings = {"Apple", "is", "Jobs"};
        Arrays.stream(strings).filter(s -> s.length() >= 3).forEach(s -> System.out.printf("%s ", s));
        System.out.println();
        Arrays.stream(strings).map(s -> s + "s").forEach(s -> System.out.printf("%s ", s));
        // Apples iss Jobss

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> squareNumbers = numbers.stream().map(n -> n * n).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(squareNumbers); // [1, 4, 9, 16, 25]

        // Sum, Average
        int sum = IntStream.range(1, 5).sum(); // 1 ~ 4
        System.out.println(sum); // 10

        double average = IntStream.range(1, 5).average().getAsDouble();
        System.out.println(average); // 2.5

        // Min, Max
        int min = IntStream.range(1, 5).min().getAsInt();
        System.out.println(min); // 1
        int max = IntStream.rangeClosed(1, 5).max().getAsInt();
        System.out.println(max); // 5

        // reduce
        Stream<Integer> stream = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)).stream();
        System.out.println(stream.reduce((x, y) -> x + y).get()); // 15, 연쇄적으로 합함

        // reduce strings = {"Apple", "is", "Jobs"};
        Stream<String> stringStream = Arrays.stream(strings);
        System.out.println(stringStream.reduce("init : ", (s1, s2) -> s1 + s2));
        // init : AppleisJobs

        // forEach
        IntStream.rangeClosed(1, 10)
                .filter(x -> x % 2 == 0)
                .forEach(x -> System.out.print(x + " ")); // 2 4 6 8 10
    }
}
