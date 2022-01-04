package herencialearsoft;

public class HerenciaLearSoft {

    public static void main(String[] args) {
        //Formas forma1 = new Rectangulo("verde", new Punto(3,2),"rectangulo", 3, 6);
        //forma1.toString();
        Rectangulo rectangulo = new Rectangulo("rojo", new Punto(5, 6), "triangulo", 2, 3);
        Formas circulo = new Circulo("amarillo", new Punto(7, 8), "circulo", 3);
        Formas cuadrado = new Cuadrado("lila", new Punto(3, 2), "cuadrado", 4);
        Formas elipse = new Elipse("viooleta", new Punto(6, 8), "elipse", 2, 7);
        Formas vector[] = new Formas[4];
        vector[0] = rectangulo;
        vector[1] = circulo;
        vector[2] = cuadrado;
        vector[3] = elipse;
        for (int i = 0; i < 4; i++) {
            vector[i].cambiarColor("rojo");
            vector[i].moverLaForma(5, 5);
        }
        for (int j = 0; j < 4; j++) {
            vector[j].imprimir();

        }
        double mayor;
        int indice=0;
        mayor = vector[0].area();
        for (int j = 0; j < 4; j++) {
       if(vector[j].area()>mayor){
           mayor = vector[j].area();
           indice = j;
        }
            
        }
System.out.println("la fgura de mayor area es = " + vector[indice]+vector[indice].area());

    }
}
