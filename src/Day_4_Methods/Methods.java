package Day_4_Methods;

public class Methods {
	
	public int sum(int a,int b) {
		int c=a+b;
		return c;
	}
	public double sum(double f1,double f2) {
	double f3=f1+f2;
	return f3;
	}

	public static void main(String[] args) {
		Methods m1=new Methods();
		System.out.println(m1.sum(30, 40));
		System.out.println(m1.sum(20.54, 10.45));
		
		

	}

}
