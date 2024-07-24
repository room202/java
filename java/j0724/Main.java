package j0724;

public class Main {
    public static void main(String[] args) {
        Hero h1;     // これから入れるHeroインスタンスの保存場所(アドレス)を保存
        h1 = new Hero(); // Heroインスタンスの先頭アドレスを代入(保存)する
        h1.hp = 100;     // Heroインスタンスを活用

        Hero h2;
        h2 = h1;
        h2.hp = 200;

        System.out.println("h1.hp : " + h1.hp);
        System.out.println("h2.hp : " + h2.hp);

        Sword s = new Sword();
        s.name = "炎の剣";
        s.damage = 10;

        Hero h3 = new Hero();
        h3.name = "ミナト";
        h3.hp = 100;
        h3.sword = s;
        System.out.println("現在の武器は" + h3.sword.name);
        System.out.println(s.name);


        // この書き方でも同じ
        // Hero h = new Hero();

    }
}
