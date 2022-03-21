package week1.day1;

public class Factorial {
	int number=5;
	int i;
	int fact=1;
	
	public static void main(String args[]) {
		Factorial exFact = new Factorial();
		for(int i=1; i<=exFact.number;i++) {
			exFact.fact=(exFact.fact)*i;
			
			
		}
		System.out.println("Factorial of "+exFact.number+" is: "+exFact.fact);
	}
	

}
