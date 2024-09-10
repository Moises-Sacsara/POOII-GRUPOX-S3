package logica;

public class Triangulo extends FiguraGeometrica implements Shape{
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;

    //Constructor sin parametros
    public Triangulo(String nombreFigura) {    
        super(nombreFigura);
    }

    //Constructor con parametros, llamando a la super clase
    public Triangulo(String nombreFigura, Punto punto1, Punto punto2, Punto punto3) {
        super(nombreFigura);
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }
    
    @Override
    public double calcularArea() {
        double lado1 = punto1.getDistancia(punto2);
        double lado2 = punto2.getDistancia(punto3);
        double lado3 = punto3.getDistancia(punto1);
        //Hallamos el semiperimetro
        double semiperimetro = (lado1+lado2+lado3)/2;
        //Usando la formula de heron
        return Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
    }
    //Comprobamos si la figura es regular
    @Override
    public boolean esRegular() {
        double lado1 = punto1.getDistancia(punto2);
        double lado2 = punto2.getDistancia(punto3);
        double lado3 = punto3.getDistancia(punto1);
        return lado1 == lado2 && lado2 == lado3;
    }

    @Override
    public double obtenerPerimetro() {
        double lado1=this.getPunto1().getDistancia(this.getPunto2());
        double lado2=this.getPunto2().getDistancia(this.getPunto3());
        double lado3=this.getPunto3().getDistancia(this.getPunto1());
        return lado1+lado2+lado3;
    }
    
    
    @Override
    public String toString() {
        return "-------------- "+getNombreFigura()+" --------------"+":"+"\n"
                + "Punto 1: "+getPunto1().toString() +"\n"
                + "Punto 2: "+getPunto2().toString() + "\n"
                + "Punto 3: "+getPunto3().toString()+"\n"
                + "Regular: "+esRegular()+"\n"
                + "Area: "+calcularArea()+"\n"
                + "Perimetro: "+obtenerPerimetro();
    }
}
