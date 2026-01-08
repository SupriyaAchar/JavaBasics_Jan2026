package Operators;

public class TernaryOperator {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		int c=150;
		System.out.println(a>b?"a is the greatest number":"b is the greatest number");
	String result=((a>b && a>c)?"a is the greatest number":(b>c?"b is the greatrest number":"c is the greatest number"));
	System.out.println(result);
		

	}

}
