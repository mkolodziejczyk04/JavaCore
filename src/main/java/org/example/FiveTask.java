package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FiveTask {
    private Map<String, List<String>> people = new HashMap<>();

    public FiveTask() {
        people.put("John", Arrays.asList("555-1123", "s", "555-3389", "a"));
        people.put("Mary", Arrays.asList("555-2243", "z", "555-5264"));
        people.put("Steve", Arrays.asList("555-6654", "555-3242", "d"));
    }

    public List<String> getLettersFromMap() {
        return people.values()
                .stream()
                .flatMap(List::stream)
                .filter(s -> s.matches("[a-zA-Z]+"))
                .sorted()
                .collect(Collectors.toList());
    }
}
