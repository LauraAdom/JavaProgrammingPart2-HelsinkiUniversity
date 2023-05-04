package Part10.Exercise3;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {

    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream()
                .filter(numb -> numb > 0)
                .collect(Collectors.toList());
    }
}
