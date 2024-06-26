package j0515;

public class Main2 {
    public static void main(String[] args) {
        // ①
        System.out.println("ようこそ占いの館へ");
        // ②
        System.out.print("あなたの名前を入力してください＞");
        // ③
        String name = new java.util.Scanner(System.in, "Shift-JIS").nextLine();
        // ④
        System.out.print("あなたの年齢を入力してください＞");
        // ⑤
        String ageString = new java.util.Scanner(System.in).nextLine();
        // ⑥
        int age = Integer.parseInt(ageString);
        // ⑦ : 0～3のランダムな値が取得
        int fortune = new java.util.Random().nextInt(4);
        // ⑧ : 0～3 に +1 1～4
        fortune++;
        // ⑨
        System.out.println("占いの結果が出ました！");
        // ⑩
        System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + 
                            fortune + "です。");
        // ⑪
        System.out.println("1: 大吉  2:中吉  3:吉  4:凶");
    }
}
