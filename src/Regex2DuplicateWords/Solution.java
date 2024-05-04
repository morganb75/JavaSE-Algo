package Regex2DuplicateWords;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String input = in.nextLine();
            String regex = "\\b(\\w+)\\b(\\s+\\1\\b)+";
            Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(input);
            
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            System.out.println(input);
        }
        in.close();

	}

}
/*
 * Pour résoudre ce défi, suivez ces trois étapes :

Écrire une expression régulière qui correspond à n'importe quel mot répété.

Une expression régulière possible pour matcher un mot répété est : \b(\w+)\b(\s+\1\b)+. Explications :
\b: Correspond à une frontière de mot.
(\w+): Correspond à un mot (une séquence de caractères alphanumériques).
(\s+\1\b)+: Correspond à une ou plusieurs occurrences du même mot, séparées par des espaces.
Compléter le deuxième argument de la méthode compile pour que l'expression régulière compilée soit insensible à la casse.

Utilisez le drapeau Pattern.CASE_INSENSITIVE lors de la compilation. Vous pouvez le faire en utilisant Pattern.compile(regEx, Pattern.CASE_INSENSITIVE).
Écrire les deux arguments nécessaires pour replaceAll de manière à remplacer chaque mot répété par la toute première occurrence du mot trouvée dans la phrase.

Les arguments sont : replaceFirst("$1"). Cela signifie que chaque mot répété sera remplacé par sa première occurrence, et le $1 fait référence au premier groupe capturé par l'expression régulière.

*
*
*Explications :

La boucle while (m.find()) parcourt toutes les occurrences de mots répétés.
m.group(1) représente le premier groupe capturé (le mot) et m.group() représente l'ensemble du motif correspondant.
input.replaceAll(m.group(), m.group(1)) remplace chaque occurrence du mot répété par sa première occurrence dans la phrase.
*/
