
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (solution.canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}