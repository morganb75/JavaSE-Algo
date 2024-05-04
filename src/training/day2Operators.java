package training;

public class day2Operators {

	class Result {
				
		public static void solve(double meal_cost, int tip_percent, int tax_percent) {
		    double total_cost = meal_cost*(1+((double)tip_percent+(double)tax_percent)/100);
		    System.out.println(Math.round(total_cost));
		    }
	}
	
		public static void main(String[] args) {
			Result.solve(12, 20, 8);
		}
	}
	


