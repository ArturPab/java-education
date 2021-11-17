package tests;

import exercises.ExerciseThree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseThreeTest {

    @Test
    void isFormatOfDateCorrectTest() {
//        when
        String firstDate = "2000-1-1";
        String secondDate = "2000-01-01";
//        given
        boolean isDateFormatCorrect = ExerciseThree.isFormatOfDateCorrect(firstDate);
        boolean isSecondDateFormatCorrect = ExerciseThree.isFormatOfDateCorrect(secondDate);
//        then
        assertFalse(isDateFormatCorrect);
        assertTrue(isSecondDateFormatCorrect);
    }
}