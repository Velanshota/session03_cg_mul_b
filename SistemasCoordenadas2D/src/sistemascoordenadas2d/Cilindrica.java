
package sistemascoordenadas2d;

public class Cilindrica {
    private double radio;
    private double angulo;
    private double z;

    public Cilindrica(){
        
    }
    
    public Cilindrica(double radio, double angulo, double z) {
        this.radio = radio;
        this.angulo = angulo;
        this.z = z;
    }
    class Cartesiana3D {
    private double x, y,z;
    
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
    public double getZ() {
            return z;
        }

    public void setZ(double z) {
        this.z = z;
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

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

}
