package taller3.televisores;

public class TV {
	private Marca marca;
	int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	Control control;
	private static int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca =  marca;
		this.estado = estado;
		canal = 1;
		volumen = 1;
		precio = 500;
		numTV += 1;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public  Control getControl() {
		return control;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setVolumen(int vol) {
		volumen = vol;
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public static void setNumTV(int num) {
		numTV = num;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	public void turnOn() {
		if(estado == false) {
			estado = true;
		}
	}
	
	public void turnOff() {
		if(estado == true) {
			estado = false;
		}
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		if(estado == true) {
			if(canal < 120) {
				if(canal >= 1) {
					canal += 1;
				}
					
			}
		}
	}
	
	public void canalDown() {
		if(estado == true) {
			if(canal > 1) {
				if(canal <= 120) {
					canal -= 1;
				}
			}
		}
	}
	
	public void volumenUp() {
		if(estado == true) {
			if(volumen < 7) {
				if(volumen >= 0) {
					volumen += 1;
				}
			}
		}
	}
	
	public void volumenDown() {
		if(estado == true) {
			if(volumen > 0) {
				if (volumen <= 7) {
					volumen -= 1;
				}
			}
		}
	}
}
