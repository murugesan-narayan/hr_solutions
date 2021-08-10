package zalando.coding;

import java.util.Collections;
import java.util.List;

public class AddObjImpl implements AddObject {
    private List<Integer> numbers = Collections.emptyList();
    @Override
    public void addValue(int value) {
        numbers.add(value);
    }

    @Override
    public double getAverage() {
        return numbers.stream().mapToDouble(d -> d).average().orElse(0.0);
    }
}
