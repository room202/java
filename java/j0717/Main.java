package j0717;

public class Main {
    public static void main(String[] args) {
        // 勇者よ、この仮想世界に生まれよ！
        // 1.勇者を生成する
        Hero h = new Hero();  // インスタンス化

        // 2.フィールドに初期値をセット
        h.name = "ミナト";
        h.hp = 100;
        System.out.println("勇者" + h.name + "を生み出しました！");

        // 3.勇者のメソッドを呼び出していく
        h.sit(5);   // 5秒座れ
        h.slip();       // 転べ
        h.sit(25);  // 25秒座れ
        h.run();        // 逃げろ

        // お化けキノコよ、この仮想世界に生まれよ！
        // 勇者よ、戦え！
        // お化けキノコよ、逃げろ！
    }
}
