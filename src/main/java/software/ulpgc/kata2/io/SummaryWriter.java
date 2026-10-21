package software.ulpgc.kata2.io;

import software.ulpgc.kata2.model.Videogame;
import java.util.List;

public interface SummaryWriter {
    void write(List<Videogame> videogames, double ratingPromedio);
}