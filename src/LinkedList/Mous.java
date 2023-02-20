package LinkedList;

public class Mous extends Animal{
    public Mous(int id, int age) {
        super(id, age);
    }
    @Override
    public String toString() {
        return "Mous: " +
                "id=" + id +
                ", age=" + age +
                ": ";
    }
}
