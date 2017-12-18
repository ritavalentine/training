package basics;

public class Stats {
	public static void main(String[] args){
		int[] data = {10,2,0,5,33};
		System.out.println(average(data));
		System.out.println(min(data));
		System.out.println(max(data));
	}
	public static double average(int[] data){
		double sum = 0;
		double average;
		for(int i =0;i<data.length;i++){
			sum += data[i];
		}
		average = sum/data.length;
		return average;
	}
	
	public static int min(int[] data){
		int min = data[0];
		for(int i =1;i<data.length;i++){
			if(data[i] < min){
				min = data[i];
			}
		}
		return min;
	}
	public static int max(int[] data){
		int max = data[0];
		for(int i =1;i<data.length;i++){
			if(data[i] > max){
				max = data[i];
			}
		}
		return max;
	}
	
	
	
	
}
