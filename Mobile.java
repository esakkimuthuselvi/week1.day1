package week1.day1;

public class Mobile {
	
	String Model="OPPO";
	float Weight=18.2F;
	int MobileCost=18000;
	boolean isFullyCharged=true;
	
	public void makeCall() {
		System.out.println("Make Call");
	}
	public void sendMsg() {
		System.out.println("Send Msg");
	}
  public static void main(String args[])
  {
	  System.out.println("In Main Method");
	  Mobile myMob=new Mobile();
	  myMob.makeCall();
	  myMob.sendMsg();
	  System.out.println(myMob.Model);
	  System.out.println(myMob.Weight);
	  System.out.println(myMob.MobileCost);
	  System.out.println(myMob.isFullyCharged);
	  
  }
}
