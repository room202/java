package j0605;

public class Main3 {
    public static void main(String[] args) {
        //     base    [0]  [1]  [2]  [3]
        char[] base = {'A', 'T', 'G', 'C'};
        //     seq  [0][1][2][3][4]
        int[] seq = {2, 0, 1, 3, 0};
        
        for (int i = 0; i < base.length; i++) {
            System.out.println(base[seq[i]] + " ");
            // i = 0           base[seq[0]] → base[2] → G
            // i = 1           base[seq[1]] → base[0] → A
        }
    }
}
