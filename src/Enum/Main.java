package Enum;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nameWeek = sc.nextLine();
        HWweek[] hWweekArray = HWweek.values();
        boolean test;


       // HWweek hWweek = HWweek.valueOf(nameWeek);
      //  System.out.println(hWweekArray.getClass().getName().equals("Дуйшонбу"));
        for (HWweek hw: hWweekArray
             ) {
            if(hw.getClass().getName().equals("Дуйшонбу")){

                            }

        }

        switch (nameWeek){
            case "Дуйшонбу" -> System.out.println("Дуйшонбу");
        }


    }
}
