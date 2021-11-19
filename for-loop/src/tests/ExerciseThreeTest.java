package tests;

import exercises.ExerciseThree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseThreeTest {

    @Test
    void getMinAndMaxTest() {
//        when
        int[] numbers = {5,4,10,0,2};
        int[] emptyNumbers = {};
        int[] oneNumber = {5};

//        given
        int[] numbersMinAndMax = ExerciseThree.getMinAndMax(numbers);
        int[] emptyNumbersMinAndMax = ExerciseThree.getMinAndMax(emptyNumbers);
        int[] oneNumberMinAndMax = ExerciseThree.getMinAndMax(oneNumber);

//        then
        assertArrayEquals(new int[]{0, 10}, numbersMinAndMax);

        assertEquals(0, emptyNumbersMinAndMax.length);

        assertArrayEquals(new int[]{5,5}, oneNumberMinAndMax);
    }
}