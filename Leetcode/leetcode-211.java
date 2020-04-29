class TrieNode {
    private TrieNode[] links;
    private final int SIZE = 26;
    private boolean isEnd;

    public TrieNode() {
        links = new TrieNode[SIZE];
    }

    public int getSIZE() {
        return SIZE;
    }

    public boolean containsKey(char ch) {
        return links[ch - 'a'] != null;
    }

    public boolean containsKey(int i) {
        return links[i] != null;
    }

    public TrieNode get(char ch) {
        return links[ch - 'a'];
    }

    public TrieNode get(int i) {
        return links[i];
    }

    public void put(char ch, TrieNode node) {
        links[ch - 'a'] = node;
    }

    public void setEnd() {
        isEnd = true;
    }

    public boolean isEnd() {
        return isEnd;
    }
}

class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public TrieNode getRoot() {
        return root;
    }

    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (!node.containsKey(currentChar)) {
                node.put(currentChar, new TrieNode());
            }
            node = node.get(currentChar);
        }
        node.setEnd();
    }

    private TrieNode searchPrefix(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (node.containsKey(currentChar)) {
                node = node.get(currentChar);
            } else {
                return null;
            }
        }
        return node;
    }

    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return node != null && node.isEnd();
    }

    public boolean startsWith(String prefix) {
        TrieNode node = searchPrefix(prefix);
        return node != null;
    }
}

public class WordDictionary {
    private Trie trie;

    public WordDictionary() {
        trie = new Trie();
    }

    public void addWord(String word) {
        trie.insert(word);
    }

    public boolean search(String word) {
        return match(word.toCharArray(), 0, trie.getRoot());
    }

    private boolean match(char[] chs, int k, TrieNode node) {
        if (k == chs.length) {
            return node.isEnd();
        }
        char currentChar = chs[k];

        if (currentChar == '.') {
            for (int i = 0; i < node.getSIZE(); i++) {
                if (node.containsKey(i) && match(chs, k + 1, node.get(i))) {
                    return true;
                }
            }
        } else {
            return node.containsKey(currentChar) && match(chs, k + 1, node.get(currentChar));
        }

        return false;
    }
}
