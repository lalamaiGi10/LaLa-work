package chap16.ex2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Book book1 = new Book("ゲド戦記", "アーシュラ・K・ル=グウィン");
		Book book2 = new Book("ナルニア国物語", "CSルイス");
		Book book3 = new Book("不思議の国のアリス", "ルイスキャロル");

		ArrayList<Book> bookList = new ArrayList<>();
//		new ArrayList<>()の<>はjava8から<Book>と書かなくてよくなった。
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);

		for (Book b : bookList) {
			System.out.println(b.getTitle() + ":" + b.getAuthor());
		}
	}

}