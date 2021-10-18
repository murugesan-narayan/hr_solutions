package sabre.coding;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SabreCodingChallengeTest {

    @Test
    public void test() {
        SabreCodingChallenge test = new SabreCodingChallenge();
        List<List<Integer>> input= List.of( List.of(4, 8, 6), List.of(7), List.of(7, 8, 6) );
        Integer result = test.sumOfFirstEvenMoreThan5ValueFromEachList(input);
        assertEquals(16, result
        );
    }

    @Test
    public void test_stream() {
        SabreCodingChallenge test = new SabreCodingChallenge();
        List<List<Integer>> input= List.of( List.of(4, 8, 6), List.of(7), List.of(7, 8, 6) );
        Integer result = test.stream_sumOfFirstEvenMoreThan5ValueFromEachList(input);
        assertEquals(16, result);
    }

}
