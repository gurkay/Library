// *****************************************************************************
// *
// * INTERFACE LIBRARY
// *
// *****************************************************************************
interface InterfaceLibrary{
	// ***************************************************
	// *
	// * LIBRARY METHODS
	// *
	// ***************************************************	
	final int MAX_KEYWORDS = 5;
	final int INCREASE_VALUE = 1;
	
	void addBook(String bookName, String authorName, String ISBN, int numPages, int pubYear, String[] keyWords);
	Book[] returnBook(String bookName);
	Book[] returnBookByAuthor(String authorName);
	Book[] returnBookByKeyword(String keyWord);
	boolean deleteBook(String ISBN);
	int returnCurrentNumberOfBooks();
	void setCurrentNumberOfBooks(int increaseValue);
	void allTheBookNames();
	
	
	// ***************************************************
	// *
	// * BOOK METHODS
	// *
	// ***************************************************		
	void displayBook();

	void setBookName(String bookName);
	void setAuthorName(String authorName);
	void setISBN(String ISBN);
	void setNumPages(int numPages);
	void setPubYear(int pubYear);
	void setKeyWords(String[] keyWords);
	
	String getBookName();
	String getAuthorName();
	String getISBN();
	int getNumPages();
	int getPubYear();
	String[] getKeyWords();
	
	boolean searchKeyWord(String aWord);
	
	// ***************************************************
	// *
	// * DATA BASE CLASS METHODS
	// *
	// ***************************************************	
	String[] arrayBooksDataBase = new String[6];
	boolean getIsInteger(String str);
	void inputValuesEnter(String inputValues);


}
