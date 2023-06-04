package june2023.day04;

public class CombinationTest1 {
    public static int getCombination(int n, int r) {
        int pResult = 1;
        for (int i = n; i >= n - r + 1; i--) {
            pResult *= i;
        }
        int rResult = 1;
        for (int i = 1; i <= r; i++) {
            rResult *= i;
        }
        return pResult / rResult;
    }

    public static void main(String[] args) {
        // 조합 - 서로 다른 4명 중 주변 2명을 뽑는 경우의 수
        int n = 4;
        int r = 2;

        int pResult = 1;
        for (int i = n; i >= n - r + 1; i--) {
            pResult *= i;
        }
        int rResult = 1;
        for (int i = 1; i <= r; i++) {
            rResult *= i;
        }
        System.out.println(pResult / rResult); // 6

        // 후보 2명, 유권자 3명 유기명 투표 경우의 수
        n = 2;
        r = 3;
        System.out.println(getCombination(n + r - 1, r)); // 4
    }
}
