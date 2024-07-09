package Visao;

import Modelo.Contato;

/**
 *
 * @author Jussara Teixeira
 */
public class Principal {
    public static void main(String[] args) {
        
        // Instanciando objetos da classe Agenda
        Contato contato1 = new Contato("Celular", "(88) 99934-5678");
        Contato contato2 = new Contato("Telefone Fixo", "(88) 93534-5678");

        // Imprimindo os dados dos contatos
        
        contato1.imprimirDados();
        contato2.imprimirDados();
    }
}

