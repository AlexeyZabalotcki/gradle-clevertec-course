package ru.clevertec;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UtilsTest {

    @Test
    public void givenPositiveNumbers_whenIsAllPositiveNumbers_thenReturnTrue() {
        boolean actual = Utils.isAllPositiveNumbers("1", "2", "3");
        Assertions.assertTrue(actual);
    }

    @Test
    public void givenSomeNegativeNumbers_whenIsAllPositiveNumbers_thenReturnTrue() {
        boolean actual = Utils.isAllPositiveNumbers("1", "-2", "-3");
        Assertions.assertFalse(actual);
    }

    @Test
    public void givenFirstNegativeNumberAndRestPositive_whenIsAllPositiveNumbers_thenReturnTrue() {
        boolean actual = Utils.isAllPositiveNumbers("-1", "2", "3");
        Assertions.assertFalse(actual);
    }

    @Test
    public void givenOneLetterAmongNumbers_whenIsAllPositiveNumbers_thenReturnTrue() {
        boolean actual = Utils.isAllPositiveNumbers("1", "2", "a");
        Assertions.assertFalse(actual);
    }

    @Test
    public void givenOneCharacterAmongNumbers_whenIsAllPositiveNumbers_thenReturnTrue() {
        boolean actual = Utils.isAllPositiveNumbers("1", "-", "3");
        Assertions.assertFalse(actual);
    }

    @Test
    public void givenEmptyStringAmongNumbers_whenIsAllPositiveNumbers_thenReturnTrue() {
        boolean actual = Utils.isAllPositiveNumbers("1", " ", "3");
        Assertions.assertFalse(actual);
    }
}