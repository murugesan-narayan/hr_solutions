package datastructures.trie;

public class Trie {
    private TrieNode root;
    Trie(TrieNode root) {this.root = root;}

    void insert(String word) {
        TrieNode currentNode = root;
        for (Character c: word.toCharArray()) {
            currentNode = currentNode.getChildren().computeIfAbsent(c, k -> new TrieNode());
            currentNode.incrementSize();
        }
        currentNode.setEndOfWord(true);
    }

    int findByPrefix(String prefix) {
        TrieNode currentNode = root;
        for (Character c: prefix.toCharArray()) {
            currentNode = currentNode.getChildren().get(c);
            if (currentNode == null) return 0;
        }
        return currentNode.getSize();
    }

}
