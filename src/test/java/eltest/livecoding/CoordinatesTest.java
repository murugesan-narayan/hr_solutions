package eltest.livecoding;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CoordinatesTest {

    @Test
    void getClosestAndLongestCoordinates() {
        Coordinates coordinates = new Coordinates();
        Coordinate coordinate1 = new Coordinate(1,2);
        Coordinate coordinate2 = new Coordinate(1,3);
        Coordinate coordinate3 = new Coordinate(5,7);
        Coordinate coordinate5 = new Coordinate(2,8);
        Coordinate coordinate6 = new Coordinate(7,1);
        Coordinate coordinate7 = new Coordinate(6,8);
        List<Coordinate> list = new ArrayList<>();
        list.add(coordinate1);
        list.add(coordinate2);
        list.add(coordinate3);
        list.add(coordinate5);
        list.add(coordinate6);
        list.add(coordinate7);
        Map<String, Coordinate[]> closestAndLongestCoordinates = coordinates.getClosestAndLongestCoordinates(list);
        Coordinate[] minCoordinates = closestAndLongestCoordinates.get("MIN");
        //assertEquals();
        Coordinate[] longCoordinates = closestAndLongestCoordinates.get("LONG");
    }
}