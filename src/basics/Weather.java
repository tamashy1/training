package basics;

public class Weather {
	
	public static void main (String[] args) {
		// Give suggestion on what to wear based on suggestions
		
		int temperature = 45;
		String sunCondition = "Overcast";
		if (temperature > 80) {
			System.out.println("It is pleasant. Wear shorts and t-shirt");
		}
		else if ((temperature > 60) && (sunCondition == "Sunny")) {
			System.out.println("It's a little cooler, Wear long sleeve shirt and jeans");
			System.out.println("Wear a hat to keep sun out");
		}
		else if ((temperature > 50) || (sunCondition == "Overcast")){
			System.out.println("This is a cool day, wear warmer clothes");
		}
		else {
			System.out.println("Looks like a cold day. Bring a sweater");
					
		}
		
		System.out.println("The program is ending");
		
	}
}
