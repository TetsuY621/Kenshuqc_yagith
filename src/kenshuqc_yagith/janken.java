package kenshuqc_yagith;

public class janken {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Judge judge;
        if(args.length == 1){
            try{
                judge = new Judge(Integer.parseInt(args[0]));
            }catch(NumberFormatException ex){
                System.out.println("Usage: java Janken [number of Players]");
                return;
            }
        }else{
            System.out.println("Usage: java Janken [number of Players]");
            return;
        }

        judge.playGame();
    }
}

