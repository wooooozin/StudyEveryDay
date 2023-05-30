package may2023.day001;

public class DimensionArrayTest {
    public static void main(String[] args) {
        //2차원 데이터_타입[][] 변수_이름 = new    데이터_타입[행의_수][열의_수];
        int[][] arr = new int[3][4];
        int[][] arr1 = {
                { 1, 2, 3, 4 }, // 0
                { 5, 6, 7, 8 }, // 1
                { 9, 10, 11, 12 } // 2
                // 0 1   2   3
        };
        int value = arr1[1][2];
        System.out.println(value); // 1행의 2열 인덱스 값 7

        // 3차원 - 데이터_타입[][][] 변수_이름 = new 데이터_타입[면의_수][행의_수][열의_수];
        int[][][] arr2 = new int[2][3][4];
        int[][][] arr3 = {
                { // 0
                        { 1, 2, 3, 4 }, // 0
                        { 5, 6, 7, 8 }, // 1
                        { 9, 10, 11, 12 } // 2
                        // 0 1   2   3
                },
                { // 1
                        { 13, 14, 15, 16 }, // 0
                        { 17, 18, 19, 20 }, // 1
                        { 21, 22, 23, 24 }  // 2
                        // 0   1  2   3
                }
        };
        int value1 = arr3[1][2][3];
        System.out.println(value1); // 24
    }
}
