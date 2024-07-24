package j0717;

public class Main {
    public static void main(String[] args) {
        // 勇者よ、この仮想世界に生まれよ！
        // 1.勇者を生成する
        Hero h = new Hero();  // インスタンス化

        // 2.フィールドに初期値をセット
        h.name = "ミナト";
        h.hp = 100;
        // System.out.println("勇者" + h.name + "を生み出しました！");

        // 敵のインスタンスを作る
        // マタンゴA(1匹目)をインスタンス化して、初期設定する
        Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';

        // マタンゴB(2匹目)をインスタンス化して、初期設定する
        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';

        // 冒険はじまり
        h.slip();
        m1.run();
        m2.run();
        h.run();


        // クレリックさん
        Cleric c = new Cleric();
        c.name = "クレリック";
        c.selfAid();
        c.pray(3);
    }
}
