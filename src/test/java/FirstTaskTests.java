import org.example.FirstTask;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class FirstTaskTests {
    FirstTask firstTask = new FirstTask();
    private static final int expectedSize = 20;
    private List<Integer> randomNumbers = firstTask.getRandomNumbers();

    @Test
    public void havingTwentyElements() {
        int sizeOfList = randomNumbers.size();
        assertThat(sizeOfList).as("Size should be twenty").isEqualTo(expectedSize);
    }

    @Test
    public void onlyEvenNumbers() {
        List<Integer> evenNumbers = firstTask.getEvenNumbers(randomNumbers);
        assertThat(evenNumbers).allMatch(s -> s % 2 == 0, "Number should be even");
    }
}
