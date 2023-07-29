package july2023.day29;

import java.util.*;

class Point implements Comparable<Point> {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        // 원하는 결과를 얻으려면 앞과 뒤 순서로 정렬 : 음수값이 리턴되도록 정렬
        // this.y - o.y
        if (this.x == o.x) {
            return this.y - o.y;
        } else { // x가 다르면
            return this.x - o.x;
        }
    }
}

public class Main {

    private List<Point> solution(ArrayList<Point> points) {
        Collections.sort(points);
        return points;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        Point[] points = new Point[n];
//        for (int i = 0; i < n; i++) {
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            points[i] = new Point(x, y);
//        }
//        Arrays.sort(points);

        List<Point> points2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            points2.add(new Point(x, y));
        }
        Collections.sort(points2);

        for (Point p : points2) {
            System.out.println(p.x + " " + p.y);
        }
    }
}
