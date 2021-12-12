package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberSequence {

    List<Integer> integers = new ArrayList<>();

    public NumberSequence(List<Integer> integers) {
        this.integers = integers;
    }

    public NumberSequence(int number1, int number2, int number3) {
        Random random = new Random();
        for (int i = 0; i < number1; i++) {
            int number = random.nextInt(number2, number3);
            integers.add(number);
        }
    }

    public List<Integer> closeToAverage(int value) {

        List<Integer> results = new ArrayList<>();
        int sum = 0;
        int average = 0;
        for (Integer i : integers) {
            sum += i;
        }
        average = sum / integers.size();

        for (Integer i : integers) {
            if (i >= (average - value) && i < average || i <= (average + value) && i > average) {
                results.add(i);
            }
        }

        return results;
    }

    public List<Integer> getIntegers() {
        return integers;
    }
}
