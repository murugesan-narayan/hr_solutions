package zalando.coding;

public class AddObjImpl implements AddObject {
    private double total = 0.0;
    private double avg = 0.0;
    private int length = 0;
    @Override
    public void addValue(int value) {
        total += value;
        avg = total / ++length;
        System.out.println(avg);
    }

    @Override
    public double getAverage() {
        return avg;
    }
}
