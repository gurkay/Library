//*****************************************************************************
//*
//* ABSTRACT LIBRARY IMPLAMENTS INTERFACE LIBRARY
//*
//*****************************************************************************
abstract class Library implements InterfaceLibrary{
	
	private static int totalNumberOfBooks = 0;
	Book[] books = new Book[] {};

	public void addBook(String bookName, String authorName, String ISBN, int numPages, int pubYear, String[] keyWords){
		
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
			arrayBooksDataBase[returnCurrentNumberOfBooks()] = (books[returnCurrentNumberOfBooks()].getBookName() + ", " + 
					books[returnCurrentNumberOfBooks()].getAuthorName() + ", " + books[returnCurrentNumberOfBooks()].getISBN() + ", " + 
					books[returnCurrentNumberOfBooks()].getNumPages() + ", " + books[returnCurrentNumberOfBooks()].getPubYear() + s );
			
			totalNumberOfBooks++;
			
			for (int i = 0; i < returnCurrentNumberOfBooks(); i++) {
				System.out.println(arrayBooksDataBase[i]);
			}
		}
		
	}
	
	@Override
	public void allTheBookNames() {
	
		for (int i = 0; i < books.length; i++) {
			System.out.print(books[i].getBookName() + ", " + books[i].getAuthorName() + ", " + books[i].getISBN() + ", " + 
					books[i].getNumPages() + ", " + books[i].getPubYear() );
			for (int j = 0; j < books[i].getKeyWords()[j].length(); j++) {
				
				System.out.print(" ," + books[i].getKeyWords()[j]);
				
			}
			System.out.println();
		}
		
		System.out.println("Number Of All Books : " + totalNumberOfBooks);
		
	}
	
	@Override
	public int returnCurrentNumberOfBooks() {
		// TODO Auto-generated method stub
		return totalNumberOfBooks;
	}
	
	@Override
	public Book[] returnBook(String bookName) {
		
		Book[] findBook = new Book[totalNumberOfBooks];
		int index = 0;
		
		for (int i = 0; i < books.length; i++) {
			String[] keywords = books[i].getKeyWords();
			
			for (int j = 0; j < keywords.length; j++) {
				if(keywords[j].equalsIgnoreCase(bookName)){
					findBook[index] = books[index];
					index++;
					break;
				}
			}
		}
		
		return findBook;
	}

	@Override
	public Book[] returnBookByAuthor(String authorName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book[] returnBookByKeyword(String keyWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteBook(String ISBN) {
		// TODO Auto-generated method stub
		return false;
	}

}






























