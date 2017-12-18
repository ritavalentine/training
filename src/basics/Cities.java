package basics;

public class Cities {
	public static void main (String[] args){
		String[] cities = {"Los Angeles", "New York", "San Fransisco", "Austin"};
		System.out.println(cities[0]);
		String[] countries;
		countries = new String[2];
		countries[0] = "usa";
		countries[1] = "canada";
		System.out.println(countries[1]);
		System.out.println("********************************************************");
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "New York";
		states[2] = "ohio";
		states[3] = "Utah";
		states[4] = "Texas";
		
		int i = 0;
		do{
			System.out.println("STATE: " + states[i]);
			i++;
		}while(i<states.length);
		
		int n=0;
		while(n<states.length){
			System.out.println("STATE at " + n + ": " + states[n]);
			n++;
		}
		boolean stateFound = false;
		int j = 0;
		while(!stateFound){
			String state = states[j];
			System.out.println(state);
			if(state == "Utah"){
				System.out.println("STATE FOUND!");
				stateFound = true;
			}
			j++;
		}
		System.out.println("\nPRINTING WITH FOR\n");
		for(int x = 0; x<states.length;x++){
			System.out.println(states[x]);
		}
		
	}
}
