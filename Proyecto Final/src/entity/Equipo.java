package entity;

public class Equipo {
	private int codEquipo;
	private int codJugador;
	private String Nombre;
	private String Ciudad;
	private int PresupuestoAnual;

	
	public Equipo(int codEquipo, int codJugador, String Nombre,String Ciudad, int PresupuestoAnual) {
		
		this.codEquipo = codEquipo;
		this.codJugador = codJugador;
		this.Nombre = Nombre;
		this.Ciudad = Ciudad;
		this.PresupuestoAnual = PresupuestoAnual;

	}
	
	public Equipo() {
		
		this.codEquipo = 0;
		this.codJugador = 0;
		this.Nombre = "";
		this.Ciudad = "";
		this.PresupuestoAnual = 0;

	}

	public int getcodEquipo() {
		return codEquipo;
	}
	public void setcodEquipo(int codEquipo) {
		this.codEquipo= codEquipo;
	}

	public int getcodJugador() {
		return codJugador;
	}
	public void setcodJugador(int codJugador) {
		this.codJugador = codJugador;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
		
	}
	public String getCiudad() {
		return Ciudad;
	}

	public void setCiudad(String Ciudad) {
		this.Ciudad = Ciudad;
		
	}
	
	public int getPresupuestoAnual() {
		return PresupuestoAnual;
	}
	
	public void setPresupuestoAnual(int PresupuestoAnual) {
	this.PresupuestoAnual = PresupuestoAnual;
	
	}
	
	@Override
	public String toString() {
		return "Equipo [codEquipo=" + codEquipo + ", codJugador=" + codJugador+ ", Nombre=" + Nombre + ", Ciudad" + Ciudad + ",PresupuestoAnual" + PresupuestoAnual + "]";
	}
	

}
