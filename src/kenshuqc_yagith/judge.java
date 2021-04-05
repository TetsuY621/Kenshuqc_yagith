package kenshuqc_yagith;
import java.util.ArrayList;
import java.util.List;

public class Judge {
    private List players;
    private List hands;

    // コンストラクタ
    //   引数はプレイヤーの数
    public Judge(int playerSize){
        players = new ArrayList();
        hands = new ArrayList();

        for(int i = 0 ; i < playerSize ; i++){
            players.add(new Player("Player" + i));
        }
    }

    // ゲームのメインルーチン
    public void playGame(){
        // プレイヤーに手を問い合わせる
        for(int i = 0 ; i < players.size() ; i++){
            Player player = (Player)players.get(i);
            int hand = player.getHand();
            hands.add(new Integer(hand));
        }

        // 判定
        List winners = judge(hands);

        // 手の出力
        for(int i = 0 ; i < players.size() ; i++){
            Player player = (Player)players.get(i);
            int hand = ((Integer)hands.get(i)).intValue();
            System.out.println(player.getName() + "'s hand is "
                               + Player.valueOf(hand));
        }

        if(winners.isEmpty()){
            System.out.println("Draw!");
        }else{
            for(int i = 0 ; i < winners.size() ; i++){
                Player player = (Player)winners.get(i);
                System.out.println("Winner is " + player.getName());
            }
        }
    }

    // 判定ルーチン
    private List judge(List hands){
        List gooPlayers = new ArrayList();
        List chokiPlayers = new ArrayList();
        List paPlayers = new ArrayList();

        classify(gooPlayers, chokiPlayers, paPlayers, hands);

        if(gooPlayers.isEmpty()){
            if(chokiPlayers.isEmpty()){
                // 全員パー
                return new ArrayList(); // あいこ
            }else{
                if(paPlayers.isEmpty()){
                    // 全員チョキ
                    return new ArrayList(); // あいこ
                }else{
                    // チョキとパーでチョキの勝ち
                    return chokiPlayers;
                }
            }
        }else if(chokiPlayers.isEmpty()){
            if(paPlayers.isEmpty()){
                // 全員グー
                return new ArrayList();
            }else{
                // パーとグーでパーの勝ち
                return paPlayers;
            }
        }else if(paPlayers.isEmpty()){
            // グーとチョキでグーの勝ち
            return gooPlayers;
        } else {
            // グー、チョキ、パーであいこ
            return new ArrayList();
        }
    }

    private void classify(List gooPlayers, List chokiPlayers, List paPlayers, List hands){
        for(int i = 0 ; i < hands.size() ; i++){
            int hand = ((Integer)hands.get(i)).intValue();
            switch(hand){
              case Player.GOO:
                gooPlayers.add(players.get(i));
                break;
              case Player.CHOKI:
                chokiPlayers.add(players.get(i));
                break;
              case Player.PA:
                paPlayers.add(players.get(i));
                break;
              default:
                break;
            }
        }
    }
}
