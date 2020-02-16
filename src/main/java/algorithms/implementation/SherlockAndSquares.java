package algorithms.implementation;


public class SherlockAndSquares {
    static int squares(int a, int b) {
        double count = (Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1);
        return (int) count;
    }
}
