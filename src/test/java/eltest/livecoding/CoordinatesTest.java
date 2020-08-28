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
        Coordinate coordinate2 = new Coordinate(1,1);
        Coordinate coordinate3 = new Coordinate(5,7);
        Coordinate coordinate5 = new Coordinate(1,3);
        Coordinate coordinate6 = new Coordinate(11,12);
        List<Coordinate> list = new ArrayList<>();
        list.add(coordinate1);
        list.add(coordinate2);
        list.add(coordinate3);
        list.add(coordinate5);
        list.add(coordinate6);
        Map<String, Coordinate[]> closestAndLongestCoordinates =
                coordinates.getClosestAndLongestCoordinates(list);
        Coordinate[] minCoordinates = closestAndLongestCoordinates.get("MIN");
        assertNotNull(minCoordinates);
        assertEquals(minCoordinates[0], coordinate1);
        assertEquals(minCoordinates[1], coordinate2);
        Coordinate[] longCoordinates = closestAndLongestCoordinates.get("LONG");
        assertNotNull(longCoordinates);
        assertEquals(longCoordinates[0], coordinate2);
        assertEquals(longCoordinates[1], coordinate6);
    }
}