
public class Solution {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int posAtual = 0, posFinal = game.length - 1;

        for (int i = 0; i < game.length; i++) {
            if (game[i] == 0) {
                posAtual = i;
                posAtual = i;
            } else {
                if (i - 1 >= 0)
                i -= 1;
                if (i + leap >= posFinal) {
                    return true;
                } else if (game[i + leap] == 0 || i + leap == posFinal) {
                        posAtual = i + leap;
                    } else if (i + leap > posFinal) {
                        posAtual = posFinal;
                    } else {
                        return false;
                    }
                i = posAtual;
            }
        }
        if (posAtual == posFinal) {
            return true;
        } else {
            return false;
        }
    }
}