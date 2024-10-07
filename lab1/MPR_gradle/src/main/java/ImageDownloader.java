import org.apache.commons.io.FileUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

public class ImageDownloader {
    public static void main(String[] args) {
        String imageUrl = "https://www.thealexandriazoo.com/images/animals/Capybara02.jpg";
        String destinationFile = "src/main/resources/Capybara.jpg";
        String htmlFile = "src/main/resources/index.html";

        try {
            FileUtils.copyURLToFile(new URL(imageUrl), new File(destinationFile));
            System.out.println("Obrazek pobrany: " + destinationFile);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(htmlFile))) {
                writer.write("<!DOCTYPE html>\n");
                writer.write("<html lang=\"pl\">\n");
                writer.write("<head>\n");
                writer.write("    <meta charset=\"UTF-8\">\n");
                writer.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
                writer.write("    <title>Obrazek Kapibary</title>\n");
                writer.write("</head>\n");
                writer.write("<body>\n");
                writer.write("    <h1>Kapibara</h1>\n");
                writer.write("    <img src=\"Capybara.jpg\" alt=\"Kapibara\" style=\"max-width: 100%; height: auto;\">\n");
                writer.write("</body>\n");
                writer.write("</html>\n");
            }

            System.out.println("Plik HTML wygenerowany: " + htmlFile);
        } catch (IOException e) {
            System.err.println("Błąd podczas pobierania pliku: " + e.getMessage());
        }
    }
}
