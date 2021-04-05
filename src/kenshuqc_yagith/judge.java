package kenshuqc_yagith;

public class judge {
	int judge;
    int win;
	int lose;
	int even;

	public void judgement(int cpuHand, int playerHand) {
	    judge = (cpuHand - playerHand + 3 ) % 3;
	    
	    switch(judge) {
	      case 0:
	        System.out.println("なんだ、同じじゃないか！！");
	        even++;
	        break;
	      case 1:
	        System.out.println("こりゃ降参！");
	        win++;
	        break;
	      case 2:
	        System.out.println("あなたの負けです！");
	        lose++;
	        break;
	      default:
	    }
	    System.out.println("--------------------");
	  }
}
	    
	
