
package herencialearsoft;


public class Elipse extends Formas {
    private double R;
    private double r;
    

    public Elipse(String color, Punto punto, String nombreDeLaForma,double R,double r) {
        super(color, punto, nombreDeLaForma);
        this.R = R;
        this.r = r;

   
        
    }
    public Elipse(String color, Punto punto, String nombreDeLaForma){
        super(color, punto, nombreDeLaForma);
        
    }
  
    @Override
    public double area(){
        return (3.*R*r);
    }

    @Override
    public void cambiarColor(String color) {
         super.setColor(color);
    }

    @Override
    public void moverLaForma(double x, double y) {
        super.getPunto().getCoordenadaX();
        super.getPunto().getCoordenadaY();
    }

    @Override
    public void imprimir() {
        System.out.println(" elipse " +super.toString()+" "+area()); 
    }

    @Override
    public void obtenerColor() {
        super.getColor();
    
}

   
}