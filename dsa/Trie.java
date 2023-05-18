package dsa;

import java.util.*;
class TrieNode {
TrieNode[] children = new TrieNode[26];
boolean isEndOfWord;

TrieNode() {
	Arrays.fill(children, null);
	isEndOfWord = false;
}
}

public class Trie {
static final int s= 6;

static TrieNode getNode() {
	return new TrieNode();
}

static void insert(TrieNode root, String key) {
	TrieNode node = root;

	for (int i = 0; i < key.length(); i++) {
	int index = key.charAt(i) - 'a';
	if (node.children[index] == null)
		node.children[index] = new TrieNode();
	node = node.children[index];
	}
	node.isEndOfWord = true;
}

static boolean search(TrieNode root) {
	for (int i = 0; i < s; i++) {
	if (root.children[i] == null)
		return false;
	}
	return true;
}

public static void main(String[] args) {
	String[] keys = { "hi", "ok",
					"apple", "ball", "cat", "dog"};
	int n = keys.length;

	TrieNode root = new TrieNode();
	for (int i = 0; i < n; i++)
	insert(root, keys[i]);

	if (search(root))
	System.out.println("Yes");
	else
	System.out.println("No");
}
}
