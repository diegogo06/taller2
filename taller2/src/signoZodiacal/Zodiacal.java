package signoZodiacal;

import java.text.DateFormat;
import java.util.Date;

public class Zodiacal {
    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer d) {
        this.dia = d;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer m) {
        this.mes = m;
    }




    private Integer dia;
    private Integer mes;



    public Zodiacal(Integer d, Integer m) {
        this.dia = d;
        this.mes = m;

    }
    public Zodiacal() {
        this.dia = 0;
        this.mes = 0;
    }

}

