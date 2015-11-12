public class Classex24 {

	public static void main(String[] args) {
		
		int lastNameSize;
		char letter;
		
		String firstName = "Nathnael";
		String lastName = new String("Atsbeha");
		
		lastNameSize = lastName.length();
		
		letter = lastName.charAt(1);
		System.out.println(letter);
		
		String b = "Nate ";
		String c = "Nati";
		String d = b+c;
		
		d = b.concat(c);
		System.out.println(d);
		
		if(!firstName.equals(lastName)){
			System.out.println("Error check the names");
		}
		
		String state1 = "I am Ethiopia!";
		String state2 = "I am Ethiopia!";
		boolean retVal;

	      retVal = state1.equalsIgnoreCase(state2);
	      System.out.println("Value = " + retVal );
		
	      String Str = new String("Welcome to programming 101");
	      System.out.print("Found Index :" );
	      System.out.println(Str.indexOf( "s" ));
	      
	      System.out.print("Found Last Index :" );
	      System.out.println(Str.lastIndexOf( 's' ));
	      
	      String firstname = "NATHNAEL";
	      System.out.println(firstname.toLowerCase());	
	      
	      String firstname2 = "nathnael";
	      System.out.println(firstname.toUpperCase());	
	      
	      String firstname3 = "nathnael";
	      System.out.println("string = " + firstname);
	      String replaceStr = firstname3.replace("p", "d");
	      System.out.println("new string = " + replaceStr);
	      
	      StringBuilder firstname4 = new StringBuilder("nathanel");
	      System.out.println("string = " + firstname4);
	      System.out.println("substring is = " + firstname.substring(5));
	      System.out.println("substring is = " + firstname.substring(1, 6));
	      
	      String firstname5 = new String("catch all");
	      System.out.print("Value :" );
	      System.out.println(firstname.trim() );
	}
}