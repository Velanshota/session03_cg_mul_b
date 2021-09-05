package sistemascoordenadas2d;

public class Esferica {

	double radio;
	double angulox;
	double anguloy;
	
	public Esferica() {
		
	}
	
	public Esferica(double radio, double angulox, double anguloy) {
		
		this.radio = radio;
		this.angulox = angulox;
		this.anguloy = anguloy;
		
	}

	public double getRadio() {
		
		return radio;
		
	}

	public double getAngulox() {
		
		return angulox;
		
	}

	public double getAnguloy() {
		
		return anguloy;
		
	}

	public void setRadio(double radio) {
		
		this.radio = radio;
		
	}

	public void setAngulox(double angulox) {
		
		this.angulox = angulox;
		
	}

	public void setAnguloy(double anguloy) {
		
		this.anguloy = anguloy;
		
	}
	
	public Esferica esfericas_cartesianas3d (double x, double y, double z) {
		
		Esferica obj = new Esferica();
		
		x = radio * Math.sin(angulox) * Math.cos(anguloy);
		y = radio * Math.sin(angulox) * Math.sin(anguloy);
		z = radio * Math.cos(angulox);
		
		return obj;
		
	}
	
	public Esferica esfericas_cartesianas3d (Cartesiana3D c) {
		
		 return esfericas_cartesianas3d(c.getX(), c.getY(), c.getZ());
		
	}
	
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
	
	public Cartesiana3D cartesiana3d_cilindrica (double r, double angulo, double coorz) {
		
		Cartesiana3D obj = new Cartesiana3D();
		
		r = Math.sqrt(Math.pow(x, 2));
		angulo = Math.pow(Math.tan(y / z), -1);
		coorz = z;
		
		return obj;
		
	}
	
	public Cartesiana3D cartesiana3d_cilindrica (Cilindrica c) {
		
		return cartesiana3d_cilindrica(c.getAngulo(), c.getRadio(), c.getCoorz());
		
	}
	
}