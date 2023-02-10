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
        fileWriter.write("Nothing else matters\n");
        fileWriter.write("Metallica\n");
        fileWriter.write("So close, no matter how far\n" );
                fileWriter.write(       "Couldn't be much more from the heart\n" );
                        fileWriter.write(       "Forever trusting who we are\n" );
                                fileWriter.write(       "And nothing else matters\n" );
                                        fileWriter.write(       "Never opened myself this way\n" );
                                                fileWriter.write(       "Life is ours, we live it our way\n" );
                                                        fileWriter.write(       "All these words I don't just say\n" );
                                                                fileWriter.write(        "And nothing else matters");
        fileWriter.close();

        FileReader reader = new FileReader("Song.txt");
        Scanner sc = new Scanner(reader);
        StringBuilder builder = new StringBuilder();

        song.setTitle(sc.nextLine());
        song.setAuthor(sc.nextLine());
        while (sc.hasNext()){
            builder.append(song.setText(sc.nextLine()));
    }


         reader.close();


        System.out.println(song);





    }
}
