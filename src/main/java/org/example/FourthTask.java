package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FourthTask {
    private final List<Integer> list1 = Arrays.asList(1, 2, 3);
    private final List<Integer> list2 = Arrays.asList(4, 5, 6);
    private final List<Integer> list3 = Arrays.asList(7, 8, 9);
    private final String[][] dataArray = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}};
    private final ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7));
    private final ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7));

    public List<Integer> convertIntoSingleList() {
        return Stream.of(list1, list2, list3)
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    public String[] convertIntoOneDimensionArray() {
        return Stream.of(dataArray)
                .flatMap(Arrays::stream)
                .toArray(String[]::new);
    }

    public ArrayList<Integer> removeDuplicates() {
        return numbersList.stream()
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public Map<Integer, Long> getMapOfNumbers() {
        return numbers.stream()
                .collect(Collectors.groupingBy(
                        n -> n,
                        Collectors.counting()
                ));
    }
}
