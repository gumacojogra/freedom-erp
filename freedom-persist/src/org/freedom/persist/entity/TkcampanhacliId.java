package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TkcampanhacliId generated by hbm2java
 */
@Embeddable
public class TkcampanhacliId implements java.io.Serializable {

	private String codcamp;
	private short codfilial;
	private int codemp;
	private int codcli;
	private short codfilialcl;
	private int codempcl;

	public TkcampanhacliId() {
	}

	public TkcampanhacliId(String codcamp, short codfilial, int codemp,
			int codcli, short codfilialcl, int codempcl) {
		this.codcamp = codcamp;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.codcli = codcli;
		this.codfilialcl = codfilialcl;
		this.codempcl = codempcl;
	}

	@Column(name = "CODCAMP", nullable = false, length = 13)
	public String getCodcamp() {
		return this.codcamp;
	}

	public void setCodcamp(String codcamp) {
		this.codcamp = codcamp;
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

	@Column(name = "CODCLI", nullable = false)
	public int getCodcli() {
		return this.codcli;
	}

	public void setCodcli(int codcli) {
		this.codcli = codcli;
	}

	@Column(name = "CODFILIALCL", nullable = false)
	public short getCodfilialcl() {
		return this.codfilialcl;
	}

	public void setCodfilialcl(short codfilialcl) {
		this.codfilialcl = codfilialcl;
	}

	@Column(name = "CODEMPCL", nullable = false)
	public int getCodempcl() {
		return this.codempcl;
	}

	public void setCodempcl(int codempcl) {
		this.codempcl = codempcl;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TkcampanhacliId))
			return false;
		TkcampanhacliId castOther = (TkcampanhacliId) other;

		return ((this.getCodcamp() == castOther.getCodcamp()) || (this
				.getCodcamp() != null && castOther.getCodcamp() != null && this
				.getCodcamp().equals(castOther.getCodcamp())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodcli() == castOther.getCodcli())
				&& (this.getCodfilialcl() == castOther.getCodfilialcl())
				&& (this.getCodempcl() == castOther.getCodempcl());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodcamp() == null ? 0 : this.getCodcamp().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodcli();
		result = 37 * result + this.getCodfilialcl();
		result = 37 * result + this.getCodempcl();
		return result;
	}

}
