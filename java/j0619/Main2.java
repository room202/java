package j0619;

public class Main2 {
    public static void main(String[] args) {
        // スコープとローカル変数

        // ローカル変数 : mainメソッドが終わると消える(スコープの範囲)
        int x = 100;
        int z = 200;

        // ローカル変数 : for文が終わったら消える(スコープの範囲)
        for(int i = 0; i < 5; i++) {
            // ローカル変数 : forループ毎に消える(スコープの範囲)
            int y = 200;
            System.out.println("main : " + y);
        }

        methodA(x);
    }

    //           仮引数=>ローカル変数 : methodAメソッドが終わると消える(スコープの範囲)
    public static void methodA(int x) {
        // ローカル変数 : methodAメソッドが終わると消える(スコープの範囲)
        int y = 10;
        int z = 300;
        System.out.println("methodA : " + x);
        System.out.println("methodA : " + y);
        System.out.println("methodA : " + z);
    }
}
