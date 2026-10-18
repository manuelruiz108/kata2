package software.ulpgc.kata2.io;

import software.ulpgc.kata2.model.Videogame;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class URLVideogameReader implements VideogameReader {
    private final URL url;

    public URLVideogameReader(URL url) {
        this.url = url;
    }

    @Override
    public List<Videogame> load() {
        try (InputStream is = url.openStream()) {
            return loadFrom(is);
        } catch (IOException e) {
            throw new RuntimeException("Error leyendo de la URL", e);
        }
    }
}