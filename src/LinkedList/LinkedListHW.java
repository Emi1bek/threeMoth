package LinkedList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListHW {

    public static void main(String[] args) throws IOException {
        Animal[] animals = {
                new Cat(1, 16),
                new Cat(2, 15),
                new Cat(3, 14),
                new Cat(4, 14),
                new Cat(5, 14),
                new Dog(1, 14),
                new Dog(2, 10),
                new Dog(3, 10),
                new Dog(4, 10),
                new Dog(5, 10),
                new Mous(1, 9),
                new Mous(2, 9),
                new Mous(3, 9),
                new Mous(4, 9),
                new Mous(5, 10)
        };


        LinkedList<Animal> linkedList = new LinkedList<>();

        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                linkedList.addFirst(animal);
            } else if (animal instanceof Mous) {
                linkedList.addLast(animal);
            } else {
                linkedList.add(animal);
            }

        }
//
//        for (A:
//             ) {
//
//        }
        System.out.println(linkedList);
    }

    }
