package javaSingletonPattern;

public class Singleton {

	// La seule instance de la classe
	private static Singleton instance;
	private String str = "Hello, I am a singleton!";

	// Constructeur privé pour empêcher l'instanciation directe hors de la classe
	private Singleton() {
		// initialisation de la classe

	}

	// Méthode pour obtenir l'unique instanciation de la classe
	public static Singleton getSingleInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	// Méthodes de l'instance
	public void sayHello(String input) {
		System.out.println(str + " Let me say " + input + " to you");
	}
}
