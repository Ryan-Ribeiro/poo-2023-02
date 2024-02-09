import java.io.Serializable;
class MinhaClasse implements Serializable {
    private int numero;
    private String texto;

    public MinhaClasse(int numero, String texto) {
        this.numero = numero;
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "MinhaClasse [numero=" + numero + ", texto=" + texto + "]";
    }
}
// Classe que implementa Serializable
