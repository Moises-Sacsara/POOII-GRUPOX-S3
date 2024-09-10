package logica;

public class Circulo extends FiguraGeometrica implements Shape{
    private int radio;
    Punto punto;

    public Circulo(int radio, Punto punto, String nombreFigura) {
        super(nombreFigura);
        this.radio = radio;
        this.punto = punto;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Punto getPunto() {
        return punto;
    }

    public void setPunto(Punto punto) {
        this.punto = punto;
    }

    

    @Override
    public double calcularArea() {
        double area=this.radio*this.radio*Math.PI;
        return area;
    }

    @Override
    public boolean esRegular() {
        boolean circulo=true;
        return circulo;
    }

    @Override
    public double obtenerPerimetro() {
        return 2*Math.PI*this.radio;
    }
    
    
    @Override
    public String toString(){
        return "-------------- "+super.getNombreFigura()+" --------------"+"\n"
                + "Punto: "+punto.toString()+"\n"
                + "Radio: "+this.radio+"\n"
                + "Area: "+this.calcularArea()+"\n"
                + "Regular: "+this.esRegular()+"\n"
                + "Perimetro: "+obtenerPerimetro();
    }
  
    
    
    
    
}
