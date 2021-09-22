package zalando.coding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddObjImplTest {

    @Test
    void getAverage() {
        AddObject addObj = new AddObjImpl();
        addObj.addValue(5);
        addObj.addValue(7);
        addObj.addValue(6);
        addObj.addValue(2);
        addObj.addValue(0);
        assertEquals(20/5D, addObj.getAverage());
    }
}