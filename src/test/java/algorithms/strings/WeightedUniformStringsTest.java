package algorithms.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeightedUniformStringsTest {

    @Test
    void weightedUniformStrings() {
        String s = "abccddde";
        int[] totalWeights = new int[]{1,3,12,5,9,10};
        String[] result = WeightedUniformStrings.weightedUniformStrings(s, totalWeights);
        assertArrayEquals(new String[] {"Yes","Yes","Yes","Yes","No","No"}, result);
    }

    @Test
    void weightedUniformStrings1() {
        String s = "aaabbbbcccddd";
        int[] totalWeights = new int[]{9,7,8,12,5};
        String[] result = WeightedUniformStrings.weightedUniformStrings(s, totalWeights);
        assertArrayEquals(new String[] {"Yes","No","Yes","Yes","No"}, result);
    }
}