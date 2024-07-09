/**
 *****************************
 * @author Jussara Teixeira
 * ***************************
 */
public class Principal {
public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setNome("Maria");
        c1.setCpf("000.000.000-00");
        c1.setAnoDoNascimento(2000);
        c1.setTelefone("0101-0101");
        c1.setSexo("Feminino");
        c1.imprimirDados();
        System.out.println("Idade: " + c1.calcularIdade());
        System.out.println("Maioridade: " + c1.maiorOuMenorDeIdade());
    }
}

    