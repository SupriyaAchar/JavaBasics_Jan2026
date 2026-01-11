package Assignment;

public class AgeAndWeight {

	public static void main(String[] args) {
		int age=25;
		int weight=55;
		if(age<18) {
			System.out.println("UnderAge");
		}else if(age>=18 && weight<=50) {
			System.out.println("Not Eligible");
		}else {
			System.out.println("Eligible");
			
		}

	}

}
