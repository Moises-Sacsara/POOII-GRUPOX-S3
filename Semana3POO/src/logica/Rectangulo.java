package logica;

public class Rectangulo extends Cuadrilatero implements Shape{

    public Rectangulo(Punto vertice1, Punto vertice2, Punto vertice3, Punto vertice4, String nombreFigura) {
        super(vertice1, vertice2, vertice3, vertice4, nombreFigura);
    }

    @Override
    public double calcularArea() {
        double base = this.getVertice1().getDistancia(this.getVertice2());
        double altura = this.getVertice1().getDistancia(this.getVertice4());
        return base*altura;
    }

    @Override
    public boolean esRegular() {
        return super.esRegular();
    }

    @Override
    public double obtenerPerimetro() {
        double lado1 = this.getVertice1().getDistancia(this.getVertice2());
        double lado2 = this.getVertice1().getDistancia(this.getVertice4());
        return 2*(lado1+lado2);
    }
    

    @Override
    public String toString(){
        return "-------------- "+super.getNombreFigura()+" --------------"+": \n"
                + "Punto 1: "+super.getVertice1()+"\n"
                + "Punto 2: "+super.getVertice2()+"\n"
                + "Punto 3: "+super.getVertice3()+"\n"
                + "Punto 4: "+super.getVertice4()+"\n"
                + "Area: "+calcularArea()+"\n"
                + "Regular: "+esRegular()+"\n"
                + "Perimetro: "+obtenerPerimetro();
    }
    
    
}
