package Assignment;

public class LoopsPrimeNums {
	
	public static boolean isPrime(int n) {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
				return false;
			}
		}
		return true;	
		
	}

	public static void main(String[] args) {
		int n=3;
		if(isPrime(n)==true) {
			System.out.println("Prime");
			
		}else {
			System.out.println("Not Prime");
		}
		
		

	}

}
