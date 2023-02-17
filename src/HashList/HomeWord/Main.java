package HashList.HomeWord;

import ArrayList.MyException;

import java.util.*;

public class Main {
    public static void main(String[] args) throws MyException {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);

        System.out.println(symmetricDifference(set,set1));


    }
    public static Set<Integer> symmetricDifference(Set set, Set set1){

        Set<Integer> set3 = new TreeSet<>();
        set3.addAll(set);
        set3.addAll(set1);


        return set3;
    }
}
