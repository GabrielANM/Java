
public class Solution {

    public Solution() {

    }

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int posAtual = 0, posFinal = game.length - 1;

        for (int i = 0; i < game.length; i++) {
            if (game[i] == 0) {
                posAtual = i;
            } else {
                for (int j = 1; i + j <= game.length - 1; j++) {
                    if (j < leap ) {
                        if (game[i + j] == 0 || i + j == posFinal) {
                            posAtual = i + j;
                        }
                    }
                }
            }
        }
        if (posAtual == posFinal) {
            return true;
        } else {
            return false;
        }
    }
}