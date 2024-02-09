public class Pessoa {
    private String nome;
    private double salario;
    private int idade;
    private int numDependentes;

    public double calculaImposto(double salario, int idade, int numDependentes, double imposto) {
        double deducaoDependentes = 179.71 * numDependentes;

        if (idade > 65)
            return imposto = 0;

        if (idade < 65) {
            switch (salario) {
                case (salario < 1787.77):
                    return salario = 0;
                case ((salario >= 1787.78) && (salario <= 2679.29)):
                    double i = 7.5 / 100;
                    return imposto = salario * (i) - deducaoDependentes;
                case ((salario >= 2.679.30) && (salario <= 3.572.43)):
                    double i = 15/100;
                    return imposto = salario * i - deducaoDependentes;
                case ((salario >= 3.572.44) && (salario <= 4.463.81)):
                    double i = 22.5/100;
                    return imposto = salario * i - deducaoDependentes;
                case (salario >= 4.463.81):
                    double i = 27.5/100;
                    return imposto = salario * i - deducaoDependentes;
            }

        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumDependentes() {
        return numDependentes;
    }

    public void setNumDependentes(int numDependentes) {
        this.numDependentes = numDependentes;
    }
}
