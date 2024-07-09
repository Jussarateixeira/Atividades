/**
 *****************************
 * @author Jussara Teixeira
 * ***************************
 */
package Servico;

import Modelo.Agenda;
public class AgendaServico {
    private Agenda agenda;

    public AgendaServico() {
        this.agenda = new Agenda();
    }

    public void armazenaPessoa(String nome, int idade, double altura){
        agenda.armazenaPessoa(nome, idade, altura);
    }

    public void removePessoa(String nome){
        agenda.removePessoa(nome);
    }

    public int buscaPessoa(String nome){
        return agenda.buscaPessoa(nome);
    }

    public void imprimeAgenda(){
        agenda.imprimeAgenda();
    }

    public void imprimePessoa(int index){
        agenda.imprimePessoa(index);
    }
}
