package j0605;

public class Main4 {
    public static void main(String[] args) {
        int[] scores = {20, 30, 40, 50, 80};

        // 拡張for
        //  for(要素の型 任意の変数名 : 配列変数名){}
        for(int score : scores) {
            System.out.println(score);
        }

        // 通常のfor文
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }


    }
}
