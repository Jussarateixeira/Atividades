/**
 *****************************
 * @author Jussara Teixeira
 * ***************************
 */
package Visao;

import Servico.AgendaServico;

public class Principal {
    public static void main(String[] args) {
        AgendaServico agendaServico = new AgendaServico();
        
        agendaServico.armazenaPessoa("Jose", 25, 1.5);
        agendaServico.armazenaPessoa("Maria", 22, 1.6);
        agendaServico.armazenaPessoa("Ana", 18, 1.6);
        agendaServico.armazenaPessoa("Ivo", 19, 1.7);
        
        agendaServico.imprimeAgenda();
        
        System.out.println("Busca por Maria:");
        int index = agendaServico.buscaPessoa("Maria");
        agendaServico.imprimePessoa(index);
        
        System.out.println("Removendo Jose:");
        agendaServico.removePessoa("Jose");
        agendaServico.imprimeAgenda();
    }
}
