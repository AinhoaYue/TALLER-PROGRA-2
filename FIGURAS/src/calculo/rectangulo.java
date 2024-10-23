package calculo;

public class rectangulo extends figuras{

    private double largo;
    private double ancho;

    public rectangulo(double largo, double ancho){

        this.largo=largo;
        this.ancho=ancho;

    }

    @Override
    public double calculoArea(){

        return largo*ancho;

    }

    @Override
    public double calculoPerimetro(){

        return 2*(largo+ancho);
    }
}
