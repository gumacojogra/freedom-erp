package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * EqprodplanId generated by hbm2java
 */
public class EqprodplanId implements java.io.Serializable {

	private int codprod;
	private short codfilial;
	private int codemp;
	private short seqpp;

	public EqprodplanId() {
	}

	public EqprodplanId(int codprod, short codfilial, int codemp, short seqpp) {
		this.codprod = codprod;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.seqpp = seqpp;
	}

	public int getCodprod() {
		return this.codprod;
	}

	public void setCodprod(int codprod) {
		this.codprod = codprod;
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

	public short getSeqpp() {
		return this.seqpp;
	}

	public void setSeqpp(short seqpp) {
		this.seqpp = seqpp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EqprodplanId))
			return false;
		EqprodplanId castOther = (EqprodplanId) other;

		return (this.getCodprod() == castOther.getCodprod())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getSeqpp() == castOther.getSeqpp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodprod();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getSeqpp();
		return result;
	}

}
