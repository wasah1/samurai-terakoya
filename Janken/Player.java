/**
 * ジャンケンのプレイヤーを表すクラス
 */
public class Player {
    // ジャンケンの手を表す定数
    public static final int STONE = 0;// グー
    public static final int SCISSORS = 1;// チョキ
    public static final int PAPER = 2;// パー

    // ------------------------------------
    // プレイヤークラスの属性
    // ------------------------------------
    // プレイヤーの名前
    private String name;

    // プレイヤーの勝った回数
    private int winCount = 0;

    public Player(String name){
        this.name = name;
    }

    // ------------------------------------
    // プレイヤークラスの操作
    // ------------------------------------

    /**
     * ジャンケンの手を出す
     *
     * @return ジャンケンの手
     */
    public int showHand()
    {
        // プレイヤーが何を出すのか決める
        int hand = 0;

        // 0以上3未満の少数として乱数を得る
        double randomNum = Math.random() * 3;
        if (randomNum < 1) {
            // randomNumが0.0以上1.0未満の場合、グー
            hand = STONE;
            // プレイヤーの手を表示する
            //System.out.print("グー");

        } else if (randomNum < 2) {
            // randomNumが1.0以上2.0未満の場合、チョキ
            hand = SCISSORS;
            // プレイヤーの手を表示する
            //System.out.print("チョキ");

        } else if (randomNum < 3) {
            // randomNumが2.0以上3.0未満の場合、パー
            hand = PAPER;
            // プレイヤーの手を表示する
            //System.out.print("パー");
        }

        return hand;
    }

    /*
     * 審判から勝敗を聞く
     * 
     * @param result true:勝ち、false:負け
     */
    public void notifyResult(boolean result) {
        if(result==true){
            winCount++;
        }
    }

    /*
     * 自分の勝った回数を答える
     * 
     * @return 勝った回数
     */
    public int getWinCount() {
        return winCount;
    }

    public String getName() {
        return name;
    }
}
