package eltest.livecoding;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Coordinates {

    public Map<String, Coordinate[]> getClosestAndLongestCoordinates(List<Coordinate> coordinates) {
        double minDistance = Double.MAX_VALUE;
        double longDistance = Double.MIN_VALUE;
        Coordinate[] minCoordinates = new Coordinate[2];
        Coordinate[] longCoordinates = new Coordinate[2];
        for (Coordinate coordinate1: coordinates) {
            for (Coordinate coordinate2: coordinates) {
                double distance = Math.sqrt(
                        Math.pow((coordinate2.getX() - coordinate1.getX()),2) +
                        Math.pow((coordinate2.getY() - coordinate1.getY()),2)
                );
                if (minDistance > distance) {
                    minCoordinates[0] = coordinate1;
                    minCoordinates[1] = coordinate2;
                }
                if (distance > longDistance) {
                    longCoordinates[0] = coordinate1;
                    longCoordinates[1] = coordinate2;
                }
            }
        }
        Map<String, Coordinate[]> result = new HashMap<>();
        result.put("MIN", minCoordinates);
        result.put("LONG", longCoordinates);
        return result;
    }

}
