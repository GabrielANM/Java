
public class Solution {

    public Solution() {
    }

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int posAtual = 0, posFinal = game.length -1, j = 0;
        for (int i = 0; i < game.length; i++) {
            if (i < game.length && i + leap <= game.length + 1) {
                if (game[i + 1] == 0) {
                    posAtual = i + 1;
                } else if (game[i + 1] >= game.length) {
                    posAtual = posFinal;
                    break;
                } else if (posAtual != posFinal) {
                    while (game[i + j] < game.length) {
                        if (game[i + j] == 0 && game[i + j] < game.length) {
                            posAtual = i + leap;
                        } else if (game[i + j] >= game.length) {
                            posAtual = posFinal;
                            break;
                        }else if (j <= leap) {
                            j++;
                        }
                    }
                } else {
                    break;
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
