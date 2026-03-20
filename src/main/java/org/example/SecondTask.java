package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondTask {
    private List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

    public List<Integer> getNumbers() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            list.add(i);
        }
        return list;
    }

    public Integer[] getEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(s -> s % 2 == 0)
                .toArray(Integer[]::new);
    }

    public List<String> getNamesStartingWithC() {
        return myList.stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public void displayListOfNumbers(List<String> randomNumbers) {
        randomNumbers.forEach(System.out::println);
    }


}
