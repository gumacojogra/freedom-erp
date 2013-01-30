package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CpcomprasolId generated by hbm2java
 */
@Embeddable
public class CpcomprasolId implements java.io.Serializable {

	private int codcompra;
	private int coditcompra;
	private int codfilial;
	private int codemp;
	private int codsol;
	private int coditsol;
	private int codfilialsl;
	private int codempsl;

	public CpcomprasolId() {
	}

	public CpcomprasolId(int codcompra, int coditcompra, int codfilial,
			int codemp, int codsol, int coditsol, int codfilialsl, int codempsl) {
		this.codcompra = codcompra;
		this.coditcompra = coditcompra;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.codsol = codsol;
		this.coditsol = coditsol;
		this.codfilialsl = codfilialsl;
		this.codempsl = codempsl;
	}

	@Column(name = "CODCOMPRA", nullable = false)
	public int getCodcompra() {
		return this.codcompra;
	}

	public void setCodcompra(int codcompra) {
		this.codcompra = codcompra;
	}

	@Column(name = "CODITCOMPRA", nullable = false)
	public int getCoditcompra() {
		return this.coditcompra;
	}

	public void setCoditcompra(int coditcompra) {
		this.coditcompra = coditcompra;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public int getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(int codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "CODEMP", nullable = false)
	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	@Column(name = "CODSOL", nullable = false)
	public int getCodsol() {
		return this.codsol;
	}

	public void setCodsol(int codsol) {
		this.codsol = codsol;
	}

	@Column(name = "CODITSOL", nullable = false)
	public int getCoditsol() {
		return this.coditsol;
	}

	public void setCoditsol(int coditsol) {
		this.coditsol = coditsol;
	}

	@Column(name = "CODFILIALSL", nullable = false)
	public int getCodfilialsl() {
		return this.codfilialsl;
	}

	public void setCodfilialsl(int codfilialsl) {
		this.codfilialsl = codfilialsl;
	}

	@Column(name = "CODEMPSL", nullable = false)
	public int getCodempsl() {
		return this.codempsl;
	}

	public void setCodempsl(int codempsl) {
		this.codempsl = codempsl;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CpcomprasolId))
			return false;
		CpcomprasolId castOther = (CpcomprasolId) other;

		return (this.getCodcompra() == castOther.getCodcompra())
				&& (this.getCoditcompra() == castOther.getCoditcompra())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodsol() == castOther.getCodsol())
				&& (this.getCoditsol() == castOther.getCoditsol())
				&& (this.getCodfilialsl() == castOther.getCodfilialsl())
				&& (this.getCodempsl() == castOther.getCodempsl());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodcompra();
		result = 37 * result + this.getCoditcompra();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodsol();
		result = 37 * result + this.getCoditsol();
		result = 37 * result + this.getCodfilialsl();
		result = 37 * result + this.getCodempsl();
		return result;
	}

}
