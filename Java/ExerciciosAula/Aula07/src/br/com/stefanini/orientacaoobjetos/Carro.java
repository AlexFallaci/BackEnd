package br.com.stefanini.orientacaoobjetos;

public abstract class Carro {
	
	String marca;
	int chassi;
	String placa;
	String roda;
	String bancos;
	
	public abstract int getAcelerar(); 
	
	public abstract int getFrear();

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getChassi() {
		return chassi;
	}

	public void setChassi(int chassi) {
		this.chassi = chassi;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getRoda() {
		return roda;
	}

	public void setRoda(String roda) {
		this.roda = roda;
	}

	public String getBancos() {
		return bancos;
	}

	public void setBancos(String bancos) {
		this.bancos = bancos;
	} 
	
	

}
