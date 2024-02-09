public class Retangulo extends FormaGeometrica{
    private double base;
    private double altura;
    public Retangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }
    @Override
    public double calcularArea() {
        return base * altura;
    }
}
