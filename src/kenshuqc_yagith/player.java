/**
 * 
 */
package kenshuqc_yagith;

/**
 * @author qc_yagith
 *
 */
public class player {
	

    // じゃんけんの手
    public static final int GOO = 0;
    public static final int CHOKI = 1;
    public static final int PA = 2;

    // じゃんけんの手の数
    private static final int maxSize = 3;

    // Player の名前
    private String name;

    // Constructer
    public player(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getHand(){
        // 手を選ぶ
        return selectHand();
    }

    // 手を出力する
    public static String valueOf(int hand){
        String handText = null;

        switch(hand){
          case GOO:
            handText = "GOO";
            break;
          case CHOKI:
            handText = "CHOKI";
            break;
          case PA:
            handText = "PA";
            break;
          default:
            handText = "";
            break;
        }
        return handText;
    }

    // 手の選択
    private int selectHand(){
        // 乱数を利用して手を選択する
        return (int)(Math.random() * maxSize);
    }
}
