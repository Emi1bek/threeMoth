package ArrayListTask;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Cat> cats = new ArrayList<>();

        Cat cat = new Cat(1,"Toms");
        Cat cat2 = new Cat(2,"Toms2");
        Cat cat3= new Cat(3,"Toms3");
        Cat cat4 = new Cat(4,"Toms4");
        cats.add(cat);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        Scanner sc =new Scanner(System.in);
        int ageConsol = sc.nextInt();
        //String nameConsol = sc.nextLine();


    }
    private static void byName(ArrayList<Cat> cats, String name){
        for (int i = 0; i < cats.size(); i++) {
            if(cats.get(i).getName() == name){
                System.out.println(cats.get(i));
            }

        }

    }
    private static void byAge(ArrayList<Cat> cats, int age){
        for (int i = 0; i < cats.size(); i++) {
            if(cats.get(i).getAge() == age){
                System.out.println(cats.get(i));
            }

        }
    }
}
