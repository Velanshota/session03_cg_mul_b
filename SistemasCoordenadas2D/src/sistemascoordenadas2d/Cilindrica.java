package sistemascoordenadas2d;

public class Cilindrica {

	private double radio;
	private double angulo;
	private double coorz;
	
	public Cilindrica() {
		
	}
	
	public Cilindrica(double radio, double angulo, double coorz) {
		
		this.radio = radio;
		this.angulo = angulo;
		this.coorz = coorz;
		
	}

	public double getRadio() {
		
		return radio;
		
	}

	public double getAngulo() {
		
		return angulo;
		
	}

	public double getCoorz() {
		
		return coorz;
		
	}

	public void setRadio(double radio) {
		
		this.radio = radio;
		
	}

	public void setAngulo(double angulo) {
		
		this.angulo = angulo;
		
	}

	public void setCoorz(double coorz) {
		
		this.coorz = coorz;
		
	}

	public Cilindrica cilindrica_cartesiana3D(double x, double y, double z) {
  
		Cilindrica obj = new Cilindrica();
		
		x = radio * Math.sin(angulo);
	    y = radio * Math.cos(angulo);
	    z = coorz;
	        
	    return obj;
	        
	}
	
	public Cilindrica cilindrica_cartesiana3D(Cartesiana3D c) {
    	
        return cilindrica_cartesiana3D(c.getX(), c.getY(), c.getZ());
        
    }

class Cartesiana3D {
	
	double x;
	double y;
	double z;
	
	public Cartesiana3D (){
		
	}	
	
	public Cartesiana3D(double x, double y, double z) {
		
		this.x = x;
		this.y = y;
		this.z = z;
		
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

	public void setX(double x) {
		
		this.x = x;
		
	}

	public void setY(double y) {
		
		this.y = y;
		
	}

	public void setZ(double z) {
		
		this.z = z;
		
	}

	public Cartesiana3D cartesiana3D_esfericas (double r, double angulox, double anguloy) {
		
		Cartesiana3D obj = new Cartesiana3D();
		
		r = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
		angulox = Math.acos(z / r);
		anguloy = Math.atan(y / x);
		
		return obj;
		
	}

	public Cartesiana3D cartesiana3D_esfericas (Esferica e) {
		
		return cartesiana3D_esfericas(e.getRadio(), e.getAngulox(), e.getAnguloy());
		
	}
	
}
	
}