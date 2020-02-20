package algorithms.impl.medium;

import java.util.Arrays;

public class Encryption {
    static String encryption(String s) {
        s= s.replaceAll(" ", "");
        double sqrt = Math.sqrt(s.length());
        int rows = (int) Math.floor(sqrt);
        int cols = (int) Math.ceil(sqrt);
        if (rows * cols < s.length())
            rows++;
        char[][] chars = new char[rows][cols];
        int start = 0;
        for (int i = 0; i < rows; i++) {
            int end = start + cols;
            if (end > s.length())
                end = s.length();
            char[] sub = s.substring(start, end).toCharArray();
            if (sub.length < cols)
                sub = Arrays.copyOf(sub, cols);
            chars[i] = sub;
            start = end;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cols; i++) {
            char[] cr = new char[rows];
            for (int j = 0; j < rows; j++) {
                cr[j] = chars[j][i];
            }
            for (char c: cr)
                if (c != 0) sb.append(c);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
