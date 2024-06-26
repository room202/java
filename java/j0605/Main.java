package j0605;

public class Main {
    public static void main(String[] args) {
        // 配列を作る　　[0] [1] [2] [3] [4]
        int[] scores = {20, 30, 40, 50, 80};

        // 配列の要素の合計を計算
        int sum = scores[0] + scores[1] + 
                    scores[2] + scores[3] + scores[4];

        // 平均を計算
        int avg = sum / scores.length;

        System.out.println("合計点 : " + sum);
        System.out.println("平均点 : " + avg);
    }
}
