package basics;

public class Weather {
	public static void main (String[] args){
		//This program will suggest what to wear based on the weather
		int temperature = 42;
		String sunCondition = "Overcast";
		if(temperature > 80){
			System.out.println("It's pleasant, wear shorts and a t-shirt");
		}else if ((temperature > 60) && (sunCondition == "Sunny")){
			System.out.println("It's a little cooler, Perhaps wear a long sleeve shirt");
			System.out.println("Wear a hat because it is sunny!");
		}else if((temperature > 50) || (sunCondition == "Overcast")){
			System.out.println("It's a cool day, wear warmer clothes.");
		}else{
			System.out.println("It's cold. Bring a sweater");
		}
		System.out.println("The program is ending");
	}
}
