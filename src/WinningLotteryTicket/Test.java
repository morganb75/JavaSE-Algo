package WinningLotteryTicket;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {
        String input = "012abc012x398fgre5gregre6earg7yz";
        //String regex = ".*0.*1.*2.*3.*4.*5.*6.*7.*8.*9.*";
        String regex = "(?=.*0)(?=.*1)(?=.*2)(?=.*3)(?=.*4)(?=.*5)(?=.*6)(?=.*7)(?=.*8)(?=.*9).*";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("La chaîne contient tous les chiffres de 0 à 9.");
        } else {
            System.out.println("La chaîne ne contient pas tous les chiffres de 0 à 9.");
        }
    }
}
