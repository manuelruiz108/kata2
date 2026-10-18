package software.ulpgc.kata2;
import software.ulpgc.kata2.io.FileVideogameReader;
import software.ulpgc.kata2.io.URLVideogameReader;
import software.ulpgc.kata2.io.VideogameReader;
import software.ulpgc.kata2.model.Videogame;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        File archivo = new File("videogames.tsv");
        VideogameReader fileReader = new FileVideogameReader(archivo);
        List<Videogame> videogamesFile = fileReader.load();
        for (Videogame videogame : videogamesFile) {
            System.out.println(videogame);
        }
        double ratingPromedioFile = videogamesFile.stream()
                .mapToDouble(Videogame::rating)
                .average()
                .orElse(0.0);
        System.out.printf("%.3f%n",ratingPromedioFile);
        URL url = new URL("https://raw.githubusercontent.com/manuelruiz108/kata2/main/videogamesURL.tsv");
        VideogameReader urlReader = new URLVideogameReader(url);
        List<Videogame> videogamesURL = urlReader.load();
        for (Videogame videogame : videogamesURL) {
            System.out.println(videogame);
        }
        double ratingPromedioURL = videogamesURL.stream()
                .mapToDouble(Videogame::rating)
                .average()
                .orElse(0.0);
        System.out.printf("%.3f%n",ratingPromedioURL);
    }
}
