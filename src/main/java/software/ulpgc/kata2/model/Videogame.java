package software.ulpgc.kata2.model;

import java.util.Objects;

public record Videogame(String name, String platform, Double rating, String genre) {

    @Override
    public String toString() {
        return "Videogame[" +
                "name=" + name + ", " +
                "platform=" + platform + ", " +
                "rating=" + rating + ", " +
                "genre=" + genre + ']';
    }

}
