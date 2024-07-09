/**
 *
 * @author Jussara Teixeira
 */
public class Principal {
    public static void main(String[] args) {
        // Instanciando objetos da classe Agenda
        Agenda contato1 = new Agenda("Maria", "(88) 1234-5678");
        Agenda contato2 = new Agenda("Samuel", "(85) 9876-5432");

        // Imprimindo os dados dos contatos
        System.out.println("Contato 1:");
        contato1.imprimirDados();

        System.out.println("\n Contato 2:");
        contato2.imprimirDados();
    }
}

