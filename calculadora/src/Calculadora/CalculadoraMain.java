package Calculadora;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

public class CalculadoraMain {

    static int dia, mes, anio;

    public static void main(String args[]) throws IOException {
        String Mensaje = "";
        String op = "0";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        op = JOptionPane.showInputDialog("Seleccione una opcion:\n 1. Calculador\n 2.Cuadrilatero\n " +
                "3.Cuadrilatero Nuevo Constructor\n 4.Calendario\n 5. Hora");

        switch (op)
        {
            case "1":
                System.out.println("Ingrese un saludo: ");
                Mensaje = br.readLine();
                System.out.println(Mensaje);
                String Modelo;
                Modelo = JOptionPane.showInputDialog("Ingrese el modelo: ");
                ObjCalculadora objCal = new ObjCalculadora(); //Objeto para crear metodos con o sin parametros
                objCal.IngreseModelo(Modelo);
                break;

            case "2":
                int largo=0;
                String op1 = "0";
                largo = Integer.parseInt( JOptionPane.showInputDialog("Ingrese el largo del cuadrilaero") );
                objCuadrilatero objCua = new objCuadrilatero(largo);
                op1 = JOptionPane.showInputDialog("Seleccione la operacion: \n1. Calcular el area \n2. Calcular Perimetro");
                if (op1.equals("1"))
                {
                    objCua.calcularArea();
                    JOptionPane.showMessageDialog( null,
                            "El resultado del area es: " + objCua.getResArea() );
                }
                else {
                    if (op1.equals("2")) {
                        objCua.calcularPerimetro();
                        JOptionPane.showMessageDialog( null,
                                "El resultado del perimetro es: " + objCua.getResPerimetro() );
                    } else {
                        JOptionPane.showMessageDialog(null, "Opcion no existe");
                    }
                }
                break;

            case "3":
                objCuadrilatero objCuaN = new objCuadrilatero();
                break;

            case "4":
                iniciarHoy();
                JOptionPane.showMessageDialog(null, "El dia es: " + dia +
                        " El mes es: " + mes + " El anio es: " + anio);
                break;

            case "5":
                objCalendario cale = new objCalendario();
                JOptionPane.showMessageDialog(null, cale.toString());
                break;

            default:
                JOptionPane.showMessageDialog(null, "No existe esa opcion");
                break;
        }

    }

    public static void iniciarHoy()
    {
        GregorianCalendar cal = new GregorianCalendar();
        dia = cal.get(Calendar.DAY_OF_MONTH);
        mes = cal.get(Calendar.MONTH) + 1;
        anio = cal.get(Calendar.YEAR);
    }

}
