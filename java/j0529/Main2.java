package j0529;

public class Main2 {
    public static void main(String[] args) {

        int year = 2024;

        while(year > 0) {
            System.out.println("Hello World");
            try {
                // 5秒間一時停止する
                Thread.sleep(5000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
            //year -= 1000;
        }
        
        // while(true) {
        //     System.out.println("Hello World");
        // }

        // for(;;) {
        //     System.out.println("Hello World");
        // }
    }
}
