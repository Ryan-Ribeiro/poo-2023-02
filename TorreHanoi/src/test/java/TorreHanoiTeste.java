import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TorreHanoiTeste {
    @Test
    void qtdMovimento1() {
        TorreHanoi hanoi = new TorreHanoi();
        double resultado = hanoi.qtdMovimento(-1); // valor negativo
        assertEquals(12, resultado);
    }

    @Test
    void qtdMovimento2() {
        TorreHanoi hanoi = new TorreHanoi();
        double resultado = hanoi.qtdMovimento(0); // valor nulo
        assertEquals(12, resultado);
    }

    @Test
    void qtdMovimento3() {
        TorreHanoi hanoi = new TorreHanoi();
        double resultado = hanoi.qtdMovimento(64); // valor tão grande quanto eu queira
        assertEquals(12, resultado);
    }
}
