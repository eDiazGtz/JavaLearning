package com.edgar.tries;

public class Trie {

	//Attributes
	public Node root;
	
	//Constructor
	public Trie() {
		this.root = new Node();
	}
	
	//Methods
	public void insertWord(String word) {
		//Gets the Root Node
		Node currentNode = this.root;
		
		//Iterates over every Char in the word
		for(int i = 0; i < word.length(); i++) {
			//currentLetter is just the char or letter at the iteration
			Character currentLetter = word.charAt(i);
			//Ask of the current letter is in the map of the current node
			Node child = currentNode.children.get(currentLetter);

			//if empty
			if(child == null) {
				//create new node
				child = new Node();
				//put value of letter in new node
				currentNode.children.put(currentLetter, child);
			}
			currentNode = child;
		}
		currentNode.isCompleteWord = true;
	}
	
}
