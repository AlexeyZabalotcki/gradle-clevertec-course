package ru.clevertec;

import java.util.Arrays;
import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(String... values) {
        List<String> numbers = Arrays.asList(values);
        return numbers.stream().allMatch(StringUtils::isPositiveNumber);
    }
}
