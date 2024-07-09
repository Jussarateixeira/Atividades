/**
 *****************************
 * @author Jussara Teixeira
 * ***************************
 * QUESTÃO 08________________________________________________________________________________________________
 * 8. Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes operações:
 * void armazenaPessoa(String nome, int idade, float altura);
 * void removePessoa(String nome);
 * int buscaPessoa(String nome);
 * void imprimeAgenda(); // imprime os
 * dados de todas as pessoas da agenda
 * void imprimePessoa(int index);
 * ______________________________________________________________________________________________________________
 */
package Modelo;
//Bibliotecas do Java para manipulação de listas

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Pessoa> pessoas;

    public Agenda() {
        this.pessoas = new ArrayList<>(10);
    }

    //Método para armazenar pessoas
    //Armazena uma pessoa na agenda se ainda houver espaço
    public void armazenaPessoa(String nome, int idade, double altura) {
        if (pessoas.size() < 10) {
            Pessoa pessoa = new Pessoa(nome, idade, altura);
            pessoas.add(pessoa);
        } else {
            System.out.println("A AGENDA ESTÁ CHEIA!");
        }
    }
    //Método para remover pessoas
    //Remove uma pessoa da agenda pelo nome
    public void removePessoa(String nome) {
        Pessoa pessoaParaRemover = null;
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getNome().equals(nome)) {
                pessoaParaRemover = pessoas.get(i);
            }
        }
        if (pessoaParaRemover != null) {
            pessoas.remove(pessoaParaRemover);
        } else {
            System.out.println("Pessoa não encontrada na agenda.");
        }
    }
    //Método para buscar pessoas
    //Busca uma pessoa pelo nome e retorna o índice da pessoa na lista
    public int buscaPessoa(String nome) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getNome().equals(nome)) {
                return i;
            }
        }
        return -1;
    }
    //Métodos para impimir informações da agenda
    //Imprime as informações de todas as pessoas na agenda.
    public void imprimeAgenda() {
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println(pessoas.get(i));
        }
    }
    //Imprime as informações de uma pessoa específica, de acordo com seu índice na lista
    public void imprimePessoa(int index) {
        if (index >= 0 && index < pessoas.size()) {
            System.out.println(pessoas.get(index));
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
