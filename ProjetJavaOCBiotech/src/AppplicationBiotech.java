import java.util.ArrayList;

public class AppplicationBiotech {

	public static void main(String[] args) throws Exception {
	    
		// Lecture du fichier et retourne la liste des symptomes
		
		ReadSymptomDataFromFile rd = new ReadSymptomDataFromFile();
		rd.GetListSymptome("symptomes.txt");
		System.out.println(rd.GetListSymptome("symptomes.txt"));
		
	
		// Retourne la liste des symptomes avec occurences (dans l'ordre alphab�tique)		
				 SymptomeListOccurence oc = new SymptomeListOccurence();
				 oc.countFrequencies((ArrayList<String>)rd.GetListSymptome("symptomes.txt"));
	   
		// G�n�ration d'un nouveau fichier text avec la liste des symptomes avec occurence (dans l'ordre alphab�tique)	 
				 
				 ReadSymptomDataFromFile spt = new SyptomeFile();				 
				 spt.GetListSymptome("symptomes.txt");
				 
				 SyptomeFile spt1 = new SyptomeFile();				 
				 spt1.FileSyptome((ArrayList<String>) spt.GetListSymptome("symptomes.txt"));
				 
}
}	