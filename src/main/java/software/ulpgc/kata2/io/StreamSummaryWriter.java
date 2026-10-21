package software.ulpgc.kata2.io;

import software.ulpgc.kata2.model.Videogame;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.List;

public class StreamSummaryWriter implements SummaryWriter {
    private final OutputStream outputStream;

    public StreamSummaryWriter(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void write(List<Videogame> videogames, double ratingPromedio) {
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(outputStream))) {
            write(writer, videogames, ratingPromedio);
        } catch (IOException e) {
            throw new RuntimeException("Error escribiendo los datos de salida", e);
        }
    }

    private void write(Writer writer, List<Videogame> videogames, double ratingPromedio) throws IOException {
        write(writer, videogames);
        write(writer, ratingPromedio);
    }

    private void write(Writer writer, List<Videogame> videogames) throws IOException {
        for (Videogame videogame : videogames) {
            write(writer, videogame);
        }
    }

    private void write(Writer writer, Videogame videogame) throws IOException {
        writer.write(videogame.toString() + "\n");
    }

    private void write(Writer writer, double ratingPromedio) throws IOException {
        writer.write(String.format("%.3f%n", ratingPromedio));
    }
}