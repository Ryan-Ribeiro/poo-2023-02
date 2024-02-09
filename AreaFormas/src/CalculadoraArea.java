public class CalculadoraArea {
    public static double calcularAreaTotal(FormaGeometrica[] formasGeometricas) {
        double areaTotal = 0;
        for(FormaGeometrica forma: formasGeometricas){
            areaTotal += forma.calcularArea();
        }
        return areaTotal;
    }
}
