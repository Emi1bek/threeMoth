package ArrayList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException, MyException {

        Student[] students = new Student[5];
        ArrayList<Student> arrayList = new ArrayList();
        try {
            arrayList.add(new Student("name", 1));
            arrayList.add(new Student("name1", 1));
            arrayList.add(new Student("name2", 1));
            arrayList.add(new Student("name3", 1));
            arrayList.add(new Student("name4", 1));
        }
        catch (MyException | IndexOutOfBoundsException | NumberFormatException my){

            System.out.println(my.getMessage());

        }
        finally {
            System.out.println("Finally");
        }
//        for (Student sr : arrayList
//        ) {
//            System.out.println(sr);
//        }
    }
}
