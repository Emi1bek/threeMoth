package StringBuilderHW21;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter wr = new FileWriter("alfavit.txt");
        wr.write("Aa\n");
        wr.write("Aa\n");
        wr.write("Aa\n");
        wr.write("Aa\n");
        wr.write("Aa\n");
        wr.write("Aa\n");
        wr.write("Aa\n");
        wr.write("Aa\n");
        wr.write("Aa\n");
        wr.write("Aa\n");
        wr.write("Aa\n");
        wr.write("Aa\n");
        wr.write("Aa\n");
        wr.write("Aa\n");
        wr.write("Aa\n");
        wr.write("Aa\n");
        wr.write("Aa\n");
        wr.write("Aa\n");
        wr.write("Aa\n");
        wr.write("Aa\n");
        wr.write("Aa\n");
        wr.write("Aa\n");
        wr.write("Aa\n");
        wr.write("Aa\n");
        wr.write("Aa\n");
        wr.write("Aa\n");
        wr.write("Aa\n");
        wr.write("Aa\n");
        wr.write("Aa\n");
        wr.write("Aa\n");
        wr.write("Aa\n");
        wr.write("Aa\n");
        wr.write("1\n");
        wr.write("1\n");
        wr.write("1\n");
        wr.write("1\n");
        wr.write("1\n");
        wr.write("1\n");
        wr.write("1\n");
        wr.write("1\n");
        wr.write("1\n");
        wr.write("1\n");
        wr.close();

        FileReader fr = new FileReader("Alfavit.txt");
        Scanner scanner  = new Scanner(fr);

        int count=0;
        while (scanner.hasNext()){
            System.out.println(++count+"-"+scanner.nextLine());
        }
        fr.close();

    }


}
