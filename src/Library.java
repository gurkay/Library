//*****************************************************************************
//*
//* ABSTRACT LIBRARY IMPLAMENTS INTERFACE LIBRARY
//*
//*****************************************************************************
abstract class Library implements InterfaceLibrary{
	
	private static int totalNumberOfBooks;
	Book[] books = new Book[] {};
	
	Library(){
		
	}
	
	public void addBook(String bookName, String authorName, String ISBN, int numPages, int pubYear, String[] keyWords){
		
		if(totalNumberOfBooks < 10){
			setBookName(bookName);
			setAuthorName(authorName);
			setISBN(ISBN);
			setNumPages(numPages);
			setPubYear(pubYear);
			setKeyWords(keyWords);
			
			books = new Book[] { 
			
					new Book(getBookName(), getAuthorName(), getISBN(), getNumPages(), getPubYear(), getKeyWords()), 
								
			};
			
			String s = "";
			
			for (int i = 0; i <  books[totalNumberOfBooks].getKeyWords()[i].length(); i++) {
				s += ", " + books[totalNumberOfBooks].getKeyWords()[i];
			}
			
			arrayBooksDataBase[totalNumberOfBooks] = (books[totalNumberOfBooks].getBookName() + ", " + books[totalNumberOfBooks].getAuthorName() + ", " + books[totalNumberOfBooks].getISBN() + ", " + 
					books[totalNumberOfBooks].getNumPages() + ", " + books[totalNumberOfBooks].getPubYear() + s );
			
			totalNumberOfBooks++;
			
			for (int i = 0; i < totalNumberOfBooks; i++) {
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






























