package Assignment;

import Day_4_Methods.Methods;

public class ReturnSumOfTwoNum {
	

	public int sum(int a,int b) {
		int c=a+b;
		return c;
	}
	public float sum(float f1,float f2) {
	float f3=f1+f2;
	return f3;
	}

	public static void main(String[] args) {
		Methods m1=new Methods();
		System.out.println(m1.sum(30, 40));
		System.out.println(m1.sum(20.54f, 10.45f));
		
		

	}

}
