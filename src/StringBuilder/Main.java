package StringBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Song song = new Song("Nothing else matters","Metallica","So close, no matter how far\n" +
                "Couldn't be much more from the heart\n" +
                "Forever trusting who we are\n" +
                "And nothing else matters\n" +
                "Never opened myself this way\n" +
                "Life is ours, we live it our way\n" +
                "All these words I don't just say\n" +
                "And nothing else matters");


        FileWriter fileWriter = new FileWriter("Song.txt");
        fileWriter.append(song.getTitle()+"\n");
        fileWriter.append(song.getAuthor()+"\n");
        fileWriter.append(song.getText());
        fileWriter.close();

        FileReader reader = new FileReader("Song.txt");
        Scanner sc = new Scanner(reader);
         while(sc.hasNext()){
             System.out.println(sc.nextLine());
         }
         reader.close();

    }
}
