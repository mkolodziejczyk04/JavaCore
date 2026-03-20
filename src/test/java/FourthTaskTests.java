import org.example.FourthTask;
import org.junit.jupiter.api.Test;


import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;

public class FourthTaskTests {

    FourthTask fourthTask = new FourthTask();

    @Test
    void isHavingNineElements() {
        List<Integer> list = fourthTask.convertIntoSingleList();
        int expectedResult = 9;
        assertThat(list).hasSize(expectedResult)
                .containsExactly(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }

    @Test
    void isOneDimensionArray(){
        String[] result = fourthTask.convertIntoOneDimensionArray();
        int expectedResult = 8;
        assertThat(result).hasSize(expectedResult).containsExactly("a", "b", "c", "d", "e", "f", "g", "h");
    }

    @Test
    void howManyTimesElementsOccursOnTheMap(){
        Map<Integer, Long> map = fourthTask.getMapOfNumbers();
        int expectedSize = 7;
        assertThat(map)
                .containsEntry(1,2L)
                .containsEntry(3,3L)
                .containsEntry(2,1L)
                .hasSize(expectedSize);
    }
}
