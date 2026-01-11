package Assignment;

public class Greatest3Nums {
	
//	public boolean num(int a, int b, int c) {
//		if(a>b && a>c) {
//			return true;
//		}else if(b>c) {
//			return true;
//		}
//		return false;
//	}

	public static void main(String[] args) {
//		Greatest3Nums result=new Greatest3Nums();
//		boolean greatest=result.num(10, 9, 7);
//		System.out.println(greatest);
		int a=10;
		int b=9;
		int c=7;
		if(a>b && b>c) {
			System.out.println("True");
		}else if(b>c) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		
	}

}
