package ArrayList;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) throws MyException {
        this.name = name;
        if (age <= 0) {
            throw new MyException("Ноль и минус болбош керек !");
            }

        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
