package Operators;

public class LogicalOperators {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		/*&&(AND) - both the conditions are true the result =true
		 * if any one of the conditions are false for example: (cond 1= true && cond 2=False then result=false)
	*/
		System.out.println((a<b) && (b>a));
		System.out.println((a<b) && (b<a));	
		
		/* ||(OR) - any one of the conditions is true then result will be true
		 * 
		 */
		System.out.println((a<b) || (b>a));
		System.out.println((a<b) || (b<a));
		System.out.println((a>b) || (b<a));
		System.out.println((a>b) || (b>a));
		
		/* ! (Not equal to) */
		System.out.println(!(a<b));
	}

}
