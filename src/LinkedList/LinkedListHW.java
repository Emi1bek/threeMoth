package LinkedList;

import java.io.IOException;
import java.util.*;

public class LinkedListHW {

    public static void main(String[] args) throws IOException {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        LinkedList<Animal> linkedList = new LinkedList<>();
        int summ = 0;
        for (int i = 1; i <= 50; i++) {
            int random = rd.nextInt(1, 10);
            linkedList.add(new Cat(i, random));
            linkedList.add(new Dog(i, random));
            //linkedList.add(new Mous(i, random));

        }
        for (int j = 3; j < linkedList.size(); j += 3) {

            int random = rd.nextInt(1, 10);
            if (linkedList.get(j) instanceof Dog) {
                linkedList.add(j+1,new Mous(j, random));
            }
        }
        for (int j = 5; j < linkedList.size(); j += 5) {
            if(linkedList.get(j) instanceof Mous) {
                linkedList.remove(j);
            }
        }

        for (Animal a : linkedList) {
            summ += a.getAge();
        }
        System.out.println(linkedList);
        ArrayList<Animal> arrayListAnimal = new ArrayList<>();
        arrayListAnimal.addAll(linkedList);
        System.out.println(summ);


    }
}




