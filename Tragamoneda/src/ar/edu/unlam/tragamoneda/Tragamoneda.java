package ar.edu.unlam.tragamoneda;

public class Tragamoneda {

	private Tambor tambor1;
	private Tambor tambor2;
	private Tambor tambor3;
	private Integer valorTambor1;
	private Integer valorTambor2;
	private Integer valorTambor3;

	public Tragamoneda(Tambor tambor1, Tambor tambor2, Tambor tambor3) {
		this.tambor1 = tambor1;
		this.tambor2 = tambor2;
		this.tambor3 = tambor3;
	}

	public void girar() {
		this.setValorTambor1(this.tambor1.girar());
		this.setValorTambor2(this.tambor2.girar());
		this.setValorTambor3(this.tambor3.girar());
	}

	public Integer getValorTambor3() {
		return valorTambor3;
	}

	public void setValorTambor3(Integer valorTambor3) {
		this.valorTambor3 = valorTambor3;
	}

	public Integer getValorTambor2() {
		return valorTambor2;
	}

	public void setValorTambor2(Integer valorTambor2) {
		this.valorTambor2 = valorTambor2;
	}

	public Integer getValorTambor1() {
		return valorTambor1;
	}

	public void setValorTambor1(Integer valorTambor1) {
		this.valorTambor1 = valorTambor1;
	}

}
