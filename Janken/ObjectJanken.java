/*
 * オブジェクト指向によるジャンケンプログラム
 * javac -encoding utf-8 *.java
 */

public class ObjectJanken {
    public static void main(String[] args)
    {
        //審判（齋藤さん）のインスタンス生成
        Judge saito = new Judge();

        //プレイヤー1（村田さん）の生成
        Player murata = new Murata("村田さん");

        //プレイヤー2（山田さん）の生成
        Player yamada = new Yamada("山田さん");

        //村田さんと山田さんをプレイヤーとしてジャンケンを開始する
        saito.startJanken(murata, yamada);
    }
    
}
