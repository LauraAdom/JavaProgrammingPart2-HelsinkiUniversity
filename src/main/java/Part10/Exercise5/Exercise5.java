package Part10.Exercise5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        ArrayList<String> inputs = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            inputs.add(input);
        }

        inputs.stream()
                .forEach(input -> System.out.println(input));
    }
}