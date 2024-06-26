package j0529;

public class Main4 {
    public static void main(String[] args) {
        // A : NG
        // double cost;
        // if(cost = 300 * 1.05) {}

        // B : NG
        // if(3) {}

        // C : OK
        int age = 10;
        if(age != 30) {}

        // D : OK
        if(true) {}

        // E : OK
        int b = 20;
        if(b + 5 < 20) {}

        // F : NG
        boolean isNumeric = false;
        if(isNumeric = true) {
            System.out.println("問題Fのif文の中");
        } else {
            System.out.println("問題Fのelse文の中");
        }


    }
}
