package semana3poo;

import java.util.ArrayList;
import java.util.List;
import logica.Circulo;
import logica.FiguraGeometrica;
import logica.Punto;
import logica.Rectangulo;
import logica.SuperficiePlana;
import logica.Triangulo;


public class Semana3POO {

    public static void main(String[] args) {
        FiguraGeometrica cir = new Circulo(4, new Punto(5, 6),"Circulo");
        System.out.println(cir.toString());
      //Objeto rectangulo para un cuadrado  
      //Rectangulo rect = new Rectangulo(new Punto(1, 1), new Punto(1, 4), new Punto(5, 4), new Punto(5, 1), "rectangulo");
        FiguraGeometrica rect = new Rectangulo(new Punto(2, 2), new Punto(2, 6), new Punto(7, 6), new Punto(7, 2), "rectangulo");
        System.out.println(rect.toString());
        
        Triangulo tria = new Triangulo("Triangulo", new Punto(1, 1), new Punto(4, 1), new Punto(2, 5));
        System.out.println(tria.toString());
        
        //Implementacion de la clase Superficieplana
        List<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(cir);
        figuras.add(rect);
        figuras.add(tria);
        
        SuperficiePlana ficie = new SuperficiePlana(figuras);
        ficie.devolverArea();
        
    }
    
    
    
}
