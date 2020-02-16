package algorithms.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class DesignerPDFViewer {
    static int designerPdfViewer(int[] h, String word) {
        int max = 0;
        Map<Character, Integer> indexMap = new HashMap<>();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        IntStream.rangeClosed(0, 25).forEach(a->indexMap.put(alpha.charAt(a), a));
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            max = Math.max(max, h[indexMap.get(c)]);
        }
        return max * word.length();
    }

}
