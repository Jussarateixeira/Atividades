/**
 *
 * @author Jussara Teixeira
 */

public class Principal {
    public static void main(String[] args) {
        // Instanciando objetos da classe Agenda e Contato
        Agenda agenda = new Agenda();
        Contato contato = new Contato("Telefone Fixo", "(88) 93534-5678");

        // Associando o contato à agenda
        agenda.setContato(contato);

        // Imprimindo os dados do contato
        agenda.imprimirDados();
    }
}
