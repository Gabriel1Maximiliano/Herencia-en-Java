
package herencialearsoft;


public class Cuadrado extends Formas {
    private double lado;

    public Cuadrado(String color, Punto punto, String nombreDeLaForma, double lado) {
        super(color, punto, nombreDeLaForma);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return   "lado=" + lado + '}';
    }

   

    @Override
    public void moverLaForma(double x, double y) {
        super.getPunto().getCoordenadaY();
       super.getPunto().getCoordenadaX();
    }

    @Override
    public void cambiarColor(String color) {
        super.setColor(color);

    }

    @Override
    public double  area(){
         return lado*lado;
    }
    

    
   

    @Override
    public void imprimir() {
        String res;
        
        System.out.println("el cuadrado tiene estas caracteristicas = " + super.toString()+ "su lado es"+lado+" "+area());
    
    }

    @Override
    public void obtenerColor() {
        super.getColor();
    }
    
}

