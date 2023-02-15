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
                new Dog(4, 14),
                new Dog(5, 10),
                new Mous(6, 9),
                new Mous(7, 10)
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
        System.out.println(linkedList);
    }

    }
