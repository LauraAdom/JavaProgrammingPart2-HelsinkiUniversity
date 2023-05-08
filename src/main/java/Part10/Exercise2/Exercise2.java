package Part10.Exercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        ArrayList<String> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("end")) {
                break;
            }

            numbers.add(input);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");

        String filterDecision = scanner.nextLine();

        if (filterDecision.equals("n")) {

            Double avg = numbers.stream()
                    .mapToInt(numb -> Integer.valueOf(numb))
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble();

            System.out.println("Average of the negative numbers: " + avg);

        } else {

            Double avg = numbers.stream()
                    .mapToInt(numb -> Integer.valueOf(numb))
                    .filter(number -> number > 0)
                    .average()
                    .getAsDouble();

            System.out.println("Average of the positive numbers: " + avg);
        }
    }
}

