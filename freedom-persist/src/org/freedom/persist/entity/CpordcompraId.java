package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CpordcompraId generated by hbm2java
 */
@Embeddable
public class CpordcompraId implements java.io.Serializable {

	private int codemp;
	private short codfilial;
	private int codordcp;

	public CpordcompraId() {
	}

	public CpordcompraId(int codemp, short codfilial, int codordcp) {
		this.codemp = codemp;
		this.codfilial = codfilial;
		this.codordcp = codordcp;
	}

	@Column(name = "CODEMP", nullable = false)
	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "CODORDCP", nullable = false)
	public int getCodordcp() {
		return this.codordcp;
	}

	public void setCodordcp(int codordcp) {
		this.codordcp = codordcp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CpordcompraId))
			return false;
		CpordcompraId castOther = (CpordcompraId) other;

		return (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodordcp() == castOther.getCodordcp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodordcp();
		return result;
	}

}
