package Lec52;

import java.util.HashMap;

public class Trie {
	public class Node {
		char ch;
		HashMap<Character, Node> chlid = new HashMap<>();
		boolean isterminal = false;

	}

	private Node root;

	public Trie() {
		// TODO Auto-generated constructor stub
		Node nn = new Node();
		nn.ch = '*';
		this.root = nn;
	}

	public void insert(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.chlid.containsKey(ch)) {
				curr = curr.chlid.get(ch);
			} else {
				Node nn = new Node();
				nn.ch = ch;
				curr.chlid.put(ch, nn);
				curr = nn;
			}

		}
		curr.isterminal = true;

	}

	public boolean search(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.chlid.containsKey(ch)) {
				curr = curr.chlid.get(ch);
			} else {
				return false;
			}

		}
		return curr.isterminal;

	}

	public boolean startsWith(String prefix) {

		Node curr = root;
		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			if (curr.chlid.containsKey(ch)) {
				curr = curr.chlid.get(ch);
			} else {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie t = new Trie();
		t.insert("raj");
		t.insert("rahul");
		t.insert("apple");
		t.insert("komal");
		t.insert("puneet");
		t.insert("ankit");
		t.insert("amisha");
		System.out.println(t.search("ankit"));
		System.out.println(t.search("app"));
		System.out.println(t.startsWith("app"));

	}

}
