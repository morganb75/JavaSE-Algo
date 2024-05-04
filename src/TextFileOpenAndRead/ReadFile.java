package TextFileOpenAndRead;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadFile {

	public static void main(String[] args) {

		// Obtenez le chemin du fichier en utilisant le class loader
        ClassLoader classLoader = ReadFile.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("test.txt");
       
        System.out.println(inputStream);
        
        
        if (inputStream == null) {
            System.err.println("Fichier introuvable.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                System.out.println(ligne);
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
    }
	}


