
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String wordChoice ="Harry";
		String bookTitle ="Harry Potter";
		if (bookTitle.contains(wordChoice))
		{
			System.out.println(bookTitle + " has " + wordChoice);
		}
		
		String firstname ="ramesh";
		String ssn="123451234";
		System.out.println(firstname + ssn.substring(5));
		System.out.println(firstname.length());
		System.out.println(firstname.toUpperCase());	
	}

}
