package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VdcontratoId generated by hbm2java
 */
@Embeddable
public class VdcontratoId implements java.io.Serializable {

	private int codcontr;
	private short codfilial;
	private int codemp;

	public VdcontratoId() {
	}

	public VdcontratoId(int codcontr, short codfilial, int codemp) {
		this.codcontr = codcontr;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODCONTR", nullable = false)
	public int getCodcontr() {
		return this.codcontr;
	}

	public void setCodcontr(int codcontr) {
		this.codcontr = codcontr;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "CODEMP", nullable = false)
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
		if (!(other instanceof VdcontratoId))
			return false;
		VdcontratoId castOther = (VdcontratoId) other;

		return (this.getCodcontr() == castOther.getCodcontr())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodcontr();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
