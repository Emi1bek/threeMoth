package Generetic;

public class Box <T extends Number>{

    private T id;
    private T number;

    public Box(T id, T number) {
        this.id = id;
        this.number = number;
    }

    public Box() {
    }

    public static  <T extends Number> T method(Box<T> box){

       System.out.println(box);

       return null;

    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Box{" +
                "id=" + id +
                ", number=" + number +
                '}';
    }
}
