public class Triangulo extends FormaGeometrica{
    private double base;
    private double altura;
    public Triangulo(double base, double altura) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
