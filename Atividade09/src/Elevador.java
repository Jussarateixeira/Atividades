
/**
 *
 * @author Jussara Teixeira
 * 
 *  * QUESTÃO 09________________________________________________________________________________________________
 9. Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um prédio. 
 A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o térreo), 
 capacidade do elevador e quantas pessoas estão presentes nele. A classe deve também disponibilizar os seguintes métodos:
 *Inicializar : que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores
sempre começam no térreo e vazio);
* Entrar : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
* Sair : para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
* Subir : para subir um andar (não deve subir se já estiver no último andar);
* Descer : para descer um andar (não deve descer se já estiver no térreo);
 ______________________________________________________________________________________________________________
 */
public class Elevador {
    private int andarAtual;
    private int totalDeAndares;
    private int capacidadeDoElevador;
    private int quantidadeDePessoas;

    // Construtor padrão
    public Elevador() {
        this.andarAtual = 0;
        this.quantidadeDePessoas = 0;
    }

    // Construtor com parâmetros
    public Elevador(int totalDeAndares, int capacidadeDoElevador) {
        this.andarAtual = 0;
        this.totalDeAndares = totalDeAndares;
        this.capacidadeDoElevador = capacidadeDoElevador;
        this.quantidadeDePessoas = 0;
    }

    // Inicializa o elevador
    public void inicializar(int totalDeAndares, int capacidadeDoElevador) {
        this.andarAtual = 0;
        this.totalDeAndares = totalDeAndares;
        this.capacidadeDoElevador = capacidadeDoElevador;
        this.quantidadeDePessoas = 0;
    }

    // Adiciona uma pessoa no elevador
    public void entrar() {
        if (quantidadeDePessoas < capacidadeDoElevador) {
            quantidadeDePessoas++;
        } else {
            System.out.println("ELEVADOR CHEIO!");
        }
    }

    // Remove uma pessoa do elevador
    public void sair() {
        if (quantidadeDePessoas > 0) {
            quantidadeDePessoas--;
        } else {
            System.out.println("ELEVADOR VAZIO!");
        }
    }

    // Sobe um andar
    public void subir() {
        if (andarAtual < totalDeAndares) {
            andarAtual++;
        } else {
            System.out.println("ULTIMO ANDAR!");
        }
    }

    // Desce um andar
    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
        } else {
            System.out.println("ELEVADOR NO TERREO!");
        }
    }

    // Métodos getter para acessar os atributos
    public int getAndarAtual() {
        return andarAtual;
    }

    public int getTotalDeAndares() {
        return totalDeAndares;
    }

    public int getCapacidadeDoElevador() {
        return capacidadeDoElevador;
    }

    public int getQuantidadeDePessoas() {
        return quantidadeDePessoas;
    }

    // Método toString para imprimir o estado do elevador
    @Override
    public String toString() {
        return "Elevador{" + "andarAtual=" + andarAtual + ", totalDeAndares=" + totalDeAndares + 
               ", capacidadeDoElevador=" + capacidadeDoElevador + ", quantidadeDePessoas=" + quantidadeDePessoas + '}';
    }
    
}
