package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ACMICPCTeamTest {

    @Test
    void acmTeam() {
        int[] result = ACMICPCTeam.acmTeam(
                new String[]{
                        "10101",
                        "11100",
                        "11010",
                        "00101"
                }
        );
        assertArrayEquals(new int[]{5,2}, result);
    }
}