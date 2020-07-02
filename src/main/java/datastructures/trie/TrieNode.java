package datastructures.trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    private final Map<Character, TrieNode> children = new HashMap<>();
    //private boolean isEndOfWord;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public void incrementSize() {
        this.size++;
    }

    public Map<Character, TrieNode> getChildren() {
        return children;
    }

    /*public boolean isEndOfWord() {
        return isEndOfWord;
    }*/

    /*public void setEndOfWord(boolean endOfWord) {
        isEndOfWord = endOfWord;
    }*/
}
