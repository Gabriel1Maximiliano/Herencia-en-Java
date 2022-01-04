package herencialearsoft;


public  class Circulo extends  Formas {
    private double radio;
    
    public Circulo(String color, Punto punto, String nombreDeLaForma,double radio) {
        super(color, punto, nombreDeLaForma);
        this.radio = radio;
    }

    @Override
    public void obtenerColor() {
        super.getColor();
    }

    @Override
    public void imprimir() {
        System.out.println("el circulo tiene las siguientes caracteristicas = " +super.toString()+this.toString()+" "+area());
        
    }

    @Override
    public void moverLaForma(double x, double y) {
        super.getPunto().getCoordenadaX();
        super.getPunto().getCoordenadaY();
    }

    @Override
    public void cambiarColor(String color) {
        super.setColor(color);
    }
   
    @Override
    public double area() {
        
        return  (3.14*radio*radio); 
          
    }

    

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
}
