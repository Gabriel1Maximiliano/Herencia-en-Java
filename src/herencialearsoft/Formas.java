
package herencialearsoft;


public abstract class Formas {
    
    private String color;
    private Punto punto;
    private String nombreDeLaForma;

    public Formas(String color, Punto punto, String nombreDeLaForma) {
        this.color = color;
        this.punto = punto;
        this.nombreDeLaForma = nombreDeLaForma;
    }
    
    public abstract void imprimir();
    
    public abstract void obtenerColor();
    
    public abstract double area();
    
    
    public abstract void cambiarColor(String color);
    
    public abstract void moverLaForma(double x , double y);

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Punto getPunto() {
        return punto;
    }

    public void setPunto(Punto punto) {
        this.punto = punto;
    }

    public String getNombreDeLaForma() {
        return nombreDeLaForma;
    }

    public void setNombreDeLaForma(String nombreDeLaForma) {
        this.nombreDeLaForma = nombreDeLaForma;
    }

    @Override
    public String toString() {
        return "color=" + color + ", punto=" + punto + ", nombreDeLaForma= "+nombreDeLaForma + " ";
    }
    
}
