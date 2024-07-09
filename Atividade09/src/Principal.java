/**
 * @author Jussara Teixeira
 **/

public class Principal {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(15, 5); // 15 andares (excluindo o térreo), capacidade de 5 pessoas

        System.out.println(elevador);

        // Tentando adicionar 6 pessoas (1 a mais que a capacidade)
        for (int i = 0; i < 6; i++) {
            elevador.entrar();
        }

        System.out.println(elevador);

        // Simulando a saída de 2 pessoas
        for (int i = 0; i < 2; i++) {
            elevador.sair();
        }

        System.out.println(elevador);

        // Simulando a subida até o último andar
        for (int i = 0; i < 16; i++) {
            elevador.subir();
        }

        System.out.println(elevador);

        // Simulando a descida até o térreo
        for (int i = 0; i < 16; i++) {
            elevador.descer();
        }

        System.out.println(elevador);
    }
}
