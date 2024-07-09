
/**
 *
 * @author Jussara Teixeira
 */
class ControleRemoto {
    private Televisao televisao;//Instância da classe Televisao.
     //Construtor
    //Recbendo uma instância de Televisao como parâmetro e a atribundo ao atributo televisao da classe
    public ControleRemoto(Televisao televisao) {
        this.televisao = televisao;
    }
    // Manipulando o volume e o canal
    public void aumentarVolume() {
        televisao.setVolume(televisao.getVolume() + 1);
    }

    public void diminuirVolume() {
        televisao.setVolume(televisao.getVolume() - 1);
    }

    public void aumentarCanal() {
        televisao.setCanal(televisao.getCanal() + 1);
    }

    public void diminuirCanal() {
        televisao.setCanal(televisao.getCanal() - 1);
    }

    public void trocarCanal(int novoCanal) {
        televisao.setCanal(novoCanal);
    }

    public int consultarVolume() {
        return televisao.getVolume();
    }

    public int consultarCanal() {
        return televisao.getCanal();
    }
}
