package pl.sda.numbers;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Numbers {

    // "12345" -> [1]
    // "9" -> [9], '9' (char) -> 9 (int)
    // "abcD98" -> [9]
    // "ABFG45CDH789" -> [4]
    // "ABC" -> []
    // "" -> []
    // null -> []
    OptionalInt findFirstDigit(String value) {
        if (value == null) {
            return OptionalInt.empty();
        }

        IntStream charsStream = value.chars();
        return charsStream // ('A', 'B', 'F', 'G, '4', '5', 'C', 'D', 'H', '7', '8', '9')
                .filter(Character::isDigit) // sprawdzamy czy cyfra // ('4', '5', '7', '8', '9')
                .map(character -> Character.getNumericValue(character)) // konwertujemy na int // (4, 5, 7, 8, 9)
                .findFirst(); // zwracamy pierwszy element w postaci "pudełka" // [4]
    }
}
