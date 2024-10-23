package Calculadora;

import javax.swing.*;

public class ObjCalculadora {

    //variables o atributos globales se utiliza en toda la clase
    private String Modelo;
    String operacion;
    double numero1, numero2, resultado;
    int numInt = 0;

    public void IngreseModelo(String Modelo)
    {
        this.Modelo = Modelo;
        IngresoValores();
    }

    public void IngresoValores()
    {
        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 1"));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 2"));
        operacion = JOptionPane.showInputDialog("Ingrese la operacion");

        //Opcion 1
        resultado = this.CalculaValores();
        JOptionPane.showMessageDialog(null, "El modelo es: " + Modelo);
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);

        //Opcion 2
        JOptionPane.showMessageDialog(null, "El resultado es: " + this.CalculaValores());
    }

    private double CalculaValores()
    {
        double resultadoOperacion = 0;

        switch (operacion){
            case "+":
                resultadoOperacion = numero1 + numero2;
                break;
            case "-":
                resultadoOperacion = numero1 - numero2;
                break;
            case "*":
                resultadoOperacion = numero1 * numero2;
                break;
            case "/":
                if(numero2 == 0)
                {
                    JOptionPane.showMessageDialog(null,"No se puede dividir para 0");
                }
                else
                {
                    resultadoOperacion = numero1 / numero2;
                }
                break;
            default:
        }

        return resultadoOperacion;
    }

    public String Par_Impar()
    {
        String mensaje = "";

        if((numInt % 2) == 0)
        {
            mensaje = "El numero es par";
        }
        else
        {
            mensaje = "El numero es impar";
        }

        return mensaje;
    }

}
