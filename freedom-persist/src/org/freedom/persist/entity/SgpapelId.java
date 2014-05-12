package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SgpapelId generated by hbm2java
 */
@Embeddable
public class SgpapelId implements java.io.Serializable {

	private String codpapel;
	private short codfilial;
	private int codemp;

	public SgpapelId() {
	}

	public SgpapelId(String codpapel, short codfilial, int codemp) {
		this.codpapel = codpapel;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODPAPEL", nullable = false, length = 10)
	public String getCodpapel() {
		return this.codpapel;
	}

	public void setCodpapel(String codpapel) {
		this.codpapel = codpapel;
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
		if (!(other instanceof SgpapelId))
			return false;
		SgpapelId castOther = (SgpapelId) other;

		return ((this.getCodpapel() == castOther.getCodpapel()) || (this
				.getCodpapel() != null && castOther.getCodpapel() != null && this
				.getCodpapel().equals(castOther.getCodpapel())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodpapel() == null ? 0 : this.getCodpapel().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
