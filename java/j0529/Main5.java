package j0529;

public class Main5 {
    public static void main(String[] args) {
        // 練習3-3
        // ①
        int isHungry = 0;   // 0 : お腹いっぱい状態, 1 : 空腹の状態
        String food = "ハンバーガー";

        // ②
        System.out.println("こんにちは");

        // ③
        if(isHungry == 0) {
            System.out.println("お腹がいっぱいです");
        } else {
            System.out.println("はらぺこです");
            // System.out.println(food + "をいただきます");
        }

        // ④
        if(isHungry == 1) {
            System.out.println(food + "をいただきます");
        }

        // ⑤
        System.out.println("ごちそうさまでした");
    }
}
