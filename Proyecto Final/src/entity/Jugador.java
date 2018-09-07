package entity;

public class Jugador {
	
	private int codJugador;
	public int  codequipo;
	private int DNI;
	private String nombrecompleto;
	private String fechanacimiento;
	private int Numeropolera;
	private int sueldo;
	private String nacionalidad;
	private int altura;
	private int peso;
	private String piehabil;
	


	public Jugador(int codJugador,int  codequipo,int DNI, String nombrecompleto, String Fechanacimiento, int Numeropolera,int sueldo,String nacionalidad,int altura,int peso,String piehabil) {
		
		this.codJugador = codJugador;
		this.codequipo = codequipo;
		this.DNI = DNI;
		this.nombrecompleto = nombrecompleto;
		this.fechanacimiento = fechanacimiento;
		this.Numeropolera = Numeropolera;
		this.sueldo = sueldo;
		this.nacionalidad = nacionalidad;
		this.altura = altura;
		this.peso = peso;
		this.piehabil = piehabil;



	}
	
	public Jugador() {
		
		this.codJugador = 0;
		this.codequipo = 0;
		this.DNI = 0;
		this.nombrecompleto = "";
		this.fechanacimiento = "";
		this.Numeropolera = 0;
		this.sueldo = 0;
		this.nacionalidad = "";
		this.altura = 0;
		this.peso = 0;
		this.piehabil = "";
		
	}
	public int getcodJugador() {
		return codequipo;
	}
	public void setcodJugador(int codJugador) {
		this.codJugador = codJugador;
	}
	public int DNI() {
		return  DNI;
	}
		
	public void setDNI(int DNI) {
		this. DNI =  DNI;
	
	}
	public String getnombrecompleto() {
		return nombrecompleto;
	}
		
	public void setnombrecompleto(String nombrecompleto) {
		this.nombrecompleto = nombrecompleto;
	
	}
	public String getfechanacimiento() {
		return fechanacimiento;
	}
		
	public void setfechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	
	}

	public int getNumeropolera() {
		return Numeropolera;
	}
	public void setNumeropolera(int Numeropolera) {
		this.Numeropolera = Numeropolera;
	}

	public int getsueldo() {
		return sueldo;
	}
	public void setsueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	public String getnacionalidad() {
		return nacionalidad;
	}
		
	public void setnacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	
	}

	public int getaltura() {
		return altura;
	}
	public void setaltura(int altura) {
		this.altura = altura;
	}
	public int getpeso() {
		return peso;
	}
	public void setpeso(int peso) {
		this.peso = peso;
	}
	public String getpiehabil() {
		return piehabil;
	}
		
	public void setpiehabil(String piehabil) {
		this.piehabil = piehabil;
	
	}
	

	
	
	@Override
	public String toString() {
		return "Jugador [DNI=" + DNI + ",nombrecompleto=" + nombrecompleto + ","
				+ " fechanacimiento=" + fechanacimiento+ ","
				+ " Numeropolera=" + Numeropolera + ",sueldo=" + sueldo + ","
						+ "nacionalidad=" + nacionalidad + ","
						+ "altura=" + altura + ",peso=" + peso + ","
								+ "piehabil=" + piehabil + "]";
	}
	

}

