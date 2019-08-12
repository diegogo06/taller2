package indicemasa.calcularmasa;
public class Calcularmasa {

    private double peso;
    private double estatura;

    public Calcularmasa(double peso, double estatura) {
        this.estatura = estatura;
        this.peso = peso;
    }

    public Calcularmasa() {
            this.estatura = 0;
            this.peso = 0;

    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getestatura() {
        return estatura;
    }

    public void setestatura(double estatura) {
        this.estatura = estatura;
    }
}
