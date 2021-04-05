package kenshuqc_yagith;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class kouyakusuu {
	
	static int euclid( int a, int b ) {
        if( a < b ) { int temp = a; a = b; b = temp; } //引数の大小入替
        if( b < 1 ) return -1;                         //0以下は非自然数

        if( a % b == 0 ) return b;
        return euclid( b, a % b );
    }
    public static void main( String[] args ) {
        int a, b, n;

        try {
            BufferedReader br
            = new BufferedReader( new InputStreamReader(System.in) );
            System.out.print( "数値の１つ目を指定 : " );
            a = Integer.parseInt( br.readLine() );
            System.out.print( "数値の2つ目を指定 : " );
            b = Integer.parseInt( br.readLine() );

            if( (n = euclid( a, b )) > 0 )
                System.out.println(a + "と" + b + "の最大公約数は" + n + "です。" );
            br.close();
        } catch( Exception e ) {
            System.out.println( "例外が発生しました: " + e );
        }
    }
}
