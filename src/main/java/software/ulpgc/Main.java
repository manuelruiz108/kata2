package software.ulpgc;

import software.ulpgc.kata2.io.FileVideogameReader;
import software.ulpgc.kata2.io.VideogameReader;
import software.ulpgc.kata2.model.Videogame;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File archivo = new File("videogames.tsv");
        VideogameReader fileReader = new FileVideogameReader(archivo);
        List<Videogame> videogamesFile = fileReader.load();

        double ratingPromedioFile = videogamesFile.stream()
                .mapToDouble(Videogame::rating)
                .average()
                .orElse(0.0);

        for (Videogame videogame : videogamesFile){
            System.out.println(videogame);

        }
        System.out.printf("Rating: %.3f", ratingPromedioFile);
    }
}
