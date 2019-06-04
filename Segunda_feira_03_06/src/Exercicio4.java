import modelo.Tripé;

public class Exercicio4 {
    public static void main(String[] args) {
        Tripé tripe = new Tripé( false, 120, 20, 45);
        System.out.println("Dobrado: " + tripe.isDobrado() + "\nAltura maxima: " + tripe.getAlturaMaxima() + "\nAltura minima: " + tripe.getAlturaMinima() + "\nAltura atual: " + tripe.getAlturaAtual());

    tripe.defineAltura( 60);
        System.out.println("\nNova altura: " + tripe.getAlturaAtual());

    tripe.dobrar();
        System.out.println("\nDobrado: " + tripe.isDobrado());

    tripe.guardar();
        System.out.println("\nAltura atual: " + tripe.getAlturaAtual() + " \nDobrado: " + tripe.isDobrado());

    tripe.prontoParaGuardar();
        System.out.println("\nO tripé esta pronto para guardar? " + tripe.prontoParaGuardar());

    tripe.usar();
        System.out.println("\nAltura atual: " + tripe.getAlturaAtual() + "\nDobrado: " + tripe.isDobrado());


    }

}
