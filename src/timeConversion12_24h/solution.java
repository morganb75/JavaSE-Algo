package timeConversion12_24h;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class solution {

	public static String timeConversion(String s) {
		//DateTimeFormatter pour le format 12h
		DateTimeFormatter format12h = DateTimeFormatter.ofPattern("hh:mm:ssa");
		//parsing de l'heure
		LocalTime heure24h = LocalTime.parse(s,format12h);
		//Passage au format 24h
		DateTimeFormatter format24h = DateTimeFormatter.ofPattern("HH:mm:ss");
		String s24h = heure24h.format(format24h);
		System.out.println("format 12h: "+ s);
		System.out.println("format 24h: "+ s24h);
		
		return s24h;
	}
	
	public static void main(String[] args) {
		String s = "07:05:45PM";
		timeConversion(s);
	}
}
