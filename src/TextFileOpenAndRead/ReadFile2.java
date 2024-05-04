package TextFileOpenAndRead;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class ReadFile2 {

	public static void main(String[] args) {
		// Chargez le fichier en utilisant une URL relative à la classe
        URL resource = ReadFile2.class.getResource("test.txt");
     

        if (resource == null) {
            System.err.println("Fichier introuvable.");
            return;
        }
        
        // Imprimez le chemin du fichier pour le test
        System.out.println("Chemin du fichier : " + resource.getPath());
        
        
        try (InputStream inputStream = resource.openStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

            String ligne;
            while ((ligne = reader.readLine()) != null) {
                System.out.println(ligne);
            }

        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }

	}

}
