package algorithms.strings;

public class StringConstruction {
    static int stringConstruction(String s) {
        return (int) s.chars().distinct().count();
    }
}
