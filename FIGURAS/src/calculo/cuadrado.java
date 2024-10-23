package calculo;

public class cuadrado extends figuras{

    private  double lado;

    public cuadrado(double lado){

        this.lado=lado;

    }

    @Override
    public double calculoArea(){

        return lado/lado;

    }

    @Override

    public double calculoPerimetro(){

        return 4*lado;

    }

}
