package VirtusaTestingCoreJava;
import java.util.*;
public class CoreJava {

public static void main(String[] args) {
	String text;
      int count;
      char ch;
      Scanner SC=new Scanner(System.in);    
	      System.out.println("Write something here...: ");
	  text = SC.nextLine();
	  text = text.toUpperCase(); 
	  count = 0;
	  System.out.println("Following characters are used in the input text:");
	  for ( ch = 'A'; ch <= 'Z'; ch++ ) {
	  int i;  
	  for ( i = 0; i < text.length(); i++ ) {
		  if ( ch == text.charAt(i) ) {
			  System.out.print(ch + " ");
    	  		count++;
    	  		break;
	          }
	      }
	  }
	  System.out.println("\nTotal number of different characters are: " + count);

	}

}
