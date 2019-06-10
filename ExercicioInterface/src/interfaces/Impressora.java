package interfaces;

import java.util.ArrayList;

public class Impressora  {
    ArrayList<String> imprimiveis = new ArrayList<String>();

    public void imprimirTudo() {
        for (String string : imprimiveis) {
            System.out.println(string);
        }
    }

    public void adicionarImprimivel(String imprimivel) {
        imprimiveis.add(0, );
    }
}
