import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {
        Map<Integer, String> dicionario = new HashMap<>();

        dicionario.put( 0, "Ovos");
        dicionario.put( 1, "Água");
        dicionario.put( 2, "Escopeta");
        dicionario.put( 3, "Cavalo");
        dicionario.put( 4, "Dentista");
        dicionario.put( 5, "Fogo");


        List<String> apelidosJoao = new ArrayList<>();
        apelidosJoao.add("Juan"); apelidosJoao.add("Fissura"); apelidosJoao.add("Maromba");

        List<String> apelidosMiguel = new ArrayList<>();
        apelidosMiguel.add("Night Watch"); apelidosMiguel.add("Bruce Wayne"); apelidosMiguel.add("Tampinha");

        List<String> apelidosMaria = new ArrayList<>();
        apelidosMaria.add("Wonder Woaman"); apelidosMaria.add("Mary"); apelidosMaria.add("Marilene");

        List<String> apelidosLucas = new ArrayList<>();
        apelidosLucas.add("Lukinha"); apelidosLucas.add("Jorge"); apelidosLucas.add("George");




        Map<String, List<String>> dicionario2 = new HashMap<>();
        dicionario2.put("João", apelidosJoao);
        dicionario2.put("Miguel", apelidosMiguel);
        dicionario2.put("Maria", apelidosMaria);
        dicionario2.put("Lucas", apelidosLucas);

        for(String apelido : dicionario2.keySet()) {
            System.out.println("Nome: " + apelido + " = " + dicionario2.get(apelido));
        }
    }
}
