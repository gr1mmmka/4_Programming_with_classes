package by.khmara.epam.mod04.task11;

import java.util.ArrayList;

public class Text {

	private Word title;
	private ArrayList<Sentence> text;

	Text(Word title, ArrayList<Sentence> text) {

		this.title = title;
		this.text = text;
	}

	Text(Word title) {

		this.title = title;
	}

	Text(Word title, Sentence sentence) {

		this.title = title;
		this.text = new ArrayList<Sentence>();
		this.text.add(sentence);
	}

	void addText(Sentence sentence) {

		this.text.add(sentence);
	}

	void printText(Text text) {

		for (Sentence s : this.text) {
			System.out.print(s);
		}

		System.out.println("");
	}

	void printTitle(Word title) {

		System.out.println("Title is: " + this.title);
	}

	public Word getTitle() {
		return title;
	}

	public void setTitle(Word title) {
		this.title = title;
	}

}
