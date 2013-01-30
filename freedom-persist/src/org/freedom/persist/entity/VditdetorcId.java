package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VditdetorcId generated by hbm2java
 */
@Embeddable
public class VditdetorcId implements java.io.Serializable {

	private int codorc;
	private char tipoorc;
	private short seqdetorc;
	private short codfilial;
	private int codemp;

	public VditdetorcId() {
	}

	public VditdetorcId(int codorc, char tipoorc, short seqdetorc,
			short codfilial, int codemp) {
		this.codorc = codorc;
		this.tipoorc = tipoorc;
		this.seqdetorc = seqdetorc;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODORC", nullable = false)
	public int getCodorc() {
		return this.codorc;
	}

	public void setCodorc(int codorc) {
		this.codorc = codorc;
	}

	@Column(name = "TIPOORC", nullable = false, length = 1)
	public char getTipoorc() {
		return this.tipoorc;
	}

	public void setTipoorc(char tipoorc) {
		this.tipoorc = tipoorc;
	}

	@Column(name = "SEQDETORC", nullable = false)
	public short getSeqdetorc() {
		return this.seqdetorc;
	}

	public void setSeqdetorc(short seqdetorc) {
		this.seqdetorc = seqdetorc;
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
		if (!(other instanceof VditdetorcId))
			return false;
		VditdetorcId castOther = (VditdetorcId) other;

		return (this.getCodorc() == castOther.getCodorc())
				&& (this.getTipoorc() == castOther.getTipoorc())
				&& (this.getSeqdetorc() == castOther.getSeqdetorc())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodorc();
		result = 37 * result + this.getTipoorc();
		result = 37 * result + this.getSeqdetorc();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
