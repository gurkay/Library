//*****************************************************************************
//*
//* ABSTRACT LIBRARY IMPLAMENTS INTERFACE LIBRARY
//*
//*****************************************************************************
abstract class Library implements InterfaceLibrary{
	
	private static int totalNumberOfBooks;
	Book[] books = new Book[] {};
	
	Book(){
		this.totalNumberOfBooks = 0;
	}
	
	//Add new books
	public void addBook(String bookName, String authorName, String ISBN, int numPages, int pubYear, String[] keyWords){
		//if total number of books than more 10 don't add books
		if(returnCurrentNumberOfBooks() < 10){
			setBookName(bookName);
			setAuthorName(authorName);
			setISBN(ISBN);
			setNumPages(numPages);
			setPubYear(pubYear);
			setKeyWords(keyWords);
			
			books = new Book[] { 
			
					new Book(getBookName(), getAuthorName(), getISBN(), getNumPages(), getPubYear(), getKeyWords()), 
								
			};
			System.out.println(returnCurrentNumberOfBooks());
			String s = "";
			
			for (int i = 0; i <  books[returnCurrentNumberOfBooks()].getKeyWords()[i].length(); i++) {
				s += ", " + books[returnCurrentNumberOfBooks()].getKeyWords()[i];
			}
			System.out.println(returnCurrentNumberOfBooks());
			arrayBooksDataBase[returnCurrentNumberOfBooks()][0] = (books[returnCurrentNumberOfBooks()].getBookName() + ", " + 
					books[returnCurrentNumberOfBooks()].getAuthorName() + ", " + books[returnCurrentNumberOfBooks()].getISBN() + ", " + 
					books[returnCurrentNumberOfBooks()].getNumPages() + ", " + books[returnCurrentNumberOfBooks()].getPubYear() + s );
			
			
			setCurrentNumberOfBooks(INCREASE_VALUE);
			
			for (int i = 0; i < returnCurrentNumberOfBooks(); i++) {
				for (int j = 0; j < 6; j++) {
					System.out.println(arrayBooksDataBase[i][j]);
				}
			}
		}
		
	}
	
	// List all of books
	public void allTheBookNames() {
		for (int i = 0; i < returnCurrentNumberOfBooks(); i++) {
			for (int j = 0; j < 6; j++) {
				System.out.println(arrayBooksDataBase[i][j]);
			}
		}
		
/*		for (int i = 0; i < books.length; i++) {
			System.out.print(books[i].getBookName() + ", " + books[i].getAuthorName() + ", " + books[i].getISBN() + ", " + 
					books[i].getNumPages() + ", " + books[i].getPubYear() );
			for (int j = 0; j < books[i].getKeyWords()[j].length(); j++) {
				
				System.out.print(" ," + books[i].getKeyWords()[j]);
				
			}
			System.out.println();
		}
*/		
		System.out.println("Number Of All Books : " + totalNumberOfBooks);
		
	}
	
	public void setCurrentNumberOfBooks(int increaseValue) {
		this.totalNumberOfBooks += increaseValue;
	}
	
	// return current number of books
	public int returnCurrentNumberOfBooks() {
		return totalNumberOfBooks;
	}
	
	// Find bookname amount of books
	public Book[] returnBook(String bookName) {
		
		Book[] findBook = new Book[totalNumberOfBooks];
		int cloumn = 0;
		
		for (int i = 0; i < totalNumberOfBooks; i++) {
			for (int j = 0; j < arrayBooksDataBase.length; j++) {
				if(arrayBooksDataBase[i][cloum].equlsIgnoreCase(bookName)){
					findBook[i] = arrayBooksDataBase[i];
				}
				cloumn++;
				break;
			}
		}
		return findBook;
	}

	//Find amount of Author Name
	public Book[] returnBookByAuthor(String authorName) {
		Book[] findBook = new Book[totalNumberOfBooks];
		int cloumn = 1;
		
		for (int i = 0; i < totalNumberOfBooks; i++) {
			for (int j = 0; j < arrayBooksDataBase.length; j++) {
				if(arrayBooksDataBase[i][cloum].equlsIgnoreCase(authorName)){
					findBook[i] = arrayBooksDataBase[i];
				}
				cloumn++;
				break;
			}
		}
		return findBook;
	}

	//According to key word ofBooks find
	public Book[] returnBookByKeyword(String keyWord) {
		Book[] findBook = new Book[totalNumberOfBooks];
		int cloumn = 5;
		
		for (int i = 0; i < totalNumberOfBooks; i++) {
			
			arrayBooksDataBase[i][cloum]
				
			String keywords = arrayBooksDataBase[i][cloum];
			
			if(keywords[j].equalsIgnoreCase(keyWord)){
				findBook[index] = books[index];
				index++;
				break;
			}
		}
		Book[] findBook = new Book[totalNumberOfBooks];
		int cloumn = 5;
		
		for (int i = 0; i < totalNumberOfBooks; i++) {
			for (int j = 0; j < keywords.length; j++) {
				if(arrayBooksDataBase[i][cloum].equlsIgnoreCase(bookName)){
					findBook[i] = arrayBooksDataBase[i];
				}
				cloumn++;
				break;
			}
		}
		return findBook;
	}

	@Override
	public boolean deleteBook(String ISBN) {
		// TODO Auto-generated method stub
		return false;
	}

}






























