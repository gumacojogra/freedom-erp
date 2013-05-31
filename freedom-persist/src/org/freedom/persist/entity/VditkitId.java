package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VditkitId generated by hbm2java
 */
@Embeddable
public class VditkitId implements java.io.Serializable {

	private int codkit;
	private short seqitkit;
	private short codfilial;
	private int codemp;

	public VditkitId() {
	}

	public VditkitId(int codkit, short seqitkit, short codfilial, int codemp) {
		this.codkit = codkit;
		this.seqitkit = seqitkit;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODKIT", nullable = false)
	public int getCodkit() {
		return this.codkit;
	}

	public void setCodkit(int codkit) {
		this.codkit = codkit;
	}

	@Column(name = "SEQITKIT", nullable = false)
	public short getSeqitkit() {
		return this.seqitkit;
	}

	public void setSeqitkit(short seqitkit) {
		this.seqitkit = seqitkit;
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
		if (!(other instanceof VditkitId))
			return false;
		VditkitId castOther = (VditkitId) other;

		return (this.getCodkit() == castOther.getCodkit())
				&& (this.getSeqitkit() == castOther.getSeqitkit())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodkit();
		result = 37 * result + this.getSeqitkit();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
