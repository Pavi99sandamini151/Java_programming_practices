package first_project.pavicoding;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld {

	public static void main(String[] args) throws IOException {
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter A string to reverse: ");
	    String str = reader.readLine();
	    String nstr = "";
	    System.out.println("You have Entered: ");
	    System.out.println(str);
	    System.out.println("The length of the string is: " + str.length());
	    char ch;
	    for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); //extracts each character
	        nstr= ch+nstr; //adds each character in front of the existing string
	      }
	    System.out.println(nstr);
	}
}
