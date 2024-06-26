package j0529;

public class Main9 {
    public static void main(String[] args) {
        //int[] scores;           // Step1:配列の箱だけつくった(中身なし)
        //scores = new int[5];    // Step2:要素作成(中身を作る)して代入

        // C言語 : int scores[5];
        int[] scores = new int[5];

        int num = scores.length;
        System.out.println("要素の数 : " + num);

        scores[1] = 30;
 
        // int x = 0;
        // System.out.println(x);

        // intの配列型
        int[] scores1 = new int[]{20, 30, 40, 50, 80};
        int[] scores2 = {20, 30, 40, 50, 80};
        for(int i = 0; i < scores2.length; i++) {
            System.out.println("scores2[" + i + "] : " + scores2[i]);
        }

        // 拡張for (PHPでのforeach)
        for(int val : scores2) {
            System.out.println(val);
        }
    }
}
