package july2023.day22;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
    int idx;
    int priority;

    public Person(int idx, int priority) {
        this.idx = idx;
        this.priority = priority;
    }
}

public class Main {

    private static int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Person> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(new Person(i, arr[i])); // 큐에 배열 인덱스와 우선순위 추가
        }

        while (!queue.isEmpty()) {
            Person person = queue.poll();
            for (Person p : queue) {
                if (p.priority > person.priority) {
                    queue.offer(person);
                    person = null;
                    break;
                }
            }
            if (person != null) {
                answer++;
                if (person.idx == m) {
                    return answer;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, m, arr));
    }
}
