package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EqitrecmercserieId generated by hbm2java
 */
@Embeddable
public class EqitrecmercserieId implements java.io.Serializable {

	private int ticket;
	private int coditrecmerc;
	private int seqitserie;
	private short codfilial;
	private int codemp;

	public EqitrecmercserieId() {
	}

	public EqitrecmercserieId(int ticket, int coditrecmerc, int seqitserie,
			short codfilial, int codemp) {
		this.ticket = ticket;
		this.coditrecmerc = coditrecmerc;
		this.seqitserie = seqitserie;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "TICKET", nullable = false)
	public int getTicket() {
		return this.ticket;
	}

	public void setTicket(int ticket) {
		this.ticket = ticket;
	}

	@Column(name = "CODITRECMERC", nullable = false)
	public int getCoditrecmerc() {
		return this.coditrecmerc;
	}

	public void setCoditrecmerc(int coditrecmerc) {
		this.coditrecmerc = coditrecmerc;
	}

	@Column(name = "SEQITSERIE", nullable = false)
	public int getSeqitserie() {
		return this.seqitserie;
	}

	public void setSeqitserie(int seqitserie) {
		this.seqitserie = seqitserie;
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
		if (!(other instanceof EqitrecmercserieId))
			return false;
		EqitrecmercserieId castOther = (EqitrecmercserieId) other;

		return (this.getTicket() == castOther.getTicket())
				&& (this.getCoditrecmerc() == castOther.getCoditrecmerc())
				&& (this.getSeqitserie() == castOther.getSeqitserie())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getTicket();
		result = 37 * result + this.getCoditrecmerc();
		result = 37 * result + this.getSeqitserie();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
