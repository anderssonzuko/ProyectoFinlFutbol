package entity;

public class Tarjetas {

	private int codTarjeta;
	private int  codJugador;
	private int codPartido;
	private String Tipo;
	private int montomulta;
	


	public Tarjetas(int codTarjeta,int  codJugador,int codPartido,String Tipo, int montomulta) {
		
		this.codTarjeta = codTarjeta;
		this.codJugador = codJugador;
		this.codPartido = codPartido;
		this.Tipo = Tipo ;
		this.montomulta = montomulta;
		
		
	}
	
	public Tarjetas() {
		
		this.codTarjeta = 0;
		this.codJugador = 0;
		this.codPartido = 0;
		this.Tipo = "";
		this.montomulta = 0;
		
		
	}
	public int getcodTarjeta() {
		return codTarjeta;
	}
	public void setcodTarjeta(int codTarjeta) {
		this.codTarjeta = codTarjeta;
	}
	public int codJugador() {
		return  codJugador;
	}
		
	public void setcodJugador(int codJugador) {
		this. codJugador =  codJugador;
	
	}
	public int getcodPartido() {
		return codPartido;
	}
		
	public void setcodPartido(int codPartido) {
		this.codPartido = codPartido;
	
	}
	public String getTipo() {
		return Tipo;
	}
		
	public void setTipo(String Tipo) {
		this.Tipo = Tipo;
	
	}

	public int getmontomulta() {
		return montomulta;
	}
	public void setmontomulta(int montomulta) {
		this.montomulta = montomulta;
	}
	@Override
	public String toString() {
		return "Tarjetas [Tipo=" + Tipo + "]";
	}
	
	
	
}
