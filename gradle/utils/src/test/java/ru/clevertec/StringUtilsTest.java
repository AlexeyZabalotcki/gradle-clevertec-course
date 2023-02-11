package ru.clevertec;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilsTest {
    @Test
    public void givenPositiveNumber_whenIsPositiveNumber_thenReturnTrue() {
        boolean actual = StringUtils.isPositiveNumber("1");
        Assertions.assertTrue(actual);
    }

    @Test
    public void givenNegativeNumber_whenIsPositiveNumber_thenReturnTrue() {
        boolean actual = StringUtils.isPositiveNumber("-1");
        Assertions.assertFalse(actual);
    }

    @Test
    public void givenZero_whenIsPositiveNumber_thenReturnTrue() {
        boolean actual = StringUtils.isPositiveNumber("0");
        Assertions.assertFalse(actual);
    }

    @Test
    public void givenLetters_whenIsPositiveNumber_thenReturnTrue() {
        boolean actual = StringUtils.isPositiveNumber("sfs");
        Assertions.assertFalse(actual);
    }

}