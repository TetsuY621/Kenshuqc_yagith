/**
 * 
 */
package kenshuqc_yagith;
import java.util.Scanner;

/**
 * @author qc_yagith
 *
 */
public class player {
	int hand;
	
	public void setHand() {
	    System.out.print("「グー」「チョキ」「パー」のどれかを入力してください。＞");
	    Scanner sc = new Scanner(System.in);
	    String inputHand = sc.nextLine();

	    switch(inputHand) {
	      case "グー":
	        hand = 0;
	        break;
	      case "チョキ":
	        hand = 1;
	        break;
	      case "パー":
	        hand = 2;
	        break;
	      default:
	        System.out.println("間違えたので終了します。");
	    }
	  }

	  public int getHand() {
	    return hand;
	  }
	}
	


