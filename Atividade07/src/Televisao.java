
/**
 *****************************
 * @author Jussara Teixeira
 * ***************************
 * QUESTÃO 07____________________________________________________________________________
 * 7. Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o
 * volume e trocar os canais da televisão. O controle de volume permite:
 * aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
 * aumentar e diminuir o número do canal em uma unidade trocar para um canal indicado;
 * consultar o valor do volume de som e o canal selecionado.
 _________________________________________________________________________________________
 */
class Televisao {
    private int volume;
    private int canal;

    public Televisao() {
        this.volume = 20;  // Definindo um valor inicial para o volume
        this.canal = 5;    // Definindo um valor inicial para o canal
    }
    //Definindo os get e set
    public int getVolume() {
        return volume;
    }
   // Métodos para obter e definir o volume e o canal 
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }
    // Representação em string do estado atual da TV.
    @Override
    public String toString() {
        return "Volume: " + volume + ", Canal: " + canal;
    }
}
