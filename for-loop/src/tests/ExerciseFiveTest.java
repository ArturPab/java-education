package tests;

import exercises.ExerciseFive;
import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseFiveTest {

    @Test
    void getSortedNumbersFromFileTest() throws IOException {

//        when
        String fileName = "src/files/numbers.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write("5\n1\n0\n10\n5\n8\n");

        writer.close();

//        given
        int[] numbers = ExerciseFive.getSortedNumbersFromFile(fileName);

//        then
        assertArrayEquals(new int[]{0,1,5,5,8,10}, numbers);
    }

    @Test
    void getSortedNumbersFromFileTest2() throws IOException {

//        when
        String fileName = "src/files/numbers.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write("5\n1\n0\n10\n5\n8\nfdfd");

        writer.close();

//        given
        int[] numbers = ExerciseFive.getSortedNumbersFromFile(fileName);

//        then
        assertEquals(new int[0].length, numbers.length);
    }
}