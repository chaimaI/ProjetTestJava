import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SymptomeListOccurence implements ISymptomeListOccurence{
	
/**
 The method takes into account in parameter a list
 It allows to count all the occurrences and to sort the data of the list by alphabetical order
 **/
	
private ArrayList<String> list;
	
	public SymptomeListOccurence(ArrayList<String> list) {
	this.list = list;
}

	public SymptomeListOccurence() {
	}

	public void countFrequencies(ArrayList<String> list)
    {
		try {
			Collections.sort(list);
	        Set<String> st = new TreeSet<String>(list);
	         
	        for (String s : st)        	
	            System.out.println(s + "= " + Collections.frequency(list, s)); 
		} catch(Exception e) {
			e.printStackTrace();
		}
		
  
    }
}
