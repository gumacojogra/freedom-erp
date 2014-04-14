package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

/**
 * EqmovprodId generated by hbm2java
 */
public class EqmovprodId implements java.io.Serializable {

	private int codmovprod;
	private short codfilial;
	private int codemp;

	public EqmovprodId() {
	}

	public EqmovprodId(int codmovprod, short codfilial, int codemp) {
		this.codmovprod = codmovprod;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodmovprod() {
		return this.codmovprod;
	}

	public void setCodmovprod(int codmovprod) {
		this.codmovprod = codmovprod;
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
		if (!(other instanceof EqmovprodId))
			return false;
		EqmovprodId castOther = (EqmovprodId) other;

		return (this.getCodmovprod() == castOther.getCodmovprod())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodmovprod();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
