package LinkedList;

import java.util.*;

public class HomeWord22 {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList();
        LinkedList<Integer> l = new LinkedList<>();
        Random rd = new Random(4);
        for (int i = 0; i < 10; i++) {
            a.add(rd.nextInt(0, 2));
            l.add(rd.nextInt(0,2));
        }
        System.out.println();

        Collections.sort(a);
        System.out.println(a);
        Collections.sort(l);
        System.out.println(l);

    }

//    @Override
//    public int compareTo(int o){
//        return this.int-o.int;
//    }
}
