package PractikOne;

import java.util.*;

public class MainOne {

    public static void main(String[] args) {

        Random rd = new Random();
        int[] array = new int[10];
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(1, 10);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    count++;
                    map.put(array[i], count);
                    count = 0;
                }
            }
        }
        System.out.println(Arrays.toString(array));

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            System.out.println(m);
        }
    }
}
