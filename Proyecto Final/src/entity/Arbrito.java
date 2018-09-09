package entity;

public class Arbrito {
	private int codArbrito;
	private int  codPartido;
	private int DNI;
	private String nombre;
	private String fechanacimiento;
    private String nacionalidad;
	
	

	public Arbrito(int codArbrito,int  codPartido,int DNI, String nombre, String Fechanacimiento,String nacionalidad) {
		
		this.codArbrito = codArbrito;
		this.codPartido = codPartido;
		this.DNI = DNI;
		this.nombre = nombre;
		this.fechanacimiento = fechanacimiento;
		this.nacionalidad = nacionalidad;
	
	}
	
	public Arbrito() {
		
		this.codArbrito = 0;
		this.codPartido = 0;
		this.DNI = 0;
		this.nombre = "";
		this.fechanacimiento = "";
		this.nacionalidad = "";
		
		
	}
	public int getcodArbrito() {
		return codArbrito;
	}
		
	public void setcodArbrito(int codArbrito) {
		this.codArbrito = codArbrito;
	
	}
	public int getcodPartido() {
		return codPartido;
	}
		
	public void setcodPartido(int codPartido) {
		this.codPartido = codPartido;
	
	}
	public int getDNI() {
		return DNI;
	}
		
	public void setDNI(int DNI) {
		this.DNI = DNI;


	}
	public String getnombre() {
		return nombre;
	}
		
	public void setnombre(String nombre) {
		this.nombre = nombre;
	
	}
	public String getfechanacimiento() {
		return fechanacimiento;
	}
		
	public void setfechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	
	}

	public String getnacionalidad() {
		return nacionalidad;
	}
		
	public void setnacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	
	}


	
	
	@Override
	public String toString() {
		return "Jugador [DNI=" + DNI + ",nombrecompleto=" + nombre + ","
				+ " fechanacimiento=" + fechanacimiento+ ","
						+ "nacionalidad=" + nacionalidad + ",]";
	}
	


}
