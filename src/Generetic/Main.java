package Generetic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//import static com.sun.tools.javac.tree.TreeInfo.args;

public class Main {
    public static <A> void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Integer[] arr = {1,23,4,5,6};
        arg(new String[]{"emilbek","Hallo","Java"});
        arg(arr);

    }
    public static <A> void arg(A[] name){

        for (int i =0; i< name.length; i++){
            if(i==0){
                System.out.println("первый элемент = "+name[i]);
            }

        }

        int lastElementArray = name.length-1;

        System.out.println(lastElementArray);


    }

}
