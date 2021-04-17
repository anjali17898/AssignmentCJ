package com.bookutil.test;

import com.book.model.Book;
import com.book.model.BookStore;

public class BookUtil {

	public static void main(String[] args) {
		// Instantiate Book class
		BookStore bookStore1 = new BookStore();
		// store some book.
		bookStore1.addBook(new Book("B101", "Java", "Bala", "Technology", 599.0f));
		bookStore1.addBook(new Book("B102", "Physics", "Maity", "Science", 745.0f));
		bookStore1.addBook(new Book("B101", "Math", "DKroy", "Friction", 699.0f));
		// bookStore1.addBook(new Book("B103", "Math", "DKroy", "Fiction", 699.0f));

		// search book by title
		bookStore1.searchByTitle("Java");
		System.out.println();

		System.out.println();
		bookStore1.searchByAuthor("Maity");
		System.out.println();
		bookStore1.display();

	}
}