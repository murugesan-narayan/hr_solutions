package eltest.livecoding;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Coordinates {

    public Map<String, Coordinate[]> getClosestAndLongestCoordinates(List<Coordinate> coordinates) {
        double minDistance = Double.MAX_VALUE;
        double longDistance = Double.MIN_VALUE;
        Coordinate[] minCoordinates = new Coordinate[2];
        Coordinate[] longCoordinates = new Coordinate[2];
        for (int i=0; i<coordinates.size()-1; i++) {
            for (int j=i+1; j<=coordinates.size()-1; j++) {
                System.out.println("i = " + i);
                System.out.println("j = " + j);
                Coordinate coordinate1 = coordinates.get(i);
                Coordinate coordinate2 = coordinates.get(j);
                double distance = Math.sqrt(
                        Math.pow((coordinate2.getX() - coordinate1.getX()),2) +
                        Math.pow((coordinate2.getY() - coordinate1.getY()),2)
                );
                if (distance < minDistance) {
                    minCoordinates[0] = coordinate1;
                    minCoordinates[1] = coordinate2;
                    minDistance = distance;
                }
                if (distance > longDistance) {
                    longCoordinates[0] = coordinate1;
                    longCoordinates[1] = coordinate2;
                    longDistance = distance;
                }
            }
        }
        Map<String, Coordinate[]> result = new HashMap<>();
        result.put("MIN", minCoordinates);
        result.put("LONG", longCoordinates);
        return result;
    }

}
