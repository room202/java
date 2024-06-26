package j0522;

public class Main7 {
    public static void main(String[] args) {
        int temp = 25;  // 現在の温度を保存

        // 25度より気温が高い間繰り返す
        while(temp > 25) {
            // 1度下げる
            temp--; // 後置デクリメント
                    // 29
                    // 28
                    // 27
                    // 26
                    // 25
            System.out.println("温度を１度下げました : " + temp);
        }

        System.out.println();
        
        do {
            // 1度下げる
            temp--; // 後置デクリメント
            System.out.println("温度を１度下げました : " + temp);
        } while(temp > 25); // 25度より気温が高い間繰り返す
    }
}
