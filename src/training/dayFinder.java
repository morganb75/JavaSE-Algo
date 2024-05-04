package training;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class dayFinder {

	public static String findDay(int month,int day,int year) {
		//date recherchée
		LocalDate date = LocalDate.of(year,month,day);
		//obtention du jour de la semaine objet dayofweek
		DayOfWeek searchDay = date.getDayOfWeek();
		//obtention du nom du jour de la semaine
		String dayName = searchDay.getDisplayName(TextStyle.FULL, Locale.ENGLISH).toUpperCase();
		return dayName;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrer date au format MM DD YYYY :");
		String s = scan.nextLine();
		String[] parts = s.split(" ");
		int month = Integer.parseInt(parts[0]);
		int day = Integer.parseInt(parts[1]);
		int year = Integer.parseInt(parts[2]);
		String res = dayFinder.findDay(month,day,year);
		System.out.println(res);
	}
}
