import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SyptomeFile extends ReadSymptomDataFromFile {
	
	/** 
		The first method takes a string as parameter and returns a list

		The second method creates a text file that includes all the occurrences of the list in alphabetical order
	
	**/
	
	ArrayList<String> list;

	public SyptomeFile(String filepath,ArrayList<String> list) {
		super(filepath);
		this.list = list;
	}

	
	public SyptomeFile() {

	}

	@Override
	public List<String> GetListSymptome(String filepath) {
		return super.GetListSymptome(filepath);
	}
	

	public void FileSyptome (ArrayList<String> list) { 
		
		try
	    {			
	      //File name with path
	      String fileName = "results.out.txt";
	 
	      File myFile = new File(fileName);
	      FileOutputStream fos = new FileOutputStream(myFile);
	      OutputStreamWriter osw = new OutputStreamWriter(fos);    
	      Writer writer = new BufferedWriter(osw); 
	      
	     
	      //Write data from an ArrayList
	      Collections.sort(list);
	        Set<String> st = new TreeSet<String>(list);
	        
	      for (String s : st) {
	        writer.write(s + "= " +Collections.frequency(list, s) +"\n" );	        	     
	      }
	      writer.close();
	    } 
	    catch (IOException e){
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }	
	}	

}
