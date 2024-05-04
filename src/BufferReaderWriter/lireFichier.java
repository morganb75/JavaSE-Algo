package BufferReaderWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class lireFichier {

	public static void main(String[] args) {
		
		//chemin du fichier adresse relative
		//String pathFile = "test.txt";
		String pathFile = "source/BufferReaderWriter/test.txt";
		File fichier = new File(pathFile);
		if (fichier.exists()) {
			System.out.println("fichier trouvé!");
		} else {
			System.out.println("Fichier introuvable!");
		}
		
		//URL ressource = lireFichier.class.getResource("test.txt");
		List<Integer> listeInt = new ArrayList<Integer>();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(pathFile))){
			String ligne = reader.readLine();
			if (ligne!=null) {
				String[] tokens = ligne.split(" ");
				for (String token:tokens) {
					listeInt.add(Integer.parseInt(token));
				}
			}
		} catch (FileNotFoundException e) {
			System.err.println("FICHIER INTROUVABLE!");
//			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Liste des entiers lus: " + listeInt);
		
	}

}