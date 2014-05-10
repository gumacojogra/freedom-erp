package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * LfitvendaId generated by hbm2java
 */
public class LfitvendaId implements java.io.Serializable {

	private int codvenda;
	private int coditvenda;
	private char tipovenda;
	private short codfilial;
	private int codemp;

	public LfitvendaId() {
	}

	public LfitvendaId(int codvenda, int coditvenda, char tipovenda,
			short codfilial, int codemp) {
		this.codvenda = codvenda;
		this.coditvenda = coditvenda;
		this.tipovenda = tipovenda;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodvenda() {
		return this.codvenda;
	}

	public void setCodvenda(int codvenda) {
		this.codvenda = codvenda;
	}

	public int getCoditvenda() {
		return this.coditvenda;
	}

	public void setCoditvenda(int coditvenda) {
		this.coditvenda = coditvenda;
	}

	public char getTipovenda() {
		return this.tipovenda;
	}

	public void setTipovenda(char tipovenda) {
		this.tipovenda = tipovenda;
	}

	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LfitvendaId))
			return false;
		LfitvendaId castOther = (LfitvendaId) other;

		return (this.getCodvenda() == castOther.getCodvenda())
				&& (this.getCoditvenda() == castOther.getCoditvenda())
				&& (this.getTipovenda() == castOther.getTipovenda())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodvenda();
		result = 37 * result + this.getCoditvenda();
		result = 37 * result + this.getTipovenda();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
