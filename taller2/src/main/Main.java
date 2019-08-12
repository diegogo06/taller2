package main;
import indicemasa.calcularmasa.CalcularLogica;
import signoZodiacal.ZodiacalLogica;
import static signoZodiacal.ZodiacalString.*;
import static indicemasa.constantes.MasaString.*;
import javax.swing.*;
import static menu.constantes.MenuString.*;
import salario.Salariologica;
import static salario.string.Salariostring.*;
public class Main {
    public static void main(String[] args) {

        //menu
        String menu=JOptionPane.showInputDialog(null,MENU.getMensaje()+"\n"+SELECCION.getMensaje()
                +"\n"+ IMC1.getMensaje()+"\n"+SIGNO_ZODIACAL.getMensaje()+"\n"+SALARIO.getMensaje()+"\n"+CREAR_VECTOR.getMensaje()
        +"\n" +SALIR.getMensaje());
        int m =Integer.parseInt(menu);
        switch (m) {

            //punto 1
            case 1:
            CalcularLogica calcularlogica = new CalcularLogica();

            String peso = JOptionPane.showInputDialog(null, SOLICITUD_PESO.getMensaje());
            String estatura = JOptionPane.showInputDialog(null, SOLICITUD_ALTURA.getMensaje());

            calcularlogica.setPeso(Double.parseDouble(peso));
            calcularlogica.setestatura(Double.parseDouble(estatura));
            JOptionPane.showMessageDialog(null, RESPUESTA_IMC.getMensaje() + calcularlogica.totalimc() + IMC.getMensaje());
break;
//punto 2
            case 2:


                ZodiacalLogica zodiacalLogica = new ZodiacalLogica();
                String mes=JOptionPane.showInputDialog(null,PETICION_MES.getMensaje());
                String dia =JOptionPane.showInputDialog(null,PETICION_DIA.getMensaje());
               zodiacalLogica.setDia(Integer.parseInt(dia));
               zodiacalLogica.setMes(Integer.parseInt(mes));
               JOptionPane.showMessageDialog(null,zodiacalLogica.zodiacal());




                break;


            case 3:
                Salariologica salariologica = new Salariologica();

                salariologica.generar();

                JOptionPane.showMessageDialog(null, MENSAJE_SALARIO_MAYOR.getMensaje()+
                        (Salariologica.nMayor()));

                JOptionPane.showMessageDialog(null, SALARIO_MENOR.getMensaje()
                        +(salariologica.nMenor()));


                JOptionPane.showMessageDialog(null, TOTAL_SALARIO.getMensaje()
                        +salariologica.sumaMax());

                JOptionPane.showMessageDialog(null, PROMEDIO.getMensaje()
                       +(salariologica.promSalario()));
                break;
            case 4:



                break;
        }




        }

    }
