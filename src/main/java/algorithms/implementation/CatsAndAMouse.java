package algorithms.implementation;

public class CatsAndAMouse {
    static String catAndMouse(int x, int y, int z) {
        int absA = Math.abs(z - x);
        int absB = Math.abs(z - y);
        if (absA < absB)
            return "Cat A";
        else if (absA > absB)
            return "Cat B";
        else
            return "Mouse C";
    }
}
