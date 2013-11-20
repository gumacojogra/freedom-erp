package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

/**
 * VditcustoorcId generated by hbm2java
 */
public class VditcustoorcId implements java.io.Serializable {

	private int codorc;
	private int coditorc;
	private char tipoorc;
	private short codfilial;
	private int codemp;

	public VditcustoorcId() {
	}

	public VditcustoorcId(int codorc, int coditorc, char tipoorc,
			short codfilial, int codemp) {
		this.codorc = codorc;
		this.coditorc = coditorc;
		this.tipoorc = tipoorc;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodorc() {
		return this.codorc;
	}

	public void setCodorc(int codorc) {
		this.codorc = codorc;
	}

	public int getCoditorc() {
		return this.coditorc;
	}

	public void setCoditorc(int coditorc) {
		this.coditorc = coditorc;
	}

	public char getTipoorc() {
		return this.tipoorc;
	}

	public void setTipoorc(char tipoorc) {
		this.tipoorc = tipoorc;
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
		if (!(other instanceof VditcustoorcId))
			return false;
		VditcustoorcId castOther = (VditcustoorcId) other;

		return (this.getCodorc() == castOther.getCodorc())
				&& (this.getCoditorc() == castOther.getCoditorc())
				&& (this.getTipoorc() == castOther.getTipoorc())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodorc();
		result = 37 * result + this.getCoditorc();
		result = 37 * result + this.getTipoorc();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
