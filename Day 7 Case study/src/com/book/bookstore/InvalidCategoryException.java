package com.book.bookstore;

public class InvalidCategoryException extends Exception {
	public InvalidCategoryException() {
	}

	public InvalidCategoryException(String s) {
		super(s);
	}
}