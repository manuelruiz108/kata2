package software.ulpgc.kata2.io;

import software.ulpgc.kata2.model.Videogame;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class FileVideogameReader implements VideogameReader {
    private final File file;

    public FileVideogameReader(File file) {
        this.file = file;
    }

    @Override
    public List<Videogame> load() {
        try (InputStream is = new FileInputStream(file)) {
            return loadFrom(is);
        } catch (IOException e) {
            throw new RuntimeException("Error leyendo el archivo", e);
        }
    }
}