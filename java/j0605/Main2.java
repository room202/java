package j0605;

public class Main2 {
    public static void main(String[] args) {
        // 教科のテストの合計と平均点を計算するプログラム

        // 教科ごとのテストの点数を保存する
        int[] scores = {20, 30, 40, 50, 80, 100};

        // 合計を保存しておく変数
        int sum = 0;

        int count = 0;

        // 科目数分ループする
        for(int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
            // 50以上か判定？
            if(scores[i] >= 50) {
                count++;
                // count = count + 1;
                // count += 1;
            }
            //sum = sum + scores[i];
            // 合計を計算する
            sum += scores[i];
        }
        // 教科の平均を求める
        int avg = sum / scores.length;

        System.out.println("合計 : " + sum);
        System.out.println("平均 : " + avg);
        System.out.println("50点以上 : " + count + "人");
    }
}
