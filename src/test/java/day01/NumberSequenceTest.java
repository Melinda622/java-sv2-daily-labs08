package day01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberSequenceTest {

    @Test
    void testNumber() {
        List<Integer> integers = Arrays.asList(1, 7, 7, 1, 5, 2, 2, 5, 4, 2);
        NumberSequence numberSequence = new NumberSequence(integers);
        assertEquals(integers, numberSequence.getIntegers());

    }

    @Test
    void testNumber2() {
        List<Integer> integers = Arrays.asList(1, 7, 7, 1, 5, 2, 2, 5, 4, 2);
        NumberSequence numberSequence = new NumberSequence(integers);
        List<Integer> result = Arrays.asList(1, 1, 5, 2, 2, 5, 4, 2);
        assertEquals(result, numberSequence.closeToAverage(2));
    }


}