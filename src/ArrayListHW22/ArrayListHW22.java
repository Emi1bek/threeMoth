package ArrayListHW22;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayListHW22 {
    public static void main(String[] args) {
        //ArrayList тузунуз
        //1ден 100го чейинки 50 сан менен толтурунуз
        //Дагы 2 ArrayList тузуп бирисине так сандарды, экинчисине жуп сандарды салыныз
        //Аларды консольго чыгарыныз

        ArrayList<Integer> a = new ArrayList();
        ArrayList<Integer> tak = new ArrayList();
        ArrayList<Integer> jup = new ArrayList();
        Random rd = new Random(100);
        for (int i = 1; i < 50; i++) {
            a.add(rd.nextInt(1, 50));
        }

        for (Integer ar : a) {
            if (ar % 2 == 0) {
                jup.add(ar);
            } else {
                tak.add(ar);
            }
        }
        int coutn = 0, coutn1 = 0;
        for (Integer in : jup) {
            System.out.println(++coutn+" жуп сан:"+in);
        }
        for (Integer in : tak) {
            System.out.println((++coutn1)+" так сан:"+in);
        }


    }
}
