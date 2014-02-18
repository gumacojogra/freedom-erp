package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * FntbjurosId generated by hbm2java
 */
public class FntbjurosId implements java.io.Serializable {

	private int codtbj;
	private short codfilial;
	private int codemp;

	public FntbjurosId() {
	}

	public FntbjurosId(int codtbj, short codfilial, int codemp) {
		this.codtbj = codtbj;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodtbj() {
		return this.codtbj;
	}

	public void setCodtbj(int codtbj) {
		this.codtbj = codtbj;
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
		if (!(other instanceof FntbjurosId))
			return false;
		FntbjurosId castOther = (FntbjurosId) other;

		return (this.getCodtbj() == castOther.getCodtbj())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodtbj();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
