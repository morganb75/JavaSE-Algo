package training;

public class Person {
private int age;	

   //constructeur
	public Person(int initialAge) {
  		if (initialAge <=0) {
  			age = 0;
  			System.out.println("Age is not valid, setting age to 0.");
  		} else {
  			age = initialAge;
	}
	}
	//methode 
	public void amIOld() {
		if (age < 13) {
            System.out.println("You are young.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
	}
	//methode
	public void yearPasses() {
  		age++;
	}

	public static void main(String[] args) {
		Person person = new Person(12); // Create a Person object with an initial age of 12
        person.amIOld();
        person.yearPasses();
        person.amIOld();
	}
}
