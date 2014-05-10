package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * EqitrecmercId generated by hbm2java
 */
public class EqitrecmercId implements java.io.Serializable {

	private int ticket;
	private int coditrecmerc;
	private short codfilial;
	private int codemp;

	public EqitrecmercId() {
	}

	public EqitrecmercId(int ticket, int coditrecmerc, short codfilial,
			int codemp) {
		this.ticket = ticket;
		this.coditrecmerc = coditrecmerc;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getTicket() {
		return this.ticket;
	}

	public void setTicket(int ticket) {
		this.ticket = ticket;
	}

	public int getCoditrecmerc() {
		return this.coditrecmerc;
	}

	public void setCoditrecmerc(int coditrecmerc) {
		this.coditrecmerc = coditrecmerc;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EqitrecmercId))
			return false;
		EqitrecmercId castOther = (EqitrecmercId) other;

		return (this.getTicket() == castOther.getTicket())
				&& (this.getCoditrecmerc() == castOther.getCoditrecmerc())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getTicket();
		result = 37 * result + this.getCoditrecmerc();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
