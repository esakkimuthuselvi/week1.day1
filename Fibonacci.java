package week1.day1;

public class Fibonacci {
	 int n=8;
	 int firstNum=0;
	 int secNum=1;
	 int sum;
	
	public static void main(String args[])
	{
	   
	   Fibonacci myFibo=new Fibonacci();
	   System.out.println(myFibo.firstNum);
	   System.out.println(myFibo.secNum);
	   for(int i=2; i <= (myFibo.n); i++) {
		   myFibo.sum=myFibo.firstNum + myFibo.secNum;
		   System.out.println(myFibo.sum);
		   myFibo.firstNum= myFibo.secNum;
		   myFibo.secNum=myFibo.sum;
		   
   }
	   
	}

}
