package j0612;

public class Main5_6 {
    int a = 10;
    int b = 20;

    public static void main(String[] args) {
        Main5_6 instance = new Main5_6();
        
        // int x = 10;
        // int y = 20;
        System.out.println(instance.a);
        System.out.println(instance.b);
        //  実引数
        instance.add(instance.a, instance.b);
        System.out.println(instance.a);
        System.out.println(instance.b);
    }

    //                     仮引数
    public void add(int x, int y) {
        this.a = 10000;
        this.b = 20000;
    }
}
