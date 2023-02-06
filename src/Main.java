import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        kvad(a);

    }
    public static void kvad(double a){

       a = Math.sqrt(a);


        if (a == (int) a){
            System.out.println(a);
        }
        else{
           throw new Error();
        }
    }
}