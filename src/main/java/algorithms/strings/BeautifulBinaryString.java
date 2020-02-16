package algorithms.strings;

public class BeautifulBinaryString {
    public static void main(String[] args) {
        String s = "0101010";
        //StringBuilder sb = new StringBuilder(s);
        int c = 0;
        while (s.indexOf("010") >= 0) {
            s = s.replaceFirst("010", "011");
            c++;
        }
        System.out.println("c = " + c);
    }
}
