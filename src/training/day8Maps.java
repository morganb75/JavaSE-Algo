package training;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class day8Maps {
	public static void main(String[] args) {
		Map<String, Integer> phoneNumber = new HashMap<String, Integer>();

		Scanner scan = new Scanner(System.in);
		//System.out.println("entrer n");
		int n = scan.nextInt();
		scan.nextLine();
		// lecture des entrees "nom 012345678" et split en noms et n° de Tel inserer
		// dans la Map
		for (int i = 0; i <= n - 1; i++) {
			
			//System.out.println("entrer nom et tel personne n°" + i);
			String s = scan.nextLine();
			// System.out.println(s);
			String[] parts = s.split(" ");
			if (parts.length == 2) {
				String nom = parts[0];
				int numero = Integer.parseInt(parts[1]);
				phoneNumber.put(nom, numero);
				//System.out.println("succes sauvegarde");
			} else {
				System.out.println("La conversion a echoué!");
			}
		}

		// lecture de t entrees par clé
		for (int j = 0; j <= n - 1; j++) {
			String name = scan.next();
			if (phoneNumber.containsKey(name)) {
				int number = phoneNumber.get(name);
				System.out.println(name + "=" + number);
			} else {
				System.out.println("Not found");
			}
		}
		scan.close();
	}
}
