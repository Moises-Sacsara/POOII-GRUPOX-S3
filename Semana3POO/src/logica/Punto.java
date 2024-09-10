package logica;

public class Punto {
    private int coordenadaX;
    private int coordenadaY;

    public Punto() {
    }

    
    public Punto(int coordenadaX, int coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
    
    //Utilizando la formula euclidiana pero entre 2 puntos
    public double getDistancia(Punto otroPunto) {
        int x = this.coordenadaX - otroPunto.getCoordenadaX();
        int y = this.coordenadaY - otroPunto.getCoordenadaY();
        return Math.sqrt(x*x +y*y);
    }
    
    public Punto calcularPuntoMasCercano(Punto[] otrosPuntos){
        Punto _masCercanoPunto = null;
        double minDistancia = Double.MAX_VALUE;
        double actualDistancia;
        
        for(int i=0; i<otrosPuntos.length; i++){
            actualDistancia = this.getDistancia(otrosPuntos[i]);
            if (actualDistancia <= minDistancia){
                minDistancia=actualDistancia;
                _masCercanoPunto = otrosPuntos[i];
            }
        }
        return _masCercanoPunto;
    }
    
    @Override
    public String toString(){
        return "("+ coordenadaX +","+ coordenadaY +")";
    }
}
