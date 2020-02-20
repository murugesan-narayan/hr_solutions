package algorithms.impl.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiggerIsGreaterTest {

    @Test
    void biggerIsGreater() {
        String greater1 = BiggerIsGreater.biggerIsGreater("ab");
        assertEquals("ba", greater1);
        String greater2 = BiggerIsGreater.biggerIsGreater("bb");
        assertEquals("no answer", greater2);
        String greater3 = BiggerIsGreater.biggerIsGreater("hefg");
        assertEquals("hegf", greater3);
        String greater4 = BiggerIsGreater.biggerIsGreater("dhck");
        assertEquals("dhkc", greater4);
        String greater5 = BiggerIsGreater.biggerIsGreater("dkhc");
        assertEquals("hcdk", greater5);
    }

    @Test
    void biggerIsGreater1() {
        String greater1 = BiggerIsGreater.biggerIsGreater("lmno");
        assertEquals("lmon", greater1);
        String greater2 = BiggerIsGreater.biggerIsGreater("dcba");
        assertEquals("no answer", greater2);
        String greater3 = BiggerIsGreater.biggerIsGreater("dcbb");
        assertEquals("no answer", greater3);
        String greater4 = BiggerIsGreater.biggerIsGreater("abdc");
        assertEquals("acbd", greater4);
        String greater5 = BiggerIsGreater.biggerIsGreater("abcd");
        assertEquals("abdc", greater5);
        String greater6 = BiggerIsGreater.biggerIsGreater("fedcbabcd");
        assertEquals("fedcbabdc", greater6);
    }

    @Test
    void biggerIsGreater2() {
        String greater1 = BiggerIsGreater.biggerIsGreater("jprfovzkdlmdcesdcpdchcwoedjchcovklhrhlzfeeptoewcqpxg");
        assertEquals("jprfovzkdlmdcesdcpdchcwoedjchcovklhrhlzfeeptoewcqxgp", greater1);
    }

}