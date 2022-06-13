import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadSymptomDataFromFile {
	
/** The method allows to read a file. 
	It takes in parameter a string
	The method returns an unordered list without taking into account the duplicates.
**/	
	private String filepath;
	
	public ReadSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}

	public ReadSymptomDataFromFile() {	
	}

	public List<String> GetListSymptome(String filepath){	 
		ArrayList<String> result = new ArrayList<String>();
		String s;	
			try {
				File f = new File(filepath);
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr); 
						
				while((s=br.readLine())!=null){		
				result.add(s);
				}			
				br.close();
			
			} catch (IOException e) {
				e.printStackTrace();
			}
			return result;					
	}
}