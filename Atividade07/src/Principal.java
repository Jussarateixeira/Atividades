
/**
 *
 * @author Jussara Teixeira
 */
public class Principal {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        ControleRemoto controle = new ControleRemoto(tv);

        System.out.println(tv);

        controle.aumentarVolume();
        controle.aumentarCanal();
        System.out.println(tv);

        controle.trocarCanal(5);
        controle.diminuirVolume();
        System.out.println(tv);

        System.out.println("Volume atual: " + controle.consultarVolume());
        System.out.println("Canal atual: " + controle.consultarCanal());
    }
}

