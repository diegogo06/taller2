package salario;
import salario.string.Salariostring;
import javax.swing.*;

public class Salariologica {

    private  static int[]v;
    private  static  int mayor = 0;
    private  static int menor = 99999999;



    public void generar(){
        int tam;

        tam=(Integer.parseInt(JOptionPane.showInputDialog(null,
                Salariostring.MENSAJE_CANTIDAD_SALARIO.getMensaje())));

        JOptionPane.showMessageDialog(null,Salariostring.MENSAJE_REQUERIMIENTO.getMensaje());
        v = new int[tam];

        // Llenar Vector
        for(int i = 0; i < v.length; i++)

            v[i] = Integer.parseInt(JOptionPane.showInputDialog(Salariostring.INGRESE_SALARIO.getMensaje()+i+Salariostring.INGRESE_SALARIO2.getMensaje()));
    }

    // Numero Menor
    public static int   nMenor(){
        for(int i = 0; i < v.length; i++){
            if ( v[i] < menor){
                menor = v[i];
            }
        }
        return menor;
    }

    // Numero Mayor
    public static int nMayor(){
        for(int i = 0; i < v.length; i++){
            if ( v[i] > mayor){
                mayor = v[i];
            }
        }
        return mayor;
    }
    // Sumatoria vectore
    public static int sumaMax()
    {
        int maxSuma = 0;
        for (int i = 0; i < v.length; i++)
        {
            maxSuma+=v[i];
        }
        return maxSuma;
    }

    public static double promSalario()
    {
        int maxSuma = 0;
        for (int i = 0; i < v.length; i++)
        {
            maxSuma+=v[i];
        }
        return ( maxSuma/v.length) ;

    }




    public static void main(String[] args) {
        Salariologica sl= new Salariologica();
        sl.generar();

    }
}
