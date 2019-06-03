import modelo.Animals;

public class ChamaObjeto {

    public static void main(String[] args) {

        Animals ricota = new Animals("Ricota", 3, "Luan");
        /*ricota.setNome("Ricota");
        ricota.setIdade(3);*/
        System.out.println("Nome: " + ricota.getNome());
        System.out.println("Idade: " + ricota.getIdade());

        Animals fritz = new Animals( "Fritz", 10, "Jorge");
        /*fritz.setNome("Fritz");
        fritz.setIdade(10);*/

        System.out.println("Nome: " + fritz.getNome());
        System.out.println("Idade: " + fritz.getIdade());



    }
}
