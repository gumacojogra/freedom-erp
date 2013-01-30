package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VdvendedorId generated by hbm2java
 */
@Embeddable
public class VdvendedorId implements java.io.Serializable {

	private int codvend;
	private short codfilial;
	private int codemp;

	public VdvendedorId() {
	}

	public VdvendedorId(int codvend, short codfilial, int codemp) {
		this.codvend = codvend;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODVEND", nullable = false)
	public int getCodvend() {
		return this.codvend;
	}

	public void setCodvend(int codvend) {
		this.codvend = codvend;
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
		if (!(other instanceof VdvendedorId))
			return false;
		VdvendedorId castOther = (VdvendedorId) other;

		return (this.getCodvend() == castOther.getCodvend())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodvend();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
