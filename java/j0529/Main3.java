package j0529;

public class Main3 {
    public static void main(String[] args) {
        // ①変数weightの値が60に等しいか？
        int weight = 50;
        if(weight == 60 ) {}

        // ②変数age1とage2の合計を２倍したものが60を超えているか？
        int age1 = 20;
        int age2 = 30;
        if( (age1 + age2) * 2 > 60 ) {}

        // ③変数ageが奇数であるか？
        // 偶数 : 2, 4, 6, 8, 10
        // 奇数 : 1, 3, 5, 7, 9
        int age = 3;
        if(age % 2 == 1) {}

        // ④変数nameに代入された文字列が「湊」と等しいか？
        String name = "湊";
        if(name.equals("湊")) {}
        if(name.equals("湊") == true) {}
    }
}
