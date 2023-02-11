package ru.clevertec;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        int number = NumberUtils.toInt(str);

        if (number > 0) {
            return true;
        } else if (number < 0) {
            return false;
        } else {
            return false;
        }
    }
}
