import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio {
    public static void main(String[] args) {
        String palavra = "e";
        char[] stringToArray = palavra.toCharArray();
        Integer count = 0;

        Character[] umBuraco = {'q', 'Q', 'e', 'R', 'o', 'O', 'p', 'P', 'a', 'A', 'd', 'D', 'b', 'g'};
        List<Character> listUm = Arrays.asList(umBuraco);
        Character[] doisBuraco = {'B'};
        List<Character> listDois = Arrays.asList(doisBuraco);

       for (char output : stringToArray){
           if (listUm.contains(output)){
               count = count + 1;
           }
           if (listDois.contains(output)){
               count = count + 2;
           }
       }
       System.out.println(count);
    }
}

// Joao VIctor