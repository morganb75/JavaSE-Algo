package javaRegex;

public class MyRegex {

	private static final String PATTERN=
			"^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$";
	//Pour le valid username regex suivant:
	
//	^: Indique le début de la chaîne.
//	[a-zA-Z]: Correspond à la première lettre, qui doit être une lettre alphabétique en minuscules ou majuscules.
//	[a-zA-Z0-9_]: Correspond à des caractères alphanumériques et au trait de soulignement (_).
//	{7,29}: Spécifie que la longueur du nom d'utilisateur doit être comprise entre 8 et 30 caractères inclus, compte tenu de la première lettre déjà incluse.
//	$: Indique la fin de la chaîne.
//	Ainsi, ce regex garantit que le nom d'utilisateur respecte les conditions suivantes :
//
//	Commence par une lettre alphabétique.
//	Ne contient que des lettres alphabétiques (minuscules ou majuscules), des chiffres et des traits de soulignement après le premier caractère.
//	La longueur totale du nom d'utilisateur est comprise entre 8 et 30 caractères inclus.
	
	//String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$"		
	
	public static String getPattern() {
		return PATTERN;
	}
}
