import java.lang.Math;

public class TorreHanoi {
    private int numDisco;

    public int getNumDisco() {
        return numDisco;
    }

    public void setNumDisco(int numDisco) {
        this.numDisco = numDisco;
    }
    public double qtdMovimento(int numDisco) {
        return Math.pow(2, numDisco) - 1;
    }
}
