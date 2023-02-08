import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        Kyrgyzstan kr = Kyrgyzstan.valueOf(a.toUpperCase());
        switch (kr){
            case CHY -> kr.met();
            case TALAS -> kr.met();
            case YSYKKOL -> kr.met();
            case NARYN -> kr.met();
            case JALALABAD -> kr.met();
            case OSH -> kr.met();
            case BATKEN -> kr.met();
            default -> System.out.println("Нету");
        }

    }
}