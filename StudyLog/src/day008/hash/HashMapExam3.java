package day008.hash;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.HashMap;

public class HashMapExam3 {

    static int solution(int[] array) {HashMap<Integer, Integer> nH = new HashMap<>(); for(int x : array){
        nH.put(x, nH.getOrDefault(x, 0) + 1); }
        int max = 0;
        for(int key : nH.keySet()){
            if(nH.get(key) > max) max = nH.get(key); }
        ArrayList<Integer> al = new ArrayList<>(); for(int key : nH.keySet()){
            if(nH.get(key) == max) al.add(key); }
        if(al.size() > 1) return -1;
        return al.get(0);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 4};
        System.out.println(solution(arr));

        int[] arr1 = {1, 1, 2, 2};
        System.out.println(solution(arr1));

        int[] arr2 = {1};
        System.out.println(solution(arr2));
    }
}
