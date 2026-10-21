package software.ulpgc.kata2.model;

public record Videogame(String name, String platform, double rating, String genre) {
    @Override
    public String toString() {
        return "Videogame[" +
                "name=" + name + ", " +
                "platform=" + platform + ", " +
                "rating=" + rating + ", " +
                "genre=" + genre + ']';
    }
}