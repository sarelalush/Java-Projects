import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Capitals {
	private Map<String, String> map; 
	
	public Capitals() throws FileNotFoundException {
		  map = new HashMap<>();
		  File myObj = new File("capitals.txt");
		  Scanner myReader = new Scanner(myObj).useDelimiter( "[;\n]" );
		  int rec = 0;
	      while (myReader.hasNext()) {
	        String country = myReader.next();
	        String city = myReader.next();
	        map.put(country, city);
	        rec+=1;
	      }
	      myReader.close();
	     System.out.printf("%d records read.\n",rec);
	}
	
	public String exactMatch(String country) {
		if (this.map.containsKey(country)) {
			return (this.map.get(country));
		}
		return null;
	}
	

	
	public String[] prefixMatch (String prefix) {
		ArrayList<String> match = new ArrayList<>();
		for (String city : this.map.keySet()) 
		{ 
			int length = prefix.length();
			if (length > city.length())
				continue;
		    if(city.substring(0,length).toLowerCase().equals(prefix.substring(0,length).toLowerCase())) {
		    	match.add(city);
		    }
		    
		}

		return match.toArray(new String[match.size()]);
		
	}
	 


}



