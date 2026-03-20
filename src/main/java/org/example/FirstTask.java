package org.example;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstTask {
    private Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
    private Random random = new Random();

    public void displayNumbers() {
        stream.forEach(System.out::println);
    }

    public List<Integer> getRandomNumbers() {
        return Stream.generate(() -> random.nextInt(100) + 1)
                .limit(20)
                .collect(Collectors.toList());
    }

    public List<Integer> getEvenNumbers(List<Integer> randomNumbers) {
        return randomNumbers.stream()
                .filter(s -> s % 2 == 0)
                .collect(Collectors.toList());
    }
}
