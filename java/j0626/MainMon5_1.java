package j0626;

public class MainMon5_1 {
    public static void main(String[] args) {
        //introduceOneself();
        // email("欠席のご連絡", 
        //         "yagi@i-seifu.jp",
        //         "体調不良のため欠席します。");
        // email("yagi@i-seifu.jp",
        //         "体調不良のため欠席します。");
        double triangleArea = calcTriangleArea(10.0, 5.0);
        System.out.println("面積 = " + triangleArea + "平方cm");
        System.out.println("円の面積 = " + calcCircleArea(5.0) + "平方cm");
    }

    public static double calcCircleArea(double radius) {
        return radius * radius * 3.14;
    }

    public static double calcTriangleArea(double bottom, double height) {
        // 三角形の面積を求める
        // (底辺 * 高さ) / 2
        double triangleArea = (bottom * height) / 2;
        return triangleArea;
    }

    // オーバーロードしている
    public static void email(String address, String text) {
        String msg = """
                %sに、以下のメールを送信しました
                件名：無題
                本文：%s
                """.formatted(address, text);

        System.out.println(msg);
    }

    public static void email(String title, String address, String text) {
        String msg = """
                %sに、以下のメールを送信しました
                件名：%s
                本文：%s
                """.formatted(address, title, text);

        System.out.println(msg);
    }

    public static void introduceOneself() {
        String name = "湊雄輔";
        int age = 22;
        double height = 169.9;
        char eto = '辰';

        String msg = """
                私の名前は%sです。
                歳は%d歳です。
                身長は%.1fcmです。
                十二支は%cです。
                """.formatted(name, age, height, eto);

        System.out.println(msg);
    }
}
