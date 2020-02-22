package algorithms.impl.medium;

import java.util.Arrays;

public class OrganizingContainersOfBalls {
    static String organizingContainers(int[][] container) {
        // Capacity of each container
        int[] capacity = new int[container.length];

        // Amount of each ball type
        int[] balls = new int[container.length];

        // Find capacity of each container and number of each ball type
        for(int i = 0; i < container.length; i++) {
            for(int j = 0; j < container[i].length; j++) {
                capacity[i] += container[i][j];
                balls[j]    += container[i][j];
            }
        }

        // Sort each of the arrays
        Arrays.sort(capacity);
        Arrays.sort(balls);

        // Holds the result
        String result = "Possible";

        // Compare each ith index of arrays
        for(int i = 0; i < capacity.length; i++) {
            if(capacity[i] != balls[i]) {
                result = "Impossible";
                break;
            }
        }
        return result;
    }
}
