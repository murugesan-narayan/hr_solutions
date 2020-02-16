package algorithms.strings;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Gemstones {
    static int gemstones(String[] arr) {
        Set<Character> set = new HashSet<>();
        for (String s : arr)
            set.addAll(s.chars().mapToObj(a->(char)a).collect(Collectors.toSet()));
        int gems = 0;
        char_itr:
        for (Character c : set) {
            for (String str : arr)
                if (str.indexOf(c) == -1) continue char_itr;
            gems++;
        }
        return gems;
    }
}
