package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * PpfotomtanId generated by hbm2java
 */
public class PpfotomtanId implements java.io.Serializable {

	private int codfotomtan;
	private int codmtanalise;
	private short codfilial;
	private int codemp;

	public PpfotomtanId() {
	}

	public PpfotomtanId(int codfotomtan, int codmtanalise, short codfilial,
			int codemp) {
		this.codfotomtan = codfotomtan;
		this.codmtanalise = codmtanalise;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodfotomtan() {
		return this.codfotomtan;
	}

	public void setCodfotomtan(int codfotomtan) {
		this.codfotomtan = codfotomtan;
	}

	public int getCodmtanalise() {
		return this.codmtanalise;
	}

	public void setCodmtanalise(int codmtanalise) {
		this.codmtanalise = codmtanalise;
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
		if (!(other instanceof PpfotomtanId))
			return false;
		PpfotomtanId castOther = (PpfotomtanId) other;

		return (this.getCodfotomtan() == castOther.getCodfotomtan())
				&& (this.getCodmtanalise() == castOther.getCodmtanalise())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodfotomtan();
		result = 37 * result + this.getCodmtanalise();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
