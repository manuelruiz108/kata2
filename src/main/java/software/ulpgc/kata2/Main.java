package software.ulpgc.kata2;
import software.ulpgc.kata2.io.FileVideogameReader;
import software.ulpgc.kata2.io.VideogameReader;
import software.ulpgc.kata2.model.Videogame;

import java.io.File;
import java.net.URL;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File archivo = new File("videogames.tsv");
        VideogameReader fileReader = new FileVideogameReader(archivo);
        List<Videogame> videogames = fileReader.load();
        for (Videogame videogame : videogames) {
            System.out.println(videogame);
        }
    }
}
