package week1.day1;

public class PrimeNum {
	
	public static void main(String args[]) {
		int input=17;
		boolean flag=true;
		for(int i=2; i<input; i++) {
			if(input%i==0) {
				System.out.println(input + "is not a Prime Number");
				flag =false;
				break;
			}
		}
		if(flag) {
			System.out.println(input + "is a Prime Number");
		}
	}

}
