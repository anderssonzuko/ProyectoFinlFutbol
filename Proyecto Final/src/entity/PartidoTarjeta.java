package entity;

public class PartidoTarjeta {
	
	private int codTarjeta;
	private int codPartido;
	private int minuto;
	


	public PartidoTarjeta(int codTarjeta,int  codJugador,int codPartido,String Tipo, int montomulta) {
		
		this.codTarjeta = codTarjeta;
		this.codPartido = codPartido;
		this.minuto = minuto ;
		
		
	}
	
	public PartidoTarjeta() {
		
		this.codTarjeta = 0;
		this.codPartido = 0;
		this.minuto = 0;
		
		
	}
	public int getcodTarjeta() {
		return codTarjeta;
	}
	public void setcodTarjeta(int codTarjeta) {
		this.codTarjeta = codTarjeta;
	}
	public int getcodPartido() {
		return codPartido;
	}
		
	public void setcodPartido(int codPartido) {
		this.codPartido = codPartido;

	}

	public int getminuto() {
		return minuto;
	}
	public void setminuto(int minuto) {
		this.minuto = minuto;
	}
	
	
	
	
	
}
