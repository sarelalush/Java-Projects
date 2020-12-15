import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab06Test {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Capitals c = new Capitals();
		Scanner myReader = new Scanner(System.in);
		String word = " ";

	    
		while(!word.equals("end")) {
			for(String var : c.prefixMatch(word))
			{
				if(word.toLowerCase().equals(var.toLowerCase()))
				{
					word = var;
					break;
				}
			}
			if(c.exactMatch(word) != null)
				System.out.printf("The capital of %s is %s\n\n",word ,c.exactMatch(word));
			System.out.printf("Enter a country name (\"end\" to exit):");
			word = myReader.nextLine();
		}
		
	System.out.println("Good bye!");
	myReader.close();
	}

}



