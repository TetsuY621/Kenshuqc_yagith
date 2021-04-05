package kenshuqc_yagith;

public class kuku {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 1; i <= 1000; i++) { 
			  System.out.print(i + "の段 ");//この位置に入る
			  for (int j = 1; j <= 9; j++) {
				  if (i * j<=10) {
		                 System.out.printf("%02d",i * j);
		             } else {
                       System.out.print(i * j + " "); 
			  } 
			};
			  System.out.println(""); 
			}

	}

}
