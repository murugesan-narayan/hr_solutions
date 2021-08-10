package zalando.coding;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaCodingChallengeTest {

    JavaCodingChallenge test = null;
    @BeforeEach
    public void init(){
        test = new JavaCodingChallenge();
    }

    @Test
    public void testChallengeOne(){
        int[] A = new int[]{3, 4, 2, 6, 9};
        int result = test.solution(A);
        assertEquals(6, result);
    }
    @Test
    public void testChallengeOne1(){
        int[] A = new int[]{3, 4, 2, 11, 9};
        int result = test.solution(A);
        assertEquals(9, result);
    }

    @Test
    public void testChallengeOne2(){
        int[] A = new int[]{11, 9, 5, 2, 1};
        int result = test.solution(A);
        assertEquals(9, result);
    }

    @Test
    public void testChallengeOne3(){
        int[] A = new int[]{Integer.MIN_VALUE, 1};
        assertThrows(RuntimeException.class, ()->test.solution(A));
    }


    @Test
    public void testChallengeOne5(){
        int[] A = new int[]{1, 1};
        assertThrows(RuntimeException.class, () -> test.solution(A));
    }

    @Test
    public void testChallengeOne6(){
        int[] A = new int[]{1};
        assertThrows(RuntimeException.class, () -> test.solution(A));
    }

    @Test
    public void testChallengeOne7(){
        int[] A = new int[]{5, 5, 5, 5};
        assertThrows(RuntimeException.class, () -> test.solution(A));
    }


    @Test
    public void testChallengeOne8(){
        int[] A = new int[]{5, 5, 5, 5, 6};
        assertEquals(5, test.solution(A));
    }

    @Test
    public void testChallengeOne9(){
        int[] A = new int[]{5, 5, 5, 5, 3};
        assertEquals(3, test.solution(A));
    }

}