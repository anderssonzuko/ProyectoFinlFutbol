package entity;

public class Estadisticas {
	private int codEstadisticas;
	private int codTarjeta;
	private int codEquipo;
	private int codJugador;
	private int Disparos;
	private int Posesion;
	private int TirosLibres;
	private int Cornels;
	private int Penales;
	private int FueraDeJuego;
	private int goles;
	private int codCambios;
	


	public Estadisticas(int codEstadisticas,int codTarjeta,int codEquipo, int codJugador, int Disparos, int Posesion,int TirosLibres,int Cornels,int Penales,int FueraDeJuego,int goles,int codCambios) {
		
		this.codEstadisticas = codEstadisticas;
		this.codTarjeta = codTarjeta;
		this.codEquipo = codEquipo;
		this.codJugador = codJugador;
		this.Disparos = Disparos;
		this.Posesion = Posesion;
		this.TirosLibres = TirosLibres;
		this.Cornels = Cornels;
		this.Penales = Penales;
		this.FueraDeJuego = FueraDeJuego;
		this.goles = goles;
		this.codCambios = codCambios;


	}
	
	public Estadisticas() {
		
		this.codEstadisticas = 0;
		this.codTarjeta = 0;
		this.codEquipo = 0;
		this.codJugador = 0;
		this.Disparos = 0;
		this.Posesion = 0;
		this.TirosLibres = 0;
		this.Cornels = 0;
		this.Penales = 0;
		this.FueraDeJuego = 0;
		this.goles = 0;
		this.goles = 0;
	    this.codCambios = 0 ;
	    
	}
	public int getcodEstadisticas() {
		return codEstadisticas;
	}
	public void setcodEstadisticas(int codEstadisticas) {
		this.codEstadisticas = codEstadisticas;
	}
	public int codTarjeta() {
		return  codTarjeta;
	}
		
	public void setcodTarjeta(int codTarjeta) {
		this. codTarjeta =  codTarjeta;
	
	}
	public int getcodEquipo() {
		return codEquipo;
	}
		
	public void setcodEquipo(int codEquipo) {
		this.codEquipo = codEquipo;
	
	}
	public int getcodJugador() {
		return codJugador;
	}
		
	public void setcodJugador(int codJugador) {
		this.codJugador = codJugador;
	
	}

	public int getDisparos() {
		return Disparos;
	}
	public void setDisparos(int Disparos) {
		this.Disparos = Disparos;
	}

	public int getPosesion() {
		return Posesion;
	}
	public void setPosesion(int Posesion) {
		this.Posesion = Posesion;
	}
	public int getTirosLibres() {
		return TirosLibres;
	}
		
	public void setTirosLibres(int TirosLibres) {
		this.TirosLibres = TirosLibres;
	
	}

	public int getCornels() {
		return Cornels;
	}
	public void setCornels(int Cornels) {
		this.Cornels = Cornels;
	}
	public int getPenales() {
		return Penales;
	}
	public void setPenales(int Penales) {
		this.Penales = Penales;
	}
	public int getcodCambios() {
		return codCambios;
	}
		
	public void setcodCambios(int codCambios) {
		this.codCambios = codCambios;
	
	}
	


}
