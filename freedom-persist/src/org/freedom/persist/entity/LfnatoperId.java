package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * LfnatoperId generated by hbm2java
 */
@Embeddable
public class LfnatoperId implements java.io.Serializable {

	private String codnat;
	private short codfilial;
	private int codemp;

	public LfnatoperId() {
	}

	public LfnatoperId(String codnat, short codfilial, int codemp) {
		this.codnat = codnat;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODNAT", nullable = false, length = 4)
	public String getCodnat() {
		return this.codnat;
	}

	public void setCodnat(String codnat) {
		this.codnat = codnat;
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
		if (!(other instanceof LfnatoperId))
			return false;
		LfnatoperId castOther = (LfnatoperId) other;

		return ((this.getCodnat() == castOther.getCodnat()) || (this
				.getCodnat() != null && castOther.getCodnat() != null && this
				.getCodnat().equals(castOther.getCodnat())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodnat() == null ? 0 : this.getCodnat().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
