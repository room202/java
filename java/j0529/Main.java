package j0529;

public class Main {
    public static void main(String[] args) {
        // break; 文
        for(int i = 1; i <= 9; i++) {
            if(i == 5) {
                break;
            }
            System.out.println(i + "回目");
        }

        // continue; 文
        for(int i = 1; i <= 9; i++) {
            if(i == 5) {
                continue;
            }
            System.out.println(i + "回目");
        }
        
    }
}
