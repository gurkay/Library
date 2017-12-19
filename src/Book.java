//*****************************************************************************
//*
//* ABSTRACT BOOK EXTENDS LIBRARY
//*
//*****************************************************************************
class Book extends Library {

	private int numPages;
	private int pubYear;
	private String bookName;
	private String authorName;
	private String ISBN;
	private String[] keyWords;

	Book() {
		super();
		this.numPages = 0;
		this.pubYear = 0;
		this.bookName = null;
		this.authorName = null;
		this.ISBN = null;
		this.keyWords = new String[MAX_KEYWORDS];
	}

	public Book(String bookName, String authorName, String ISBN, int numPages, int pubYear, String[] keyWords) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.ISBN = ISBN;
		this.numPages = numPages;
		this.pubYear = pubYear;
		this.keyWords = keyWords;
	}


	public void displayBook() {

		

	}
	

	public boolean searchKeyWord(String aWord) {
		return false;
	}
	
	//*****************************************************************************
	//*
	//* SET BOOK
	//*
	//*****************************************************************************
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	public void setPubYear(int pubYear) {
		this.pubYear = pubYear;

	}

	public void setKeyWords(String[] keyWords) {
		this.keyWords = keyWords;

	}
	
	//*****************************************************************************
	//*
	//* GET BOOK
	//*
	//*****************************************************************************
	public String getBookName() {
		return bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public String getISBN() {
		return ISBN;
	}

	public int getNumPages() {
		return numPages;
	}

	public int getPubYear() {
		return pubYear;
	}

	public String[] getKeyWords() {
		return keyWords;
	}

	@Override
	public boolean getIsInteger(String str) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void inputValuesEnter(String inputValues) {
		// TODO Auto-generated method stub
		
	}




}