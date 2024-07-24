package j0717;

public class Matango {
    // フィールド変数
    int hp;
    final int LEVEL = 10;  // 定数・固定値の設定はfinal
    char suffix;           // 何匹目かを保存

    // フィールドメソッド
    public void run() {
        System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
    }
}
