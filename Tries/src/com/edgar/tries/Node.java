package com.edgar.tries;

import java.util.HashMap;

public class Node {
	//Attributes
	public HashMap<Character, Node> children;
	public boolean isCompleteWord;
	
	//Constructor
	public Node() {
		this.children = new HashMap<Character, Node>();
		this.isCompleteWord = false;
	}
	
}
