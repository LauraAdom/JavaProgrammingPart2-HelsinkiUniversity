package Part10.Exercise13;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {

    public static void main(String[] args) {

        List<String> literacyArray = new ArrayList<>();

        try {

            Files.lines(Paths.get("literacy.csv"))
                    .forEach(line -> literacyArray.add(line));

            literacyArray.stream()
                    .map(line -> line.split(","))
                    .sorted((line1, line2) -> line1[5].compareTo(line2[5]))
                    .forEach(ln -> System.out.println(ln[3] + " (" + ln[4] + "), " + String.format(ln[2].split(" ")[1]) + ", " + ln[5]));

        } catch (Exception ex) {

            System.out.println("Exception " + ex.getMessage());

        }
    }
}
