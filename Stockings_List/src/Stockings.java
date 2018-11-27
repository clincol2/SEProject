import java.util.ArrayList;
import java.util.Collections;

public class Stockings {
	

	public static void main(String[] args) 
    { 
        ArrayList<String>  mylist = new ArrayList<String>(); 
        mylist.add("Steven"); 
        mylist.add("Robin"); 
        mylist.add("Chelsea"); 
        mylist.add("Chloe"); 
        mylist.add("Chris"); 
        mylist.add("Nolan"); 
  
        System.out.println("Original List : \n" + mylist); 
  
        Collections.shuffle(mylist); 
  
        System.out.println("\nShuffled List : \n" + mylist); 
    } 
} 
	
	
		
		
	



	
