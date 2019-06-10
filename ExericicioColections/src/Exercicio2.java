import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercicio2 {
    public static void main(String[] args) {
        List<Integer> vazia = new ArrayList<>();
        vazia.add(1); vazia.add(5); vazia.add(5); vazia.add(6); vazia.add(7); vazia.add(8); vazia.add(8); vazia.add(8);

        System.out.println("- ArrayList -");
        for(Integer numeros : vazia) {
            System.out.println(numeros);
        }

        Set<Integer> vazio = new HashSet<>();
        vazio.add(1); vazio.add(5); vazio.add(5); vazio.add(6); vazio.add(7); vazio.add(8); vazio.add(8); vazio.add(8);

        System.out.println("- HashSet -");
        for(Integer numeros : vazio) {
            System.out.println(numeros);
        }


    }
}
