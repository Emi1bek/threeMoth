package HashList;

import ArrayList.MyException;
import ArrayList.Student;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) throws MyException {
       Student student = new Student("a",1);
       Student student2 = new Student("a",1);
       Student student3= new Student("a",1);
       Student student4 = new Student("a",1);

        LinkedHashSet<Student> hashSet = new LinkedHashSet<>();
        hashSet.add(student);
        hashSet.add(student2);
        hashSet.add(student3);
        hashSet.add(student4);

        System.out.println(hashSet);

    }
}
