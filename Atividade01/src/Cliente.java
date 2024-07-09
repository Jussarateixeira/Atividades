/**
 ***************************
 * @author Jussara Teixeira
 * *************************
 * QUESTÃO 01 _________________________________________________________________________
 * 1. Crie uma classe para representar um cliente,com os atributos nome, cpf, telefone, 
 * sexo, ano de nascimento. Crie os métodos para:
 * imprimir todos dados do cliente.
 * calcular a idade do cliente
 * verificar se ele é maior ou menor de idade
 * ____________________________________________________________________________________
 */

 public class Cliente {
    private String nome;
    private String cpf; 
    private String telefone;
    private String sexo;
    private int anoDoNascimento;
    
    //O construtor vazio é útil para criar objetos sem argumentos.
    public Cliente(){
        
    }
    public Cliente(String nome, String cpf, int anoDoNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.anoDoNascimento = anoDoNascimento;
    }
   // Método para imprimir dados
    public void imprimirDados() {
    System.out.println("Nome: " + nome + ", CPF: " + cpf + ", Telefone: " + telefone + 
            ", Sexo: " + sexo + ", Ano do Nascimento: " + anoDoNascimento);
}
    public int calcularIdade(){
        return 2024 - anoDoNascimento;
    }
    public String maiorOuMenorDeIdade(){
        if(calcularIdade()>= 18){
            return "Maior de Idade";
        }
        else{
            return "Menor de Idade";
        }
    }
    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
   
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getAnoDoNascimento() {
        return anoDoNascimento;
    }

    public void setAnoDoNascimento(int anoDoNascimento) {
        this.anoDoNascimento = anoDoNascimento;
    }
    
 }
