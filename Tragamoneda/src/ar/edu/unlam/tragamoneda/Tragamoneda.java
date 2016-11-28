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

	public void girarTambores() {
		this.valorTambor1 = this.tambor1.girar();
		this.valorTambor2 = this.tambor2.girar();
		this.valorTambor3 = this.tambor3.girar();
	}
	
	public Boolean entregaPremio(){
		if((this.valorTambor1 == this.valorTambor2) && (this.valorTambor2 == this.valorTambor3)){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tambor1 == null) ? 0 : tambor1.hashCode());
		result = prime * result + ((tambor2 == null) ? 0 : tambor2.hashCode());
		result = prime * result + ((tambor3 == null) ? 0 : tambor3.hashCode());
		result = prime * result
				+ ((valorTambor1 == null) ? 0 : valorTambor1.hashCode());
		result = prime * result
				+ ((valorTambor2 == null) ? 0 : valorTambor2.hashCode());
		result = prime * result
				+ ((valorTambor3 == null) ? 0 : valorTambor3.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tragamoneda other = (Tragamoneda) obj;
		if (tambor1 == null) {
			if (other.tambor1 != null)
				return false;
		} else if (!tambor1.equals(other.tambor1))
			return false;
		if (tambor2 == null) {
			if (other.tambor2 != null)
				return false;
		} else if (!tambor2.equals(other.tambor2))
			return false;
		if (tambor3 == null) {
			if (other.tambor3 != null)
				return false;
		} else if (!tambor3.equals(other.tambor3))
			return false;
		if (valorTambor1 == null) {
			if (other.valorTambor1 != null)
				return false;
		} else if (!valorTambor1.equals(other.valorTambor1))
			return false;
		if (valorTambor2 == null) {
			if (other.valorTambor2 != null)
				return false;
		} else if (!valorTambor2.equals(other.valorTambor2))
			return false;
		if (valorTambor3 == null) {
			if (other.valorTambor3 != null)
				return false;
		} else if (!valorTambor3.equals(other.valorTambor3))
			return false;
		return true;
	}

	public Integer getValorTambor3() {
		return valorTambor3;
	}


	public Integer getValorTambor2() {
		return valorTambor2;
	}


	public Integer getValorTambor1() {
		return valorTambor1;
	}


}
