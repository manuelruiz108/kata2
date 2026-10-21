package software.ulpgc.kata2.io;
import software.ulpgc.kata2.model.Videogame;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface VideogameReader {
    List<Videogame> load();

    default List<Videogame> loadFrom(InputStream is) throws IOException {
        return loadFrom(new InputStreamReader(is));
    }
    private List<Videogame> loadFrom(Reader reader) throws IOException {
        return loadFrom(new java.io.BufferedReader(reader).lines().collect(Collectors.toList()));
    }
    private List<Videogame> loadFrom(List<String> lines) {
        return IntStream.range(1, lines.size())
                .mapToObj(i -> loadFrom(lines.get(i)))
                .collect(Collectors.toList());
    }
    private Videogame loadFrom(String lines) {
        return loadFrom(lines.split("\t"));
    }
    private Videogame loadFrom(String[] lines) {
        return new Videogame(lines[0],lines[1],Double.parseDouble(lines[3]),lines[4]);
    }
}
