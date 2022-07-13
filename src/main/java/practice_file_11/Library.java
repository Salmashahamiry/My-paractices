package practice_file_11;

public class Library {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		BOOK book1 = new BOOK();// AN OBJECT AND constructor automatically run
		book1.bookTitle = "secret";
		book1.bookAutor = "kelly Remer";
		book1.bookNumber = 10;
		book1.bookLend = 0;

		BOOK book2 = new BOOK("RAZ", "SALMAN", 10, 6);

		System.out.println(book2.toString());

		// array of BOOK

		// BOOK[] bookArray = new BOOK[20];
		/*
		 * for(int i=0;i<20;i++) bookArray[i].bookTitle=GetFromDatabase()
		 */

		// test my class BOOK and call our methods
		book1.Loan();
		System.out.println(book1.bookLend);

		book1.Return();
		System.out.println(book1.bookLend);

		book2.toString();
		book1.Loan();
		System.out.println(book1.bookLend);
		book1.setBookTitle("secret1");
		// bookArray[0].setBookTitle("NAME1");
		book1.toString();
	}

}
