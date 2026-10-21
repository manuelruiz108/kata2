package software.ulpgc.kata2;
import software.ulpgc.kata2.io.*;
import software.ulpgc.kata2.model.Videogame;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
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

        File archivoSalida = new File("resumen.txt");
        try (FileOutputStream fos = new FileOutputStream(archivoSalida)) {
            SummaryWriter fileWriter = new StreamSummaryWriter(fos);
            fileWriter.write(videogamesFile, ratingPromedioFile);
            System.out.println("Resultados guardados con éxito en: " + archivoSalida.getAbsolutePath());
        }
    }
}
