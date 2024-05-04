package day12inheritance;

public class Student extends Person {
	private int[] testScores;

	// Constructeur
	public Student(String firstName, String lastName, int identification, int[] testScores) {
		super(firstName, lastName, identification);
		this.testScores = testScores;
	}

	public int[] getTestScores() {
		return testScores;
	}

	public void setTestScores(int[] testScores) {
		this.testScores = testScores;
	}

	public char calculate(int[] testScores) {
		int totalScore = 0, moyenne = 0;
		char grade = 'T';
		for (int i = 0; i <= testScores.length - 1; i++) {
			totalScore = totalScore+testScores[i];
		}
		moyenne = totalScore / testScores.length;
		if (moyenne >= 90) {
			grade = 'O';
		} else if (moyenne >= 80) {
			grade = 'E';
		} else if (moyenne >= 70) {
			grade = 'A';
		} else if (moyenne >= 55) {
			grade = 'P';
		} else if (moyenne >= 40) {
			grade = 'D';
		}

		return grade;

	}

}
