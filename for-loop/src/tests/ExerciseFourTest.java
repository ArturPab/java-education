package tests;

import exercises.ExerciseFour;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseFourTest {

    @Test
    void getSortedNumbersTest() {

//        given
        int[] unsortedNumbers = {5,8,1,0,2};

//        when
        int[] sortedNumbers = ExerciseFour.getSortedNumbers(unsortedNumbers);

//        then
        assertArrayEquals(new int[]{0,1,2,5,8}, sortedNumbers);
    }

}