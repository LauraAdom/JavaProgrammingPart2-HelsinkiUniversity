package Part10.Exercise4;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Divisible {

    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        return (numbers.stream()
                .filter(number -> number % 2 == 0 || number % 3 == 0 || number % 5 == 0)
                .collect(Collectors.toCollection(ArrayList::new)));
    }
}
