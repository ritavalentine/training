package basics;

public class FibonnaciApp {
	public static void main(String[] args){
		//Fib is defined as the sum of the 2 previous fib numbers
		//fib(0)=0
		//fib(1)=1
		//fib(2)=fib(1) + fib(0)
		System.out.println(fib(6));
	}
	
	public static int fib(int n){
		if(n == 0){
			return 0;
		}else if(n == 1){
			return 1;
		}else{
			return fib(n-1) + fib(n-2);
		}
	}
}
