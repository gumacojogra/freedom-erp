package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * LfncmnbmId generated by hbm2java
 */
public class LfncmnbmId implements java.io.Serializable {

	private String codncm;
	private String codnbm;

	public LfncmnbmId() {
	}

	public LfncmnbmId(String codncm, String codnbm) {
		this.codncm = codncm;
		this.codnbm = codnbm;
	}

	public String getCodncm() {
		return this.codncm;
	}

	public void setCodncm(String codncm) {
		this.codncm = codncm;
	}

	public String getCodnbm() {
		return this.codnbm;
	}

	public void setCodnbm(String codnbm) {
		this.codnbm = codnbm;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LfncmnbmId))
			return false;
		LfncmnbmId castOther = (LfncmnbmId) other;

		return ((this.getCodncm() == castOther.getCodncm()) || (this
				.getCodncm() != null && castOther.getCodncm() != null && this
				.getCodncm().equals(castOther.getCodncm())))
				&& ((this.getCodnbm() == castOther.getCodnbm()) || (this
						.getCodnbm() != null && castOther.getCodnbm() != null && this
						.getCodnbm().equals(castOther.getCodnbm())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodncm() == null ? 0 : this.getCodncm().hashCode());
		result = 37 * result
				+ (getCodnbm() == null ? 0 : this.getCodnbm().hashCode());
		return result;
	}

}
