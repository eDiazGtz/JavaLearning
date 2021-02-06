package com.edgar.tries;

import java.util.Set;

public class TrieTest {

	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.insertWord("car");
		trie.insertWord("card");
		trie.insertWord("chip");
		trie.insertWord("trie");
		trie.insertWord("try");
		trie.root.children.get('c').children.keySet();
		
		Set<Character> rKeys = trie.root.children.keySet();
		for(Character key : rKeys) {
			System.out.println(key);
		}

		Set<Character> cKeys = trie.root.children.get('c').children.keySet();;
		for(Character key : cKeys) {
			System.out.println(key);
		}
	}
}
