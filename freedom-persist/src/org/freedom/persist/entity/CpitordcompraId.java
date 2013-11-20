package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

/**
 * CpitordcompraId generated by hbm2java
 */
public class CpitordcompraId implements java.io.Serializable {

	private int codemp;
	private short codfilial;
	private int codordcp;
	private short coditordcp;

	public CpitordcompraId() {
	}

	public CpitordcompraId(int codemp, short codfilial, int codordcp,
			short coditordcp) {
		this.codemp = codemp;
		this.codfilial = codfilial;
		this.codordcp = codordcp;
		this.coditordcp = coditordcp;
	}

	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	public int getCodordcp() {
		return this.codordcp;
	}

	public void setCodordcp(int codordcp) {
		this.codordcp = codordcp;
	}

	public short getCoditordcp() {
		return this.coditordcp;
	}

	public void setCoditordcp(short coditordcp) {
		this.coditordcp = coditordcp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CpitordcompraId))
			return false;
		CpitordcompraId castOther = (CpitordcompraId) other;

		return (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodordcp() == castOther.getCodordcp())
				&& (this.getCoditordcp() == castOther.getCoditordcp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodordcp();
		result = 37 * result + this.getCoditordcp();
		return result;
	}

}
