package Map;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Задача 24-1
//        Car car1 = new Car(2, 99203);
//        Car car2 = new Car(3, 99303);
//        Car car3 = new Car(4, 99403);
//        Car car4 = new Car(5, 99403);
//        Car car5 = new Car(6, 99403);
//
//        HistoryCar historyCar1 = new HistoryCar(1990, "BMV4", "Blue", 2000200);
//        HistoryCar historyCar2 = new HistoryCar(1990, "Mers", "Blue", 120000);
//        HistoryCar historyCar3 = new HistoryCar(1990, "Matiz", "Blue", 700000);
//        HistoryCar historyCar4 = new HistoryCar(1990, "Rio Kia", "Blue", 230000);
//        HistoryCar historyCar5 = new HistoryCar(1990, "Rio Kia", "Blue", 230000);
//
//
//        Map<Car, HistoryCar> maps = new HashMap<>();
//        maps.put(car5, historyCar5);
//        maps.put(car1, historyCar1);
//        maps.put(car2, historyCar2);
//        maps.put(car3, historyCar3);
//        maps.put(car4, historyCar4);
//
//
//        for (Map.Entry<Car, HistoryCar> map : maps.entrySet()) {
//            System.out.println(map);
//        }

        //Задача 24-1 - конец


        City city = new City(1, "Name1");
        City city1 = new City(2, "Name1");
        City city2 = new City(3, "Name1");
        City city3 = new City(4, "Name1");
        City city4 = new City(5, "Name1");


        ArrayList<City> arrayListCity = new ArrayList<>();
        arrayListCity.add(city);
        arrayListCity.add(city1);
        arrayListCity.add(city2);
        arrayListCity.add(city3);
        arrayListCity.add(city4);
        System.out.println(arrayListCity);
        TreeSet treeSetCity = new TreeSet();
        System.out.println(arrayListCity.get(1).getCode() % 2 == 0);

//        for (int i = 0; i < arrayListCity.size(); i++) {
//            if (arrayListCity.get(i).getCode() % 2 == 0) {
//                treeSetCity.add(arrayListCity.get(i));
//            }

            for (City a: arrayListCity) {
                if (a.getCode() % 2 ==0){
                    treeSetCity.add(a);
                }

            }
            System.out.println(treeSetCity);
        }
    }

