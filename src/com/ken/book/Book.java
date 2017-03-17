package com.ken.book;

public class Book {

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname
				+ ", author=" + author + ", price=" + price + "]";
	}

	String bookid,bookname,author,price;

	public String getBookid() {
		return bookid;
	}

	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
}
