package Part10.Exercise10;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BooksFromFile {

    public static List<Book> readBooks(String file) {

        List<Book> books = new ArrayList<>();

        try {

            books = Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .filter(parts -> parts.length >= 4)
                    .map(line -> new Book(line[0], Integer.valueOf(line[1]), Integer.valueOf(line[2]), line[3]))
                    .collect(Collectors.toCollection(ArrayList::new));

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        return books;
    }
}
