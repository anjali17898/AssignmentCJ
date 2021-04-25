package com.book.bookstore;

public class WrongPriceException extends Exception {
	public WrongPriceException() {
	}

	public WrongPriceException(String s) {
		super(s);
	}
}
