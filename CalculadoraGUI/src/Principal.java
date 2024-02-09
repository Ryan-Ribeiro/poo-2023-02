import java.text.DecimalFormat;
import java.util.InputMismatchException;
import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        DecimalFormat dc = new DecimalFormat("0.00");
        Calc c = new Calc();
        boolean continuar = false;
        do {
            try {
                c.n1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Entre com o primeiro número:"));
                c.n2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Entre com o segundo número:"));
                if ((c.n1) < 0 || (c.n2) < 0) {
                    throw new NumeroNegativo("Numero negativo.");
                }
                if (c.n2 == 0) {
                    throw new ArithmeticException("Erro! Divisao por zero nao permitida.");
                }
                JOptionPane.showMessageDialog(null,
                        "Soma : " + dc.format(c.somar()));
                JOptionPane.showMessageDialog(null,

                        "Subtração : " + dc.format(c.diminuir()));

                JOptionPane.showMessageDialog(null,

                        "Multiplicação : " + dc.format(c.multiplicar()));

                JOptionPane.showMessageDialog(null,
                        "Divisão : " + dc.format(c.dividir()));
                continuar = true;
            } catch (NumberFormatException fe) {
                continuar = false;
                JOptionPane.showMessageDialog(null, "Formato inválido! digite valores inteiros.");
            } catch (InputMismatchException me) {
                continuar = false;
                JOptionPane.showMessageDialog(null, "Formato inválido! digite valores inteiros");
            } catch (NumeroNegativo ne) {
                continuar = false;
                JOptionPane.showMessageDialog(null, "Erro! Numeros negativos nao permitidos");
            } catch (ArithmeticException ae) {
                continuar = false;
                JOptionPane.showMessageDialog(null, "Erro! Divisao por zero nao permitida.");
            }
            finally {
                continuar = true;
            }
        } while (continuar != true);
    }
}