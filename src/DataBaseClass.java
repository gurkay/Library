
public class DataBaseClass extends Book {

	public DataBaseClass() {
		super();
	}

	// ***************************************************
	// *
	// * GET IS INTEGER
	// *
	// ***************************************************
	public boolean getIsInteger(String str) {
		return (str.lastIndexOf("-") == 0 && !str.equals("-0")) ? str.replace("-", "").matches("[0-9]+")
				: str.matches("[0-9]+");
	}
	
	public void inputValuesEnter(String inputValues) {

		int numPages = 0, pubYear = 0;
		String keyWordOne, keyWordTwo, keyWordThree, keyWordFour, keyWordFive;

		int k1 = inputValues.indexOf(',');
		String bookName = inputValues.substring(0, k1).trim();

		int k2 = inputValues.indexOf(',', k1 + 1);
		String authorName = inputValues.substring(k1 + 1, k2).trim();

		int k3 = inputValues.indexOf(',', k2 + 1);
		String ISBN = inputValues.substring(k2 + 1, k3).trim();

		int k4 = inputValues.indexOf(',', k3 + 1);
		String numPageString = inputValues.substring(k3 + 1, k4).trim();
		if (getIsInteger(numPageString)) {
			numPages = Integer.parseInt(numPageString);
		}

		int k5 = inputValues.indexOf(',', k4 + 1);
		String pubYearString = inputValues.substring(k4 + 1, k5).trim();
		if (getIsInteger(pubYearString)) {
			pubYear = Integer.parseInt(pubYearString);
		}

		int k6 = inputValues.indexOf(',', k5 + 1);
		if (k6 > 0) {
			keyWordOne = inputValues.substring(k5 + 1, k6).trim();
			int k7 = inputValues.indexOf(',', k6 + 1);
			if (k7 > 0) {
				keyWordTwo = inputValues.substring(k6 + 1, k7).trim();
				int k8 = inputValues.indexOf(',', k7 + 1);
				int l8 = inputValues.length() - k7;
				if (k8 > 0) {
					keyWordThree = inputValues.substring(k7 + 1, k8).trim();
					int k9 = inputValues.indexOf(',', k8 + 1);
					int l9 = inputValues.length() - k8;
					if (k9 > 0 || l9 > 0) {
						keyWordFour = inputValues.substring(k8 + 1, k9).trim();
						int k10 = inputValues.indexOf(' ', k9 + 1);
						if (k10 > 0) {
							
							System.out.println("the book’s keywords which are at least 3 words and most 5 words");
							
						} else {
							keyWordFive = inputValues.substring(k9 + 1, inputValues.length()).trim();
							String[] keyWords = { keyWordOne, keyWordTwo, keyWordThree, keyWordFour, keyWordFive };
							DataBaseClass.this.addBook(bookName, authorName, ISBN, numPages, pubYear, keyWords);
						}
					} else {
						keyWordFour = inputValues.substring(k8 + 1, inputValues.length()).trim();
						keyWordFive = "";
						String[] keyWords = { keyWordOne, keyWordTwo, keyWordThree, keyWordFour, keyWordFive };
						DataBaseClass.this.addBook(bookName, authorName, ISBN, numPages, pubYear, keyWords);
					}
				} else {
					if(l8 > 0){
						keyWordThree = inputValues.substring(k7 + 1, inputValues.length()).trim();
						keyWordFour = "";
						keyWordFive = "";
						String[] keyWords = { keyWordOne, keyWordTwo, keyWordThree, keyWordFour, keyWordFive };
						DataBaseClass.this.addBook(bookName, authorName, ISBN, numPages, pubYear, keyWords);
					}else{
						
					System.out.println("the book’s keywords which are at least 3 words and most 5 words");
					}
				}
			} else {
				System.out.println("the book’s keywords which are at least 3 words and most 5 words");
			}
		} else {
			System.out.println("the book’s keywords which are at least 3 words and most 5 words");
		}

	}

}
