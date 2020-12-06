package by.khmara.epam.mod04.task11;

/*
 * Создать объект класса Текст, используя классы Предложение, Слово.
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */

public class Run {

	public static void main(String[] args) {
		
		Word title = new Word("Biography");

		Sentence sentence = new Sentence("Hello, my name is Anton. ");
		Sentence sentence2 = new Sentence("I fond of programming.");

		Text text = new Text(title, sentence);

		text.addText(sentence2);

		text.printText(text);
		
		text.printTitle(title);

	}

}
