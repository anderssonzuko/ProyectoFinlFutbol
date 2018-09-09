package entity;

public class Cambios {
	private int codCambio;
	private int  codJugador;
	private int codEquipo;
	private int codPartido;
	private int Minuto;
	
	public Cambios(int codCambio,int  codJugador,int codEquipo, int codPartido,int Minuto) {
		
		this.codCambio = codCambio;
		this.codJugador = codJugador;
		this.codEquipo = codEquipo;
		this.codPartido = codPartido;
		this.Minuto = Minuto;
	}
	
	public Cambios() {
		
		this.codCambio = 0;
		this.codJugador = 0;
		this.codEquipo = 0;
		this.codPartido = 0;
		this.Minuto = 0;
	}
	public int getcodCambio() {
		return codCambio;
	}
	public void setcodCambio(int codCambio) {
		this.codCambio = codCambio;
	}
	public int codcodJugador() {
		return  codJugador;
	}
		
	public void setcodJugador(int codJugador) {
		this. codJugador =  codJugador;
	
	}
	public int getCodEquipo() {
		return codEquipo;
	}
		
	public void setCodEquipo(int codEquipo) {
		this.codEquipo = codEquipo;
	
	}
	public int getcodPartido() {
		return codPartido;
	}
		
	public void setcodPartido(int codPartido) {
		this.codPartido = codPartido;
	
	}

	public int getMinuto() {
		return Minuto;
	}
	public void setMinuto(int codMinuto) {
		this.Minuto = Minuto;
	}

	

}
