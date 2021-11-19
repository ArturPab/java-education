package tests;

import exercises.ExerciseOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseOneTest {

    @Test
    void printNumbersTest() {
        ExerciseOne.printNumbers(10);
    }
}