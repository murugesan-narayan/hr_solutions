package datastructures.trie;

import java.util.ArrayList;
import java.util.List;

public class Contacts {
    static int[] contacts(String[][] queries) {
        Trie trie = new Trie(new TrieNode());
        List<Integer> counts = new ArrayList<>();
        for (String[] query: queries) {
            String type = query[0];
            String word = query[1];
            if (type.equals("add")) {
                trie.insert(word);
            }
            if (type.equals("find")) {
                int count = trie.findByPrefix(word);
                counts.add(count);
            }
        }
        return counts.stream().mapToInt(i->i).toArray();
    }
}
