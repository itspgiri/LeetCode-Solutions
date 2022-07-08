class Trie {
    Node root;

    class Node {
        private char value;
        private boolean isWord;
        private Node[] children;

        public Node(char val) {
            this.value = val;
            this.isWord = false;
            this.children = new Node[26];
        }
    }

    public Trie() {
        root = new Node('\0');
    }

    public void insert(String word) {
        Node curr = root;
        for (char x : word.toCharArray()){ //We go one by one through every character of the word
            if (curr.children[x-'a'] == null){ //We see if the character already exists or not
                curr.children[x-'a'] = new Node (x); // if it didn't exist we create it
            }
            curr = curr.children[x-'a']; // We update the current with the new location of the current character
        }
        curr.isWord = true; //After going through all the characters we are marking the end of the word.
    }

    public boolean search(String word) {
        Node curr = root; 
        for (char x : word.toCharArray()){
            if(curr.children[x - 'a'] == null) //If the character is not present return false right
                return false;
            curr = curr.children[x - 'a'];
        }//We check character by character again
        return curr.isWord; // After we find all characters we see if the last spot is having an ending marking
    }
    

    public boolean startsWith(String word) {
        Node curr = root;
        for (char x: word.toCharArray()){
            if (curr.children[x-'a'] == null)
                return false;
            curr = curr.children[x-'a'];
        }
        return true; //In this case we don't see if the last one is ending or not
    }
}
/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
