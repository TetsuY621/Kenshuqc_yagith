package kenshuqc_yagith;

public class number {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num[] = new int[1000];//配列のサイズをセット
        // 配列に代入
        for(int i = 1; i <= 1000; i++){
            num[i - 1] = i;
        }
        // 配列の値を出力
        for(int i = 0; i < 1000; i++){
            System.out.print(num[ i ]);
            if(i % 10 == 9){
                System.out.println(" ");
            }
        }
    }
}
