package DatatypeConvertion;

public class Datatypeconvertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a=10;
		int b=a;
		System.out.println("Value1: " + b);
		
		int a1=10;
		byte b1=(byte) a1;
		System.out.println("Value 2: " + b1);
		
		float a2=10.20f;
		int b2=(int) a2;
		System.out.println(b2);
		
		int a3=20;
		float b3=a3;
		System.out.println(b3);

	}

}
