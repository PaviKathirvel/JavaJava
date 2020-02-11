import java.util.Hashtable;
import java.util.Enumeration;
import java.util.*;

public class HashTable{
	public static void main(String args[]){
	    
		Scanner scan = new Scanner(System.in); //prompts the user for input
		
		Hashtable<String,String> person_1 = new Hashtable<String,String>();	//hashtable A
		
		List<String> keys_array = new ArrayList<String>();	//arraylist to store key fields
		
		System.out.println("How many fields do u need to store?"); 
		int numberOfFields = scan.nextInt();	//asks for number of fields to store
		
		System.out.println("Enter the fields please......"); //prompts the user for key details
		for(int i = 0; i < numberOfFields; i++){
			String field = scan.next();
			keys_array.add(field);
		}
		
		//prompts the user for values
		for(int i=0;i<numberOfFields;i++){
			String field = keys_array.get(i);
			System.out.println("Value for "+field);
			String value = scan.next();
			person_1.put(keys_array.get(i),value);
		}
		
		
		int choice = 0;
		System.out.println("Do you want to store the details in another hashtable? yes(1)/no(2)");			//asks for the user to have another hashtables
	    choice = scan.nextInt();  //stores the user's choice
		do{
			  
		//asks the user for values to store in another hashtable
		if(choice == 1){
			Hashtable<String,String> person_two = new Hashtable<String,String>(); //hashtable B
			//prompts the user to provide value fields
		    for(int i=0;i<numberOfFields;i++){
			    String field = keys_array.get(i);	//stores the key from list array
			    System.out.println("Value for "+field);
			    String value = scan.next();			//stores the value provided by user
			    person_two.put(keys_array.get(i),value);	//stores both the key and value in hashtable
	    	}
	    	System.out.println();
	    	
	    	//checks for the equality of both the tables
	    	if(person_1.equals(person_two)){
		        System.out.println("All the values are equal for both the tables");
		    }
		    
		    //if both the tables are not equal,checks for values compatability
		    else{
		        Hashtable<String,List<String>> result_table = new Hashtable<String,List<String>>();   //new hashtable to store the values
		        
		        //checks for the values equality for each key field
		        for(int i = 0; i < numberOfFields; i++){
		            String field = keys_array.get(i);	//stores the key from list array
		            if((person_1.get(field)).equals(person_two.get(field))){
		                System.out.println("Values are equal for "+field+" Huraahh..^_^");
		                System.out.println();
		            }
		            else{
		                System.out.println("Oops...values differ for the field "+field+".They are "+person_1.get(field)+" , "+person_two.get(field));
		                result_table.put(field,Arrays.asList(new String[]{person_1.get(field).toString(),person_two.get(field).toString()}));
						System.out.println();
		            }
		        }
		    }
	    }
		
		//executes when user hits no for another hashtable for the very first time
	    else{
	        System.out.println("Bye");
	        break;
			}
			
			System.out.println("Do you want to store the details in another hashtable? yes(1)/no(2)");			//asks for the user to have another hashtable
	        choice = scan.nextInt();
		}while(choice == 1);
		
	    
	}
}
