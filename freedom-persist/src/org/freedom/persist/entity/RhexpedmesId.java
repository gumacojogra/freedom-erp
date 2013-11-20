package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

/**
 * RhexpedmesId generated by hbm2java
 */
public class RhexpedmesId implements java.io.Serializable {

	private short mesexped;
	private short anoexped;
	private short codturno;
	private short codfilial;
	private int codemp;

	public RhexpedmesId() {
	}

	public RhexpedmesId(short mesexped, short anoexped, short codturno,
			short codfilial, int codemp) {
		this.mesexped = mesexped;
		this.anoexped = anoexped;
		this.codturno = codturno;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public short getMesexped() {
		return this.mesexped;
	}

	public void setMesexped(short mesexped) {
		this.mesexped = mesexped;
	}

	public short getAnoexped() {
		return this.anoexped;
	}

	public void setAnoexped(short anoexped) {
		this.anoexped = anoexped;
	}

	public short getCodturno() {
		return this.codturno;
	}

	public void setCodturno(short codturno) {
		this.codturno = codturno;
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
		if (!(other instanceof RhexpedmesId))
			return false;
		RhexpedmesId castOther = (RhexpedmesId) other;

		return (this.getMesexped() == castOther.getMesexped())
				&& (this.getAnoexped() == castOther.getAnoexped())
				&& (this.getCodturno() == castOther.getCodturno())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getMesexped();
		result = 37 * result + this.getAnoexped();
		result = 37 * result + this.getCodturno();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
