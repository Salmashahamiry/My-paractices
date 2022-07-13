package practice_file_11;

public class BOOK {

	// Properties
	String bookTitle;
	String bookAutor;
	int bookNumber;
	int bookLend;

	// constructors
	// Default constructor
	BOOK() {
		bookTitle = "";
		bookAutor = "";
		bookNumber = 0;
		bookLend = 0;
	}

//parameters constructor
	BOOK(String bookTitle, String bookAutor, int bookNumber, int bookLend) {

		this.bookTitle = bookTitle;
		this.bookAutor = bookAutor;
		this.bookNumber = bookNumber;
		this.bookLend = bookLend;
	}

//getter and setter
	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAutor() {
		return bookAutor;
	}

	public void setBookAutor(String bookAutor) {
		this.bookAutor = bookAutor;
	}

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	public int getBookLend() {
		return bookLend;
	}

	public void setBookLend(int bookLend) {
		this.bookLend = bookLend;
	}

	// method1
	boolean Loan() {
		if (bookLend < bookNumber) {
			bookLend += 1;
			return true;
		} else
			return false;

	}

   //method2	
	boolean Return() {
		if (bookLend > 0) {
			bookLend -= 1;
			return true;
		} else
			return false;
	}

	// method3
	@Override
	public String  toString() {
		return "Book name: " + bookTitle+",Book Author: " + bookAutor+",numbers of book that are exist :" + bookNumber +",numbers of book that are lend: " + bookLend;
		
	}

}
