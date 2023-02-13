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
        wr.write("Bb\n");
        wr.write("Cc\n");
        wr.write("Dd\n");
        wr.write("Ee\n");
        wr.write("Ff\n");
        wr.write("Gg\n");
        wr.write("Hh\n");
        wr.write("Ii\n");
        wr.write("Jj\n");
        wr.write("Kk\n");
        wr.write("Ll\n");
        wr.write("Mm\n");
        wr.write("Nn\n");
        wr.write("Oo\n");
        wr.write("Pp\n");
        wr.write("Qq\n");
        wr.write("Rr\n");
        wr.write("Ss\n");
        wr.write("Tt\n");
        wr.write("Uu\n");
        wr.write("Vv\n");
        wr.write("Ww\n");
        wr.write("Ww\n");
        wr.write("Xx\n");
        wr.write("Yy\n");
        wr.write("Zz\n");
        wr.write("1\n");
        wr.write("2\n");
        wr.write("3\n");
        wr.write("4\n");
        wr.write("5\n");
        wr.write("6\n");
        wr.write("7\n");
        wr.write("8\n");
        wr.write("9\n");
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
