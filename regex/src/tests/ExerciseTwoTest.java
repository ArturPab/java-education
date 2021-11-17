package tests;

import exercises.ExerciseTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseTwoTest {

    @Test
    void getWordAmountTest() {
//        when
        String string = "    test test1    test2     ";
//        given
        int wordAmount = ExerciseTwo.getWordAmount(string);
//        then
        assertEquals(3, wordAmount);
    }
}