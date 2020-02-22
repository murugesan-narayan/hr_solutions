package algorithms.impl.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheGridSearchTest {

    @Test
    void gridSearch11() {
        String[] s = new String[]{
                "123412",
                "561212",
                "123634",
                "781288"};
        String[] p = new String[]{
                "12",
                "34"
        };
        String found = TheGridSearch.gridSearch(s, p);
        assertEquals("YES", found);
    }
    @Test
    void gridSearch() {
        String[] s = new String[]{
                "1234567890",
                "0987654321",
                "1111111111",
                "1111111111",
                "2222222222"};
        String[] p = new String[]{
                "876543",
                "111111",
                "111111"
        };
        String found = TheGridSearch.gridSearch(s, p);
        assertEquals("YES", found);
    }

    @Test
    void gridSearch1() {
        String[] s = new String[]{
                "7283455864",
                "6731158619",
                "8988242643",
                "3830589324",
                "2229505813",
                "5633845374",
                "6473530293",
                "7053106601",
                "0834282956",
                "4607924137"};
        String[] p = new String[]{
                "9505",
                "3845",
                "3530"
        };
        String found = TheGridSearch.gridSearch(s, p);
        assertEquals("YES", found);
    }

    @Test
    void gridSearch2() {
        String[] s = new String[]{
                "400453592126560",
                "114213133098692",
                "474386082879648",
                "522356951189169",
                "887109450487496",
                "252802633388782",
                "502771484966748",
                "075975207693780",
                "511799789562806",
                "404007454272504",
                "549043809916080",
                "962410809534811",
                "445893523733475",
                "768705303214174",
                "650629270887160"};
        String[] p = new String[]{
                "99",
                "99"
        };
        String found = TheGridSearch.gridSearch(s, p);
        assertEquals("NO", found);
    }
}