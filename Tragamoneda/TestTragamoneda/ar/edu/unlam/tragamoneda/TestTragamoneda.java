package ar.edu.unlam.tragamoneda;


import org.junit.Assert;
import org.junit.Test;

public class TestTragamoneda {
	
	@Test
	public void crearElTragamonedasYQueReconozcaCantidadDeTamboresYPremioAlAzar(){
		Tambor miTambor1 = new Tambor(3);
		Tambor miTambor2 = new Tambor(3);
		Tambor miTambor3 = new Tambor(3);
		Tragamoneda miTragamoneda = new Tragamoneda(miTambor1, miTambor2, miTambor3);
		Integer minValor = 0;
		Integer maxValor = 4;
		miTragamoneda.girarTambores();
		Assert.assertTrue(miTragamoneda.getValorTambor1() != null);
		Assert.assertTrue(miTragamoneda.getValorTambor1() > minValor && miTragamoneda.getValorTambor1() < maxValor);
		Assert.assertFalse(miTragamoneda.entregaPremio());
	}
	
	@Test
	public void queElTragaMonedasEntregueElPremio(){
		Tambor miTambor1 = new Tambor(1);
		Tambor miTambor2 = new Tambor(1);
		Tambor miTambor3 = new Tambor(1);
		Tragamoneda miTragamoneda = new Tragamoneda(miTambor1, miTambor2, miTambor3);
		miTragamoneda.girarTambores();
		Assert.assertTrue(miTragamoneda.entregaPremio());
		
	}

}
