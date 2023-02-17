package HashList;

import java.util.ArrayList;
import java.util.Random;

public class HaskList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random rd = new Random(400);
        int sum = 0;
        for (int i = 0; i < 400; i++) {
            int varInt = rd.nextInt(0, 20);
            arrayList.add(varInt);

        }
        //  System.out.print(arrayList+" ");
        for (Integer ar : arrayList
        ) {
            sum += ar;

        }
        System.out.println(sum);

    }

}
