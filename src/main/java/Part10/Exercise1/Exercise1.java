package Part10.Exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {

    ArrayList<String> numbers = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextLine())

    {

        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("end")) {
            break;
        }

        numbers.add(input);
    }

    Double avg = numbers.stream()
            .mapToInt(numb -> Integer.valueOf(numb))
            .average()
            .getAsDouble();

        System.out.println("average of the numbers: " + avg.get());
}
