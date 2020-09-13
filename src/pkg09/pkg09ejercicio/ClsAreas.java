/*
Clase con los métodos para hallar algunas áreas determinadas.
 */
package pkg09.pkg09ejercicio;

/**
 *
 * @author Juan Pablo
 */
public class ClsAreas 
{
    public double areaCirculo(double r)
    {
        double PI, acir, rc;
        
        PI = Math.PI;
        rc = (int) Math.pow(r, 2);
        acir = PI * rc;
        
        return acir;
    }
    
    public double areaCuadrado(double l)
    {
        double lc, arcua;
        lc = Math.pow(l, 2);
        arcua = lc;
        
        return arcua;
    }
    
    public double areaRectangulo(double base, double altura)
    {
          double areaR;
          areaR = base * altura;
          
          return (areaR);
    }
    
    public double areaTriangulo(double base, double altura)
    {
        ClsAreas areasc = new ClsAreas();
        double arear, areaT;
        arear = areasc.areaRectangulo(base, altura);
        areaT = arear / 2;
        
        return areaT;
    }
}
