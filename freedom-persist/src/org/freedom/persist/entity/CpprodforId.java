package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * CpprodforId generated by hbm2java
 */
public class CpprodforId implements java.io.Serializable {

	private int codprod;
	private int codfor;
	private short codfilial;
	private short codfilialfr;
	private int codemp;
	private int codempfr;

	public CpprodforId() {
	}

	public CpprodforId(int codprod, int codfor, short codfilial,
			short codfilialfr, int codemp, int codempfr) {
		this.codprod = codprod;
		this.codfor = codfor;
		this.codfilial = codfilial;
		this.codfilialfr = codfilialfr;
		this.codemp = codemp;
		this.codempfr = codempfr;
	}

	public int getCodprod() {
		return this.codprod;
	}

	public void setCodprod(int codprod) {
		this.codprod = codprod;
	}

	public int getCodfor() {
		return this.codfor;
	}

	public void setCodfor(int codfor) {
		this.codfor = codfor;
	}

	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	public short getCodfilialfr() {
		return this.codfilialfr;
	}

	public void setCodfilialfr(short codfilialfr) {
		this.codfilialfr = codfilialfr;
	}

	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	public int getCodempfr() {
		return this.codempfr;
	}

	public void setCodempfr(int codempfr) {
		this.codempfr = codempfr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CpprodforId))
			return false;
		CpprodforId castOther = (CpprodforId) other;

		return (this.getCodprod() == castOther.getCodprod())
				&& (this.getCodfor() == castOther.getCodfor())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodfilialfr() == castOther.getCodfilialfr())
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodempfr() == castOther.getCodempfr());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodprod();
		result = 37 * result + this.getCodfor();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodfilialfr();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodempfr();
		return result;
	}

}
