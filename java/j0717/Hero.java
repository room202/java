package j0717;

//         クラス名
public class Hero {
    // ここはクラスブロックの中
    // 属性
    // フィールド、メンバ変数とも言う
    String name; // 名前の保存用
    int hp;      // HPの保存用

    // 操作
    // メソッド、メンバメソッド
    // 【名前】sleep
    // 【必要情報】なし
    // 【結果】なし
    // 【処理内容】HPが100に回復する
    public void sleep() {
        this.hp = 100;  // 自分自身のhpフィールド
        System.out.println(this.name + "は、眠って回復した！");
    }
    // 座る操作
    //           引数 : 何秒座るか
    public void sit(int sec) {
        this.hp += sec; // 座る秒数だけHPを増やす
        System.out.println(this.name + "は、" + sec + "秒座った！");
        System.out.println("HPが" + sec + "ポイント回復した");
    }
    // 転ぶ操作
    public void slip() {
        this.hp -= 5; // 転んだら強制的に-5のダメージ
        System.out.println(this.name + "は、転んだ！");
        System.out.println("5のダメージ！");
    }
    // 逃げる操作
    public void run() {
        System.out.println(this.name + "は、逃げ出した！");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは" + this.hp + "でした");
    }
}
