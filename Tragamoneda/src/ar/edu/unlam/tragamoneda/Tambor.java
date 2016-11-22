package ar.edu.unlam.tragamoneda;

import java.util.Random;

public class Tambor {
	private Integer carasDelTambor;
	
	public Tambor(Integer carasDelTambor) {
		this.carasDelTambor = carasDelTambor;
	}
	
	public Integer girar() {
		Random generator = new Random();
		return generator.nextInt(this.carasDelTambor) + 1;
	}

	public Integer getCarasDelTambor() {
		return carasDelTambor;
	}

	public void setCarasDelTambor(Integer carasDelTambor) {
		this.carasDelTambor = carasDelTambor;
	}


	
}
