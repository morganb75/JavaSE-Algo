package day26BooksAndDates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static int returnBook(LocalDate dateDue, LocalDate dateRetour) {
//		LocalDate dateDueTomorrow = dateDue.plusDays(1);
		int fine = 0;
		int dayDue = dateDue.getDayOfMonth();
		int dayRetour = dateRetour.getDayOfMonth();
		int monthDue = dateDue.getMonthValue();
		int monthRetour = dateRetour.getMonthValue();
		int yearDue = dateDue.getYear();
		int yearRetour = dateRetour.getYear();
		
		List<Integer> liste = new ArrayList<Integer>();
		liste.add(dayDue - dayRetour);
		liste.add(monthDue - monthRetour);
		liste.add(yearDue - yearRetour);
		System.out.println(liste);

		if (liste.get(2)>0) {
			return fine;
		} else {

			if (liste.get(2) < 0) {
				fine = 10000;
				return fine;
			} else if (liste.get(1) < 0) {
				fine = -500 * liste.get(1);
				return fine;
			} else if (liste.get(0) < 0) {
				fine = -15 * liste.get(0);
				return fine;
			}
			return fine;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String dataRetour = scan.nextLine();
		String dataDue = scan.nextLine();
		scan.close();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d M y");
		LocalDate dateDue = LocalDate.parse(dataDue, formatter);
		LocalDate dateRetour = LocalDate.parse(dataRetour, formatter);
		System.out.println("DueDate: " + dateDue);
		System.out.println("Date Retour: " + dateRetour);
		System.out.println(returnBook(dateDue, dateRetour));
//		System.out.println(dateDue.format(formatter));

	}
}
