package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VdobscliId generated by hbm2java
 */
@Embeddable
public class VdobscliId implements java.io.Serializable {

	private int codcli;
	private int seqobscli;
	private short codfilial;
	private int codemp;

	public VdobscliId() {
	}

	public VdobscliId(int codcli, int seqobscli, short codfilial, int codemp) {
		this.codcli = codcli;
		this.seqobscli = seqobscli;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODCLI", nullable = false)
	public int getCodcli() {
		return this.codcli;
	}

	public void setCodcli(int codcli) {
		this.codcli = codcli;
	}

	@Column(name = "SEQOBSCLI", nullable = false)
	public int getSeqobscli() {
		return this.seqobscli;
	}

	public void setSeqobscli(int seqobscli) {
		this.seqobscli = seqobscli;
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
		if (!(other instanceof VdobscliId))
			return false;
		VdobscliId castOther = (VdobscliId) other;

		return (this.getCodcli() == castOther.getCodcli())
				&& (this.getSeqobscli() == castOther.getSeqobscli())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodcli();
		result = 37 * result + this.getSeqobscli();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
