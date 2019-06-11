package Exercicio2;

public class LeitorDeNomes {
    public void nome(Integer idade1, Integer idade2, Integer idade3, String nome1, String nome2, String nome3) {
        if (idade1 > idade2 && idade1 > idade3) {
            System.out.println(nome1);
        } else if (idade2 > idade1 && idade2 > idade3){
            System.out.println(nome2);
        } else {
            System.out.println(nome3);
        }

        if (idade1 < idade2 && idade1 < idade3) {
            System.out.println(nome1);
        } else if (idade2 < idade1 && idade2 < idade3){
            System.out.println(nome2);
        } else {
            System.out.println(nome3);
        }


    }
}
