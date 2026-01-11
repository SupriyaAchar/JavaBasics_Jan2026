package Assignment;

public class ReturnRemainder {
	


	public int remainder(int a, int b) {
		int result=a%b;
		return result;
	}

	public static void main(String[] args) {
		ReturnRemainder r1=new ReturnRemainder();
		int result=r1.remainder(10, 3);
		System.out.println(result);
		
		
		
	

	}

}
