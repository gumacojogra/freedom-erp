package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VdkitId generated by hbm2java
 */
@Embeddable
public class VdkitId implements java.io.Serializable {

	private int codkit;
	private short codfilial;
	private int codemp;

	public VdkitId() {
	}

	public VdkitId(int codkit, short codfilial, int codemp) {
		this.codkit = codkit;
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
		if (!(other instanceof VdkitId))
			return false;
		VdkitId castOther = (VdkitId) other;

		return (this.getCodkit() == castOther.getCodkit())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodkit();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
