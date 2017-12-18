package basics;

public class SumOfNums {
	public static void main(String[] args){
		System.out.println(sumOfNums(2));
	}
	
	public static int sumOfNums(int n){
		if(n==0){
			return 0;
		}else if(n==1){
			return 1;
		}else{
			return n + sumOfNums(n-1);
		}
	}
}
