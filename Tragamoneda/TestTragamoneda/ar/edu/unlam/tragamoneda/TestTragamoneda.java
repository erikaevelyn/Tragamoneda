package ar.edu.unlam.tragamoneda;


import org.junit.Assert;
import org.junit.Test;

public class TestTragamoneda {
	
	@Test
	public void queReconozcaLosTamboresYGire(){
		Tambor miTambor1 = new Tambor(9);
		Tambor miTambor2 = new Tambor(6);
		Tambor miTambor3 = new Tambor(3);
		Tragamoneda miTragamoneda = new Tragamoneda(miTambor1, miTambor2, miTambor3);
		Integer valorEsperado = 6;
		Integer valorEsperado2 = 3;
		Integer minValor = 1;
		Integer maxValor = 10;
		Assert.assertEquals(valorEsperado, miTambor2.getCarasDelTambor());
		Assert.assertTrue(valorEsperado2 == miTambor3.getCarasDelTambor());
		miTragamoneda.girar();
		Assert.assertTrue(miTragamoneda.getValorTambor1() != null);
		Assert.assertTrue(miTragamoneda.getValorTambor1() > minValor && miTragamoneda.getValorTambor1() < maxValor);
	}

}
