package Part10.Exercise9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Exercise9 {

    public static List<String> read(String file) throws IOException {

        List<String> stringsList = new ArrayList<>();

        try {

            Files.lines(Paths.get(file))
                    .forEach(row -> stringsList.add(row));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return stringsList;
    }
}
