package sistemascoordenadas2d;

/* Bajo el sistema de coordenadas cartesianas referir un punto en un plano 2D
   con sus respectivas propiedades y valores. Dicho valores deben asignarse
   como una entrada por teclado de parte del usuario
*/

public class SistemasCoordenadas2D {

    public static void main(String[] args) {
        Cartesiana2D punto = new Cartesiana2D();
        Polar punto2 = new Polar();
        // Agregar las instrucciones necesarias para que se presente
        // en pantalla la solicitud de los datos y posteriormente
        // el usuario los ingrese desde el teclado
        punto.setX(4);
    }
}

class Cartesiana2D {
    private double x, y;
    
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public Cartesiana2D polar_cartesiana2D(double r, double angulo) {
        Cartesiana2D obj = new Cartesiana2D();
        x = r * Math.cos(angulo);
        y = r * Math.sin(angulo);
        return obj;
    }
    public Cartesiana2D polar_cartesiana2D(Polar p) {
        return polar_cartesiana2D(p.getRadio(), p.getAngulo());
    }
}

class Polar {
    private double radio;
    private double angulo;  //

    public Polar() {
    }
    
    public Polar(double radio, double angulo) {
        this.radio = radio;
        this.angulo = angulo;
    }
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(float angulo) {
        this.angulo = angulo;
    }
    
    public Polar cartesiana2D_polar(double x, double y) {
        double r = Math.sqrt(x * x + y * y);
        double ang = Math.atan(y / x);
        return new Polar(r, ang);
    }
    
    public Polar cartesiana2D_polar(Cartesiana2D c) {
        return new Polar(c.getX(), c.getY());
    }
}