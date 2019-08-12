package indicemasa.calcularmasa;

public class CalcularLogica extends Calcularmasa{

    public double totalimc()
    {

        return this.getPeso()/(this.getestatura()*this.getestatura());
    }
}

