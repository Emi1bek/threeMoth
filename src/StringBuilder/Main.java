package StringBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {


        Song song = new Song();
        FileWriter fileWriter = new FileWriter("Song.txt");
        fileWriter.write("Titile: Nothing else matters\n");
        fileWriter.write("Author: Metallica\n");
        fileWriter.write("Text: So close, no matter how far\n" +
                "Couldn't be much more from the heart\n" +
                       "Forever trusting who we are\n" +
                               "And nothing else matters\n" +
                                        "Never opened myself this way\n" +
                                                "Life is ours, we live it our way\n" +
                                                       "All these words I don't just say\n" +
                                                 "And nothing else matters");
        fileWriter.close();

        FileReader reader = new FileReader("Song.txt");
        Scanner sc = new Scanner(reader);
        StringBuilder builder = new StringBuilder();

        song.setTitle(sc.nextLine());
        song.setAuthor(sc.nextLine());


         reader.close();


        System.out.println(song);
        System.out.println(song.getText());





    }
}
