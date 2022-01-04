
package herencialearsoft;


public class Rectangulo extends Formas {
    
    private double ladoMayor;
    private double ladoMenor;

    public Rectangulo(String color, Punto punto, String nombreDeLaForma, double ladoMayor, double ladoMenor) {
        super(color, punto, nombreDeLaForma);
        this.ladoMayor = ladoMayor;
        this.ladoMenor = ladoMenor;
    }
    public Rectangulo(String color, Punto punto, String nombreDeLaForma){
        super(color , punto , nombreDeLaForma);
        
    }

    @Override
    public void imprimir() {
        System.out.println("es un rectangulo con las sig carcateristicas "+this.toString()+"lado mayor "+ladoMayor+" "+"lado menor"+ladoMenor+" "+area());
       
    }

    
    
   
public double perimetro(){
    return (2*ladoMayor)+(2*ladoMenor);
}
    @Override
   public void obtenerColor(){
       
        System.out.println("el color es  = "+super.getColor());
   }
    @Override
   public void cambiarColor(String color){
       super.setColor(color);
       
   }
    @Override
   public void moverLaForma(double x , double y){
       super.getPunto().getCoordenadaY();
       super.getPunto().getCoordenadaX();
       
   }
   public double cambioEscala(double x){
       return x*(2*ladoMayor)+x*(2*ladoMenor);
       
       
   }

    @Override
    public String toString() {
        return super.toString() ;
    }

    @Override
    public double area() {
        
        return (ladoMayor*ladoMenor);
        
    }
   
}
