package j0717;

import java.util.Random;

public class Cleric {
    // 属性(フィールド)
    String name;            // 名前
    int hp = 50;            // HP
    final int MAX_HP = 50;  // 最大HP
    int mp = 10;            // MP
    final int MAX_MP = 10;  // 最大MP

    // 操作(メソッド)
    // 祈る
    public int pray(int sec) {
        // 理論上の回復量を乱数を用いて算出する
        int recover = new Random().nextInt(3) + sec;

        // 実際の回復量を算出する
        // 最大MPを超えての回復はできないので、チェックする
        int recoverActual = Math.min(this.MAX_MP - this.mp, recover);

        // ここで実際にMP回復
        this.mp += recoverActual;

        System.out.println(this.name + "のMPが" + this.mp + "に回復しました。");

        // 回復した分の値を返す
        return recoverActual;
    }

    // セルフエイドメソッド
    public void selfAid() {
        // 自分のMPを5消費する
        this.mp -= 5;
        //this.mp = this.mp - 5;
        // 自分のHPが最大HPまで回復
        this.hp = this.MAX_HP;
        System.out.println(this.name + "は、HPが回復して" + this.hp + "になりました。");
        System.out.println(this.name + "は、MPが" + this.mp + "になりました。");
    }
}
