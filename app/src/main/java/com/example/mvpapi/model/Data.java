package com.example.mvpapi.model;


public class Data{

	private Kamis kamis;

	private Senin senin;

	private Rabu rabu;

	private Jumat jumat;

	private Selasa selasa;


	public void setKamis(Kamis kamis){
		this.kamis = kamis;
	}

	public Kamis getKamis(){
		return kamis;
	}

	public void setSenin(Senin senin){
		this.senin = senin;
	}

	public Senin getSenin(){
		return senin;
	}

	public void setRabu(Rabu rabu){
		this.rabu = rabu;
	}

	public Rabu getRabu(){
		return rabu;
	}

	public void setJumat(Jumat jumat){
		this.jumat = jumat;
	}

	public Jumat getJumat(){
		return jumat;
	}

	public void setSelasa(Selasa selasa){
		this.selasa = selasa;
	}

	public Selasa getSelasa(){
		return selasa;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"kamis = '" + kamis + '\'' + 
			",senin = '" + senin + '\'' + 
			",rabu = '" + rabu + '\'' + 
			",jumat = '" + jumat + '\'' + 
			",selasa = '" + selasa + '\'' + 
			"}";
		}
}