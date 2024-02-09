import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(12.3);

        Retangulo retangulo = new Retangulo(13, 26.5);

        Triangulo triangulo = new Triangulo(13, 75.4);

        FormaGeometrica[] formas = {circulo, retangulo, triangulo};
        double areaTotal = CalculadoraArea.calcularAreaTotal(formas);
        String num = String.format("%.2f", areaTotal);
        System.out.println("Area total: " + num);
    }
}