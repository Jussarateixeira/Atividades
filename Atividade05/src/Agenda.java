/**
 *
 * @author Jussara Teixeira
 * QUESTÃO 05 ___________________________________________________________________________________________________________
 * 5. Sabendo-se que a classe Agenda terá um contato, 
 * será realizado uma associação. Na classe Agenda teremos um atributo 
 * contato do tipo Contato. 
 * Implemente os métodos getter e setter do tipo Contato na classe Agenda. 
 * E por fim na classe principal instancie os objetos 
 * do tipo agenda e contato, atribua os valores desejados e imprima.
 ________________________________________________________________________________________________________________________
 */
class Agenda {
    private Contato contato;

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public void imprimirDados() {
        if (contato != null) {
            contato.imprimirDados();
        } else {
            System.out.println("Você não tem contato na agenda.");
        }
    }
}