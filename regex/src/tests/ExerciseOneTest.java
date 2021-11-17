package tests;

import exercises.ExerciseOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseOneTest {

    @Test
    void getSumTest() {
//        when
        String stringAsNumbers = "43  12";
//        given
        int sum = ExerciseOne.getSum(stringAsNumbers);
//        then
        assertEquals(55, sum);
        assertNotEquals(44, sum);
    }
}