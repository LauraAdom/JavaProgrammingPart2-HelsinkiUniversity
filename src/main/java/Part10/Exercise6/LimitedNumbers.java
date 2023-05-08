package Part10.Exercise6;

import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            Integer integer = scanner.nextInt();

            if (integer < 0) {
                break;
            }

            integers.add(integer);
        }

        integers.stream()
                .filter(integer -> integer >= 1 && integer <= 5)
                .forEach(integer -> System.out.println(integer));
    }
}
