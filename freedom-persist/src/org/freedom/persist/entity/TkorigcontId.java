package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TkorigcontId generated by hbm2java
 */
@Embeddable
public class TkorigcontId implements java.io.Serializable {

	private int codorigcont;
	private short codfilial;
	private int codemp;

	public TkorigcontId() {
	}

	public TkorigcontId(int codorigcont, short codfilial, int codemp) {
		this.codorigcont = codorigcont;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODORIGCONT", nullable = false)
	public int getCodorigcont() {
		return this.codorigcont;
	}

	public void setCodorigcont(int codorigcont) {
		this.codorigcont = codorigcont;
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
		if (!(other instanceof TkorigcontId))
			return false;
		TkorigcontId castOther = (TkorigcontId) other;

		return (this.getCodorigcont() == castOther.getCodorigcont())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodorigcont();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
