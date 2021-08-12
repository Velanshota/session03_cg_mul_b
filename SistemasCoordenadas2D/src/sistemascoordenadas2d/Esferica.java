
package sistemascoordenadas2d;

public class Esferica {
    private double p;
    private double phi;
    private double the;

    public Esferica(double p, double phi, double the) {
        this.p = p;
        this.phi = phi;
        this.the = the;
    }
    
    public Esferica(){
        
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getPhi() {
        return phi;
    }

    public void setPhi(double phi) {
        this.phi = phi;
    }

    public double getThe() {
        return the;
    }

    public void setThe(double the) {
        this.the = the;
    }
    
    
}
