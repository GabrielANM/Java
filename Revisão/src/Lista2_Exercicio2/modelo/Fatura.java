package Lista2_Exercicio2.modelo;

import Lista2_Exercicio2.Item;

import java.util.ArrayList;
import java.util.List;

public class Fatura {
    private List<Item> listaDeItems = new ArrayList<>();

    public List<Item> getListaDeItems() {
        return listaDeItems;
    }

    public void adicionarItem(Item items) {
        this.listaDeItems.add(items);
    }

    public void removerItem(Item items) {
        this.listaDeItems.remove(items);
    }

    @Override
    public String toString() {
        return "Fatura{" +
                "listaDeItems=" + listaDeItems +
                '}';
    }

    public Double getTotalFatura(List<Item> items) {
        Double precoTotal = 0.0, aux;
        for (Item item : items) {
            aux = item.getQuantidadeComprada() * item.getPreco();
            precoTotal = precoTotal + aux;
        }
        return precoTotal;
    }
}
